package rage.emo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rage.emo.repository.MaterialVisitRepository;
import rage.emo.repository.PostQuestionnaireRepository;
import rage.emo.repository.PreQuestionnaireRepository;

@RestController
public class DataExport {

    @Autowired
    MaterialVisitRepository materialVisitRepository;
    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;
    @Autowired
    PostQuestionnaireRepository postQuestionnaireRepository;

    @RequestMapping("/app/export")
    public Data export() {
        Data d = new Data();
        d.materialVisits = materialVisitRepository.findAll();
        d.preQuestionnaireAnswers = preQuestionnaireRepository.findAll();
        d.postQuestionnaireAnswers = postQuestionnaireRepository.findAll();
        return d;
    }
}
