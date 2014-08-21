package rage.emo.controller;

import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.PostQuestionnaire;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rage.emo.dto.MaterialVisit;
import rage.emo.repository.MaterialVisitRepository;
import rage.emo.repository.PreQuestionnaireRepository;
import rage.emo.service.MaterialTypeService;

@Controller
@RequestMapping("/app")
public class EmoController {

    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;
    
    @Autowired
    MaterialVisitRepository materialVisitRepository;

    @Autowired
    MaterialTypeService materialTypeService;

    // 1.
    @RequestMapping(value = "/submit-background", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitBackground(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PreQuestionnaire preQuestionnaire) {
        if (preQuestionnaire.getUsername().trim().isEmpty()) {
            return "redirect:/esikysely.html";
        }

        preQuestionnaire.setSiteUrl(referer);
        preQuestionnaire.setUsername(preQuestionnaire.getUsername().trim());

        String materialType = materialTypeService.getMaterialType(preQuestionnaire.isProgramDuringFreeTimeNowAndThen());
        preQuestionnaire.setAssignedMaterialType(materialType);

        preQuestionnaireRepository.save(preQuestionnaire);

        session.setAttribute("username", preQuestionnaire.getUsername());
        session.setAttribute("materialType", materialType);

        return "redirect:/app/material-1";
    }

    @RequestMapping(value = "/material-1", method = {RequestMethod.POST, RequestMethod.GET})
    public String getMaterial(HttpSession session, Model model) {
        model.addAttribute("materialType", session.getAttribute("materialType"));
        return "/WEB-INF/jsp/kommunikaatio-1.jsp";
    }

    @RequestMapping(value = "/submit-material-1-seen", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitMaterialSeen(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session, 
            @ModelAttribute MaterialVisit materialVisit) {
        materialVisit.setUsername((String) session.getAttribute("username"));
        materialVisit.setSiteUrl(referer);

        materialVisitRepository.save(materialVisit);

        return "redirect:/app/material-2";
    }
    
    
    @RequestMapping(value = "/material-2", method = {RequestMethod.POST, RequestMethod.GET})
    public String getMaterial2(HttpSession session, Model model) {
        model.addAttribute("materialType", session.getAttribute("materialType"));
        return "/WEB-INF/jsp/olio-ohjelmointi-2.jsp";
    }

    @RequestMapping(value = "/submit-material-2-seen", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitMaterial2Seen(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session, 
            @ModelAttribute MaterialVisit materialVisit) {
        materialVisit.setUsername((String) session.getAttribute("username"));
        materialVisit.setSiteUrl(referer);

        materialVisitRepository.save(materialVisit);

        return "redirect:/jalkikysely.html";
    }

    @RequestMapping(value = "/submit-postquestionnaire", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostQuestionnaire(HttpSession session, @ModelAttribute PostQuestionnaire postQuestionnaire) {
        System.out.println("TODO: tallenna jälkikysely");
        postQuestionnaire.setUsername((String) session.getAttribute("username"));
        return "redirect:/kiitos.html";
    }
}
