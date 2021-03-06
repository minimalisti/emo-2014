package rage.emo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rage.emo.repository.MaterialVisitRepository;
import rage.emo.repository.PostQuestionnaireRepository;
import rage.emo.repository.PreQuestionnaireRepository;
import rage.emo.repository.GoalOrientationRepository;

//import rage.emo.repository.PreSamQuestionnaireRepository;
import rage.emo.repository.PrePanasQuestionnaireRepository;

import rage.emo.repository.PostPanasQuestionnaireRepository;
//import rage.emo.repository.PostSamQuestionnaireRepository;

import rage.emo.repository.PreAttrakdiffQuestionnaireRepository;
import rage.emo.repository.PostAttrakdiffQuestionnaireRepository;

import rage.emo.repository.DemographicQuestionnaireRepository;

@RestController
public class DataExport {

    @Autowired
    MaterialVisitRepository materialVisitRepository;

    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;
    @Autowired
    PostQuestionnaireRepository postQuestionnaireRepository;

    @Autowired
    GoalOrientationRepository goalOrientationRepository;

    @Autowired
    PreAttrakdiffQuestionnaireRepository preAttrakdiffQuestionnaireRepository;
    @Autowired
    PostAttrakdiffQuestionnaireRepository postAttrakdiffQuestionnaireRepository;
//
//    @Autowired
//    PreSamQuestionnaireRepository preSamQuestionnaireRepository;
    @Autowired
    PrePanasQuestionnaireRepository prePanasQuestionnaireRepository;
    @Autowired
    PostPanasQuestionnaireRepository postPanasQuestionnaireRepository;
//    @Autowired
//    PostSamQuestionnaireRepository postSamQuestionnaireRepository;
    
    @Autowired
    DemographicQuestionnaireRepository demographicQuestionnaireRepository;

    @RequestMapping("/app/export")
    public Data export() {
        Data d = new Data();
        d.setMaterialVisits(materialVisitRepository.findAll());

        d.setPreQuestionnaireAnswers(preQuestionnaireRepository.findAll());
        d.setPostQuestionnaireAnswers(postQuestionnaireRepository.findAll());
        d.setGoalOrientationQuestionnairesAnswers(goalOrientationRepository.findAll());
        //d.setPostSamQuestionnaireAnswers(postSamQuestionnaireRepository.findAll());
        //d.setPreSamQuestionnaireAnswers(preSamQuestionnaireRepository.findAll());
        d.setPrePanasQuestionnaireAnswers(prePanasQuestionnaireRepository.findAll());

        d.setPostPanasQuestionnaireAnswers(postPanasQuestionnaireRepository.findAll());

        d.setPreAttrakdiffQuestionnaireAnswers(preAttrakdiffQuestionnaireRepository.findAll());
        d.setPostAttrakdiffQuestionnaireAnswers(postAttrakdiffQuestionnaireRepository.findAll());
        
        d.setDemographicQuestionnaireAnswers(demographicQuestionnaireRepository.findAll());

        return d;
    }
}
