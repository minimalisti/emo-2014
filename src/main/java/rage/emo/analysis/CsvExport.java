package rage.emo.analysis;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.inference.TestUtils;
import rage.emo.controller.Data;
import rage.emo.dto.MaterialVisit;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PreQuestionnaire;

public class CsvExport {

    public static void temp() throws Exception {
        ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
        Data data = mapper.readValue(new File("/home/avihavai/Desktop/export.json"), Data.class);

        Map<String, UserData> userData = new TreeMap<>();

        Set<String> usersToIgnore = new TreeSet<>();

        for (PreQuestionnaire preQuestionnaire : data.getPreQuestionnaireAnswers()) {
            if (preQuestionnaire.getUsername() == null || preQuestionnaire.getUsername().trim().isEmpty()) {
                continue;
            }

            String username = preQuestionnaire.getUsername();
            if (!userData.containsKey(preQuestionnaire.getUsername())) {
                userData.put(username, new UserData());
            } else {
                usersToIgnore.add(username);
            }

            userData.get(username).preQuesitionnaire = preQuestionnaire;
        }

        Set<String> usersToRetain = new TreeSet<>();
        for (PostQuestionnaire postQuestionnaire : data.getPostQuestionnaireAnswers()) {
            if (postQuestionnaire.getUsername() == null || postQuestionnaire.getUsername().trim().isEmpty()) {
                continue;
            }

            String username = postQuestionnaire.getUsername();
            usersToRetain.add(username);
            userData.get(username).postQuesitionnaire = postQuestionnaire;
        }

//        System.out.println(usersToRetain);
        userData.keySet().removeAll(usersToIgnore);

        for (MaterialVisit materialVisit : data.getMaterialVisits()) {
            if (materialVisit.getUsername() == null || materialVisit.getUsername().trim().isEmpty()) {
                continue;
            }

            if (materialVisit.getVisitStarted() == null || materialVisit.getVisitEnded() == null) {
                continue;
            }

            if (usersToIgnore.contains(materialVisit.getUsername())) {
                continue;
            }

            if (userData.get(materialVisit.getUsername()).materialVisits == null) {
                userData.get(materialVisit.getUsername()).materialVisits = new ArrayList<>();
            }

            userData.get(materialVisit.getUsername()).materialVisits.add(materialVisit);

            // kicking out students who visit sites multiple times
//            if (userData.get(materialVisit.getUsername()).materialVisits.size() > 25) {
//                usersToIgnore.add(materialVisit.getUsername());
//            }
        }

        userData.keySet().removeAll(usersToIgnore);
        usersToIgnore.clear();

        for (String user : userData.keySet()) {
            UserData ud = userData.get(user);
            if (ud.preQuesitionnaire == null || ud.postQuesitionnaire == null) {
                usersToIgnore.add(user);
                continue;
            }

            Date start = ud.preQuesitionnaire.getVisitEnded();
            Date end = ud.postQuesitionnaire.getVisitStarted();

            if (start == null || end == null) {
                usersToIgnore.add(user);
                continue;
            }

            // have students spend at least 2 minutes on material
            if (end.getTime() - start.getTime() < 120000L) {
                usersToIgnore.add(user);
            }
        }

        System.out.println(usersToIgnore);

        userData.keySet().removeAll(usersToIgnore);

        for (String name : new HashSet<>(userData.keySet())) {
            if (name.toLowerCase().contains("test")) {
                userData.remove(name);
            }
        }

        userData.keySet().retainAll(usersToRetain);
        userData.keySet().remove("TEST");
        userData.keySet().remove("TESTTEST");
        userData.keySet().remove("arto paniikkitestaa");
        userData.keySet().remove("12345-arto");
        System.out.println(userData.keySet().size());

        PrintWriter pw = new PrintWriter("prequestionnaires.csv");

        for (String user : userData.keySet()) {
            pw.println(userData.get(user).preQuesitionnaire);
        }
        pw.flush();
        pw.close();

        pw = new PrintWriter("postquestionnaires.csv");

        for (String user : userData.keySet()) {
            pw.println(userData.get(user).postQuesitionnaire);
        }
        pw.flush();
        pw.close();

        pw = new PrintWriter("materialvisits.csv");
        for (String user : userData.keySet()) {
            List<MaterialVisit> visits = userData.get(user).materialVisits;
            Collections.sort(visits);

            for (MaterialVisit materialVisit : visits) {
                pw.println(materialVisit);
            }
        }

        pw.flush();
        pw.close();

        pw = new PrintWriter("pre-and-post.csv");
        for (String user : userData.keySet()) {
            Date preEnd = userData.get(user).preQuesitionnaire.getVisitEnded();
            Date postStart = userData.get(user).postQuesitionnaire.getVisitStarted();

            long diff = (postStart.getTime() - preEnd.getTime()) / 1000;
            String username = user;
            String materialType = userData.get(user).preQuesitionnaire.getAssignedMaterialType();

            pw.println(username + ";" + materialType + ";" + diff + ";" + userData.get(user).preQuesitionnaire.dataString() + ";" + userData.get(user).postQuesitionnaire.dataString());

        }

        pw.flush();
        pw.close();

        Map<String, DescriptiveStatistics> usrStats = new TreeMap<>();
        for (UserData ud : userData.values()) {
            if (ud.preQuesitionnaire.isHasProgrammedInThePast()) {
                continue;
            }

            String materialType = ud.preQuesitionnaire.getAssignedMaterialType();
            if (!usrStats.containsKey(materialType)) {
                usrStats.put(materialType, new DescriptiveStatistics());
            }

            String val = ud.postQuesitionnaire.getMiellyttavyys(); // getKuvitusMiellytti();           

            if (val == null) { //  || val.equals("3")
                continue;
            }

            usrStats.get(materialType).addValue(Double.parseDouble(val));
        }

        System.out.println("FOOO");
        for (String materialType : usrStats.keySet()) {
            System.out.println("  " + materialType);
            System.out.println(usrStats.get(materialType));
        }
        System.out.println("---- t-test");

        System.out.println(TestUtils.tTest(usrStats.get("trad"), usrStats.get("emo")));

        System.out.println("---- ANOVA");

        List classes = new ArrayList();
        classes.add(usrStats.get("trad").getValues());
        classes.add(usrStats.get("emo").getValues());
        System.out.println(TestUtils.oneWayAnovaPValue(classes));

    }

    static class UserData {

        PreQuestionnaire preQuesitionnaire;
        PostQuestionnaire postQuesitionnaire;
        List<MaterialVisit> materialVisits;
    }
}
