package rage.emo.controller;

import java.util.List;
import rage.emo.dto.MaterialVisit;
import rage.emo.dto.PreQuestionnaire;

public class Data {

    public List<MaterialVisit> materialVisits;
    public List<PreQuestionnaire> preQuestionnaireAnswers;

    public List<MaterialVisit> getMaterialVisits() {
        return materialVisits;
    }

    public void setMaterialVisits(List<MaterialVisit> materialVisits) {
        this.materialVisits = materialVisits;
    }

    public List<PreQuestionnaire> getPreQuestionnaireAnswers() {
        return preQuestionnaireAnswers;
    }

    public void setPreQuestionnaireAnswers(List<PreQuestionnaire> preQuestionnaireAnswers) {
        this.preQuestionnaireAnswers = preQuestionnaireAnswers;
    }

}
