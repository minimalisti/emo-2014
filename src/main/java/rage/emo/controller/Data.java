package rage.emo.controller;

import java.util.List;
import rage.emo.dto.MaterialVisit;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.GoalOrientationQuestionnaire;

import rage.emo.dto.PrePanasQuestionnaire;
import rage.emo.dto.PostPanasQuestionnaire;

import rage.emo.dto.PreAttrakdiffQuestionnaire;
import rage.emo.dto.PostAttrakdiffQuestionnaire;

import rage.emo.dto.DemographicQuestionnaire;

public class Data {

    private List<MaterialVisit> materialVisits;

    private List<PreQuestionnaire> preQuestionnaireAnswers;
    private List<PostQuestionnaire> postQuestionnaireAnswers;

    private List<GoalOrientationQuestionnaire> goalOrientationQuestionnairesAnswers;

    private List<PrePanasQuestionnaire> prePanasQuestionnaireAnswers;
    private List<PostPanasQuestionnaire> postPanasQuestionnaireAnswers;

    private List<PreAttrakdiffQuestionnaire> preAttrakdiffQuestionnaireAnswers;
    private List<PostAttrakdiffQuestionnaire> postAttrakdiffQuestionnaireAnswers;
    
    private List<DemographicQuestionnaire> demographicQuestionnaireAnswers;

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
     * @return the prePanasQuestionnaireAnswers
     */
    public List<PrePanasQuestionnaire> getPrePanasQuestionnaireAnswers() {
        return prePanasQuestionnaireAnswers;
    }

    /**
     * @param prePanasQuestionnaireAnswers the prePanasQuestionnaireAnswers to set
     */
    public void setPrePanasQuestionnaireAnswers(List<PrePanasQuestionnaire> prePanasQuestionnaireAnswers) {
        this.prePanasQuestionnaireAnswers = prePanasQuestionnaireAnswers;
    }

    /**
     * @return the postPanasQuestionnaireAnswers
     */
    public List<PostPanasQuestionnaire> getPostPanasQuestionnaireAnswers() {
        return postPanasQuestionnaireAnswers;
    }

    /**
     * @param postPanasQuestionnaireAnswers the postPanasQuestionnaireAnswers to set
     */
    public void setPostPanasQuestionnaireAnswers(List<PostPanasQuestionnaire> postPanasQuestionnaireAnswers) {
        this.postPanasQuestionnaireAnswers = postPanasQuestionnaireAnswers;
    }

    /**
     * @return the preAttrakdiffQuestionnaireAnswers
     */
    public List<PreAttrakdiffQuestionnaire> getPreAttrakdiffQuestionnaireAnswers() {
        return preAttrakdiffQuestionnaireAnswers;
    }

    /**
     * @param preAttrakdiffQuestionnaireAnswers the preAttrakdiffQuestionnaireAnswers to set
     */
    public void setPreAttrakdiffQuestionnaireAnswers(List<PreAttrakdiffQuestionnaire> preAttrakdiffQuestionnaireAnswers) {
        this.preAttrakdiffQuestionnaireAnswers = preAttrakdiffQuestionnaireAnswers;
    }

    /**
     * @return the postAttrakdiffQuestionnaireAnswers
     */
    public List<PostAttrakdiffQuestionnaire> getPostAttrakdiffQuestionnaireAnswers() {
        return postAttrakdiffQuestionnaireAnswers;
    }

    /**
     * @param postAttrakdiffQuestionnaireAnswers the postAttrakdiffQuestionnaireAnswers to set
     */
    public void setPostAttrakdiffQuestionnaireAnswers(List<PostAttrakdiffQuestionnaire> postAttrakdiffQuestionnaireAnswers) {
        this.postAttrakdiffQuestionnaireAnswers = postAttrakdiffQuestionnaireAnswers;
    }

    /**
     * @return the demographicQuestionnaireAnswers
     */
    public List<DemographicQuestionnaire> getDemographicQuestionnaireAnswers() {
        return demographicQuestionnaireAnswers;
    }

    /**
     * @param demographicQuestionnaireAnswers the demographicQuestionnaireAnswers to set
     */
    public void setDemographicQuestionnaireAnswers(List<DemographicQuestionnaire> demographicQuestionnaireAnswers) {
        this.demographicQuestionnaireAnswers = demographicQuestionnaireAnswers;
    }

    
}
