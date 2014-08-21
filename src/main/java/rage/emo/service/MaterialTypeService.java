package rage.emo.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.repository.PreQuestionnaireRepository;

@Service
public class MaterialTypeService {

    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;

    public String getMaterialType(Boolean currentDoesProgram) {
        if (currentDoesProgram == null) {
            currentDoesProgram = false;
        }

        Map<Boolean, Map<String, Integer>> programHabitCount = new HashMap<>();
        programHabitCount.put(Boolean.FALSE, new HashMap<String, Integer>());
        programHabitCount.put(Boolean.TRUE, new HashMap<String, Integer>());

        for (String str : Arrays.asList("trad", "emo")) {
            programHabitCount.get(Boolean.FALSE).put(str, 0);
            programHabitCount.get(Boolean.TRUE).put(str, 0);
        }

        for (PreQuestionnaire preQuestionnaire : preQuestionnaireRepository.findAll()) {
            Boolean doesProgram = preQuestionnaire.isProgramDuringFreeTimeNowAndThen();
            if (doesProgram == null) {
                doesProgram = false;
            }

            String type = preQuestionnaire.getAssignedMaterialType();
            programHabitCount.get(doesProgram).put(type, programHabitCount.get(doesProgram).get(type) + 1);
        }

        if (programHabitCount.get(currentDoesProgram).get("emo")
                > programHabitCount.get(currentDoesProgram).get("trad")) {
            return "trad";
        }

        return "emo";
    }
}
