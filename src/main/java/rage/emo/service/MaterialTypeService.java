package rage.emo.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rage.emo.dto.Login;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.repository.PreQuestionnaireRepository;

@Service
public class MaterialTypeService {

    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;

    public String getMaterialType(Login login) {
        if (login == null) {
            return "trad";
        }

        //TODO: no more fancy balancing of the buckets
        // TODO: seems to be done. :P
        if ((login.getUsername().trim().hashCode() % 2) == 0) {
            return "trad";
        } else {
            return "emo";
        }
    }

    public String getMaterialType(PreQuestionnaire preQuestionnaire) {
        if (preQuestionnaire == null) {
            return "trad";
        }

        if (!preQuestionnaire.isHasProgrammedInThePast().equals("En ollenkaan") && preQuestionnaire.isHasProgrammedInThePast() != null) {
            // ei ole ohjelmoinut
            Map<String, Integer> counts = new TreeMap<>();
            counts.put("emo", 0);
            counts.put("trad", 0);
            
            for (PreQuestionnaire pq : preQuestionnaireRepository.findAll()) {
                
                String type = pq.getAssignedMaterialType();
                if (!counts.containsKey(type)) {
                    counts.put(type, 0);
                }
                
                counts.put(type, counts.get(type) + 1);
            }
            
            if (counts.get("emo") > counts.get("trad")) {
                return "trad";
            }
            
            return "emo";
            
        } else {
            // on ohjelmoinut

            Map<String, Map<String, Integer>> objectOrientedProg = new HashMap<>();
            objectOrientedProg.put("En ollenkaan", new HashMap<String, Integer>());
            objectOrientedProg.put("Ohjelmoinut", new HashMap<String, Integer>());

            for (String str : Arrays.asList("trad", "emo")) {
                objectOrientedProg.get("En ollenkaan").put(str, 0);
                objectOrientedProg.get("Ohjelmoinut").put(str, 0);
            }

            for (PreQuestionnaire pq : preQuestionnaireRepository.findAll()) {
                String doesOoProgram = pq.isHasOoProgrammedInThePast();
                if (doesOoProgram == null) {
                    doesOoProgram = "En ollenkaan";
                }

                String type = pq.getAssignedMaterialType();
                objectOrientedProg.get(doesOoProgram).put(type, objectOrientedProg.get(doesOoProgram).get(type) + 1);
            }

            if (preQuestionnaire.isHasOoProgrammedInThePast() == null) {
                preQuestionnaire.setHasOoProgrammedInThePast("En ollenkaan");
            }

            if (objectOrientedProg.get(preQuestionnaire.isHasOoProgrammedInThePast()).get("emo")
                    > objectOrientedProg.get(preQuestionnaire.isHasOoProgrammedInThePast()).get("trad")) {
                return "trad";
            }
            
            return "emo";
            
        }
    }
}
