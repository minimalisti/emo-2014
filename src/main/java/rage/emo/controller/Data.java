package rage.emo.controller;

import java.util.List;
import rage.emo.dto.MaterialVisit;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.GoalOrientationQuestionnaire;
import rage.emo.dto.SamQuestionnaire;
import rage.emo.dto.PanasQuestionnaire;

public class Data {

    private List<MaterialVisit> materialVisits;
    
    private List<PreQuestionnaire> preQuestionnaireAnswers;
    private List<PostQuestionnaire> postQuestionnaireAnswers;
    private List<GoalOrientationQuestionnaire> goalOrientationQuestionnairesAnswers;
    
    private List<SamQuestionnaire> preSamQuestionnaireAnswers;
    private List<PanasQuestionnaire> prePanasQuestionnaireAnswers;
    
    private List<SamQuestionnaire> postSamQuestionnaireAnswers;
    private List<PanasQuestionnaire> postPanasQuestionnaireAnswers;

    /**
     * @return the materialVisits
     */
    public List<MaterialVisit> getMaterialVisits() {
        return materialVisits;
    }

    /**
     * @param materialVisits the materialVisits to set
     */
    public void setMaterialVisits(List<MaterialVisit> materialVisits) {
        this.materialVisits = materialVisits;
    }

    /**
     * @return the preQuestionnaireAnswers
     */
    public List<PreQuestionnaire> getPreQuestionnaireAnswers() {
        return preQuestionnaireAnswers;
    }

    /**
     * @param preQuestionnaireAnswers the preQuestionnaireAnswers to set
     */
    public void setPreQuestionnaireAnswers(List<PreQuestionnaire> preQuestionnaireAnswers) {
        this.preQuestionnaireAnswers = preQuestionnaireAnswers;
    }

    /**
     * @return the postQuestionnaireAnswers
     */
    public List<PostQuestionnaire> getPostQuestionnaireAnswers() {
        return postQuestionnaireAnswers;
    }

    /**
     * @param postQuestionnaireAnswers the postQuestionnaireAnswers to set
     */
    public void setPostQuestionnaireAnswers(List<PostQuestionnaire> postQuestionnaireAnswers) {
        this.postQuestionnaireAnswers = postQuestionnaireAnswers;
    }

    /**
     * @return the goalOrientationQuestionnairesAnswers
     */
    public List<GoalOrientationQuestionnaire> getGoalOrientationQuestionnairesAnswers() {
        return goalOrientationQuestionnairesAnswers;
    }

    /**
     * @param goalOrientationQuestionnairesAnswers the goalOrientationQuestionnairesAnswers to set
     */
    public void setGoalOrientationQuestionnairesAnswers(List<GoalOrientationQuestionnaire> goalOrientationQuestionnairesAnswers) {
        this.goalOrientationQuestionnairesAnswers = goalOrientationQuestionnairesAnswers;
    }

    /**
     * @return the preSamQuestionnaireAnswers
     */
    public List<SamQuestionnaire> getPreSamQuestionnaireAnswers() {
        return preSamQuestionnaireAnswers;
    }

    /**
     * @param preSamQuestionnaireAnswers the preSamQuestionnaireAnswers to set
     */
    public void setPreSamQuestionnaireAnswers(List<SamQuestionnaire> preSamQuestionnaireAnswers) {
        this.preSamQuestionnaireAnswers = preSamQuestionnaireAnswers;
    }

    /**
     * @return the prePanasQuestionnaireAnswers
     */
    public List<PanasQuestionnaire> getPrePanasQuestionnaireAnswers() {
        return prePanasQuestionnaireAnswers;
    }

    /**
     * @param prePanasQuestionnaireAnswers the prePanasQuestionnaireAnswers to set
     */
    public void setPrePanasQuestionnaireAnswers(List<PanasQuestionnaire> prePanasQuestionnaireAnswers) {
        this.prePanasQuestionnaireAnswers = prePanasQuestionnaireAnswers;
    }

    /**
     * @return the postSamQuestionnaireAnswers
     */
    public List<SamQuestionnaire> getPostSamQuestionnaireAnswers() {
        return postSamQuestionnaireAnswers;
    }

    /**
     * @param postSamQuestionnaireAnswers the postSamQuestionnaireAnswers to set
     */
    public void setPostSamQuestionnaireAnswers(List<SamQuestionnaire> postSamQuestionnaireAnswers) {
        this.postSamQuestionnaireAnswers = postSamQuestionnaireAnswers;
    }

    /**
     * @return the postPanasQuestionnaireAnswers
     */
    public List<PanasQuestionnaire> getPostPanasQuestionnaireAnswers() {
        return postPanasQuestionnaireAnswers;
    }

    /**
     * @param postPanasQuestionnaireAnswers the postPanasQuestionnaireAnswers to set
     */
    public void setPostPanasQuestionnaireAnswers(List<PanasQuestionnaire> postPanasQuestionnaireAnswers) {
        this.postPanasQuestionnaireAnswers = postPanasQuestionnaireAnswers;
    }

    
}