package rage.emo.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import rage.emo.dto.Login;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.PostQuestionnaire;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rage.emo.dto.MaterialVisit;
import rage.emo.repository.LoginRepository;
import rage.emo.repository.MaterialVisitRepository;
import rage.emo.repository.PostQuestionnaireRepository;
import rage.emo.repository.PreQuestionnaireRepository;
import rage.emo.service.MaterialTypeService;

@Controller
@RequestMapping("/app")
public class EmoController {
    
	private static Set<String> usersWhiteList = 
			new HashSet<String>(Arrays.asList("Essi", "Petri", "Lassi", "Arto"));
	
    @Autowired
    LoginRepository loginRepository;
	
    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;
    
    @Autowired
    PostQuestionnaireRepository postQuestionnaireRepository;
    
    @Autowired
    MaterialVisitRepository materialVisitRepository;
    
    @Autowired
    MaterialTypeService materialTypeService;
    
    @RequestMapping(value = "/submit-background", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitBackground(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PreQuestionnaire preQuestionnaire) {
    	
        
        preQuestionnaire.setSiteUrl(referer);
        preQuestionnaire.setUsername((String) session.getAttribute("username"));
        preQuestionnaire.setUsername((String) session.getAttribute("materialtype"));
        
        // TODO: Set material type only if not already set (in login)
        //String materialType = materialTypeService.getMaterialType(preQuestionnaire);
        //preQuestionnaire.setAssignedMaterialType(materialType);
        
        preQuestionnaireRepository.save(preQuestionnaire);
        

        
        return "redirect:/app/material-1";
    }
    
    @RequestMapping(value = "/submit-login", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitLogin(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute Login login) {
    	
        if (login.getUsername().trim().isEmpty() || 
        		usersWhiteList.contains(login.getUsername().trim()) ) {
            login.setSiteUrl(referer);
            login.setUsername(login.getUsername().trim());
            
            String materialType = materialTypeService.getMaterialType(login);
            login.setAssignedMaterialType(materialType);
            session.setAttribute("username", login.getUsername());
            session.setAttribute("materialType", materialType);
            loginRepository.save(login);
          
            if (preQuestionnaireRepository.findByUsername(login.getUsername()).isEmpty()) {
            	return "redirect:/esikysely.html";
            } else {
            	return "redirect:/app/material-1";
      
            }
        } else {
        	return "redirect:/index.html"; 
        	//TODO: kuinka lomakkeeseen tehdään viesti virheellisestä syötteestä - GET-parametrit vai muuta?
        }
    }
    
    @RequestMapping("/material-{id}")
    public String getMaterial(HttpSession session, Model model, @PathVariable Integer id) {
        model.addAttribute("materialType", session.getAttribute("materialType"));
        model.addAttribute("materialId", id);
        return "/WEB-INF/jsp/" + id + ".jsp";
    }
    
    @RequestMapping(value = "/submit-material-{id}-seen", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitMaterialSeen(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute MaterialVisit materialVisit,
            @PathVariable Integer id) {
        
        materialVisit.setUsername((String) session.getAttribute("username"));
        materialVisit.setAssignedMaterialType((String) session.getAttribute("materialType"));
        materialVisit.setSiteUrl(referer);
        
        materialVisitRepository.save(materialVisit);
        
        if (id >= 21) {
            return "redirect:/jalkikysely.html";
        }
        
        return "redirect:/app/material-" + (id + 1);
    }
    
    @RequestMapping(value = "/submit-material-{id}-seen-back", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitMaterialSeenBack(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute MaterialVisit materialVisit,
            @PathVariable Integer id) {
        
        materialVisit.setUsername((String) session.getAttribute("username"));
        materialVisit.setSiteUrl(referer);
        
        materialVisitRepository.save(materialVisit);
        
        if (id == 1) {
            return "redirect:/app/material-1";
        }
        
        return "redirect:/app/material-" + (id - 1);
    }
    
    @RequestMapping(value = "/submit-postquestionnaire", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostQuestionnaire(HttpSession session, @ModelAttribute PostQuestionnaire postQuestionnaire) {
        postQuestionnaire.setUsername((String) session.getAttribute("username"));
        postQuestionnaire.setAssignedMaterialType((String) session.getAttribute("materialType"));
        postQuestionnaireRepository.save(postQuestionnaire);
        return "redirect:/kiitos.html";
    }
}
