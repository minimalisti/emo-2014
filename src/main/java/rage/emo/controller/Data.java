package rage.emo.controller;

import java.util.List;
import rage.emo.dto.MaterialVisit;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PreQuestionnaire;

public class Data {

    public List<MaterialVisit> materialVisits;
    public List<PreQuestionnaire> preQuestionnaireAnswers;
    public List<PostQuestionnaire> postQuestionnaireAnswers;

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

    public List<PostQuestionnaire> getPostQuestionnaireAnswers() {
        return postQuestionnaireAnswers;
    }

    public void setPostQuestionnaireAnswers(List<PostQuestionnaire> postQuestionnaireAnswers) {
        this.postQuestionnaireAnswers = postQuestionnaireAnswers;
    }
}
