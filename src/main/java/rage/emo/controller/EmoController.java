package rage.emo.controller;

import java.util.HashSet;
import java.util.Set;

import rage.emo.dto.Login;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.GoalOrientationQuestionnaire;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PrePanasQuestionnaire;
import rage.emo.dto.PostPanasQuestionnaire;
import rage.emo.dto.PreAttrakdiffQuestionnaire;
import rage.emo.dto.PostAttrakdiffQuestionnaire;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rage.emo.dto.DemographicQuestionnaire;

import rage.emo.dto.MaterialVisit;
//import rage.emo.dto.PostSamQuestionnaire;
//import rage.emo.dto.PreSamQuestionnaire;
import rage.emo.repository.LoginRepository;
import rage.emo.repository.MaterialVisitRepository;
import rage.emo.repository.PostQuestionnaireRepository;
import rage.emo.repository.GoalOrientationRepository;
import rage.emo.repository.PreQuestionnaireRepository;

//import rage.emo.repository.PreSamQuestionnaireRepository;
import rage.emo.repository.PrePanasQuestionnaireRepository;

import rage.emo.repository.PostPanasQuestionnaireRepository;
//import rage.emo.repository.PostSamQuestionnaireRepository;

import rage.emo.repository.PreAttrakdiffQuestionnaireRepository;
import rage.emo.repository.PostAttrakdiffQuestionnaireRepository;

import rage.emo.repository.DemographicQuestionnaireRepository;

import rage.emo.service.MaterialTypeService;

@Controller
@RequestMapping("/app")
public class EmoController {

    private static final Set<String> USER_WHITE_LIST
            = new HashSet<String>() {
                {
                    // USER_WHITE_LIST. Now with TUT 2015 student numbers!
                    String s = "Heli\n"
                    + "Petri\n"
                    + "Mikko\n"
					+´"testi-jamppa1\n"
					+´"testi-jamppa2\n"
					+´"testi-jamppa3\n"
					+´"testi-jamppa4\n"
					+´"testi-jamppa5\n"
					+´"testi-jamppa6\n"
					+´"testi-jamppa7\n"
					+´"testi-jamppa8\n"
					+´"testi-jamppa9\n"
					+´"testi-jamppa10\n"
					+´"testi-jamppa11\n"
					+´"testi-jamppa12\n"
                    + "159253\n"
                    + "167143\n"
                    + "167581\n"
                    + "177894\n"
                    + "182488\n"
                    + "193988\n"
                    + "194719\n"
                    + "199203\n"
                    + "202865\n"
                    + "203310\n"
                    + "205023\n"
                    + "205419\n"
                    + "211746\n"
                    + "211854\n"
                    + "211950\n"
                    + "212001\n"
                    + "212108\n"
                    + "212125\n"
                    + "212187\n"
                    + "214689\n"
                    + "218057\n"
                    + "218198\n"
                    + "218677\n"
                    + "218950\n"
                    + "219052\n"
                    + "224549\n"
                    + "224554\n"
                    + "224683\n"
                    + "224724\n"
                    + "224726\n"
                    + "224888\n"
                    + "225139\n"
                    + "225349\n"
                    + "225438\n"
                    + "225936\n"
                    + "226016\n"
                    + "228790\n"
                    + "228821\n"
                    + "228839\n"
                    + "228889\n"
                    + "228896\n"
                    + "228907\n"
                    + "228908\n"
                    + "228921\n"
                    + "228961\n"
                    + "228984\n"
                    + "229018\n"
                    + "229033\n"
                    + "229051\n"
                    + "229064\n"
                    + "229228\n"
                    + "229324\n"
                    + "229347\n"
                    + "229387\n"
                    + "229442\n"
                    + "229444\n"
                    + "229553\n"
                    + "229589\n"
                    + "229633\n"
                    + "229660\n"
                    + "229725\n"
                    + "229758\n"
                    + "230540\n"
                    + "230902\n"
                    + "233558\n"
                    + "233654\n"
                    + "233655\n"
                    + "233675\n"
                    + "233738\n"
                    + "233756\n"
                    + "233791\n"
                    + "233814\n"
                    + "233848\n"
                    + "233867\n"
                    + "233879\n"
                    + "233935\n"
                    + "233939\n"
                    + "233942\n"
                    + "233988\n"
                    + "234044\n"
                    + "234056\n"
                    + "234082\n"
                    + "234120\n"
                    + "234223\n"
                    + "234228\n"
                    + "234255\n"
                    + "234274\n"
                    + "234276\n"
                    + "234292\n"
                    + "234332\n"
                    + "234345\n"
                    + "234352\n"
                    + "234354\n"
                    + "234375\n"
                    + "235622\n"
                    + "235645\n"
                    + "235702\n"
                    + "237400\n"
                    + "239807\n"
                    + "239841\n"
                    + "239845\n"
                    + "239846\n"
                    + "239863\n"
                    + "239866\n"
                    + "239875\n"
                    + "239885\n"
                    + "239907\n"
                    + "239908\n"
                    + "239922\n"
                    + "239929\n"
                    + "239948\n"
                    + "239973\n"
                    + "239975\n"
                    + "239986\n"
                    + "239990\n"
                    + "239993\n"
                    + "239996\n"
                    + "240015\n"
                    + "240017\n"
                    + "240053\n"
                    + "240057\n"
                    + "240058\n"
                    + "240080\n"
                    + "240090\n"
                    + "240103\n"
                    + "240123\n"
                    + "240124\n"
                    + "240125\n"
                    + "240142\n"
                    + "240170\n"
                    + "240184\n"
                    + "240219\n"
                    + "240229\n"
                    + "240235\n"
                    + "240243\n"
                    + "240244\n"
                    + "240257\n"
                    + "240258\n"
                    + "240283\n"
                    + "240290\n"
                    + "240294\n"
                    + "240308\n"
                    + "240315\n"
                    + "240317\n"
                    + "240328\n"
                    + "240381\n"
                    + "240390\n"
                    + "240398\n"
                    + "240414\n"
                    + "240417\n"
                    + "240435\n"
                    + "240436\n"
                    + "240444\n"
                    + "240446\n"
                    + "240458\n"
                    + "240462\n"
                    + "240483\n"
                    + "240486\n"
                    + "240503\n"
                    + "240506\n"
                    + "240513\n"
                    + "240522\n"
                    + "240526\n"
                    + "240527\n"
                    + "240566\n"
                    + "240567\n"
                    + "240570\n"
                    + "240571\n"
                    + "240572\n"
                    + "240576\n"
                    + "240580\n"
                    + "240585\n"
                    + "240600\n"
                    + "240607\n"
                    + "240609\n"
                    + "240615\n"
                    + "240978\n"
                    + "241261\n"
                    + "241262\n"
                    + "241325\n"
                    + "241444\n"
                    + "241821\n"
                    + "241940\n"
                    + "242020\n"
                    + "242320\n"
                    + "243500\n"
                    + "243680\n"
                    + "243822\n"
                    + "243842\n"
                    + "245565\n"
                    + "245570\n"
                    + "245578\n"
                    + "245583\n"
                    + "245585\n"
                    + "245593\n"
                    + "245599\n"
                    + "245609\n"
                    + "245621\n"
                    + "245624\n"
                    + "245640\n"
                    + "245643\n"
                    + "245644\n"
                    + "245699\n"
                    + "245750\n"
                    + "245752\n"
                    + "245762\n"
                    + "245769\n"
                    + "245770\n"
                    + "245772\n"
                    + "245774\n"
                    + "245813\n"
                    + "245834\n"
                    + "245838\n"
                    + "245855\n"
                    + "245870\n"
                    + "245873\n"
                    + "245877\n"
                    + "245884\n"
                    + "245898\n"
                    + "245903\n"
                    + "245904\n"
                    + "245911\n"
                    + "245941\n"
                    + "245951\n"
                    + "245961\n"
                    + "245969\n"
                    + "245983\n"
                    + "245986\n"
                    + "245996\n"
                    + "245998\n"
                    + "246019\n"
                    + "246028\n"
                    + "246037\n"
                    + "246060\n"
                    + "246061\n"
                    + "246069\n"
                    + "246072\n"
                    + "246081\n"
                    + "246086\n"
                    + "246122\n"
                    + "246137\n"
                    + "246141\n"
                    + "246161\n"
                    + "246190\n"
                    + "246198\n"
                    + "246202\n"
                    + "246204\n"
                    + "246212\n"
                    + "246218\n"
                    + "246226\n"
                    + "246228\n"
                    + "246230\n"
                    + "246244\n"
                    + "246260\n"
                    + "246269\n"
                    + "246281\n"
                    + "246284\n"
                    + "246292\n"
                    + "246295\n"
                    + "246297\n"
                    + "246310\n"
                    + "246312\n"
                    + "246313\n"
                    + "246316\n"
                    + "246319\n"
                    + "246321\n"
                    + "246341\n"
                    + "246351\n"
                    + "246374\n"
                    + "246376\n"
                    + "246382\n"
                    + "246412\n"
                    + "246422\n"
                    + "246423\n"
                    + "246436\n"
                    + "246444\n"
                    + "246464\n"
                    + "246467\n"
                    + "246471\n"
                    + "246474\n"
                    + "246482\n"
                    + "246490\n"
                    + "246494\n"
                    + "246497\n"
                    + "246521\n"
                    + "247361\n"
                    + "247585\n"
                    + "247586\n"
                    + "247621\n"
                    + "247820\n"
                    + "248000\n"
                    + "248080\n"
                    + "250340\n"
                    + "252761\n"
                    + "252827\n"
                    + "252830\n"
                    + "252900\n"
                    + "252918\n"
                    + "253039\n"
                    + "253226\n"
                    + "253404\n"
                    + "253626\n"
                    + "253630\n"
                    + "253761\n"
                    + "253781\n"
                    + "253840\n"
                    + "253940\n"
                    + "254820\n"
                    + "254903\n"
                    + "254983\n"
                    + "255402\n"
                    + "255541\n"
                    + "255703\n"
                    + "255800\n"
                    + "256664\n"
                    + "256805\n"
                    + "256924\n"
                    + "256980\n"
                    + "257321";

                    for (String u : s.split("\\s+")) {
                        add(u.trim().toLowerCase());
                    }
                }
            };

    private final String MATERIAL_TYPE = "materialType";

    @Autowired
    LoginRepository loginRepository;

    @Autowired
    PreQuestionnaireRepository preQuestionnaireRepository;

    // GoalOrientationRepository added for TTY survey.
    @Autowired
    GoalOrientationRepository goalOrientationRepository;

//    // PreSamQuestionnaireRepository added for TTY survey.
//    @Autowired
//    PreSamQuestionnaireRepository preSamQuestionnaireRepository;
    @Autowired
    PrePanasQuestionnaireRepository prePanasQuestionnaireRepository;
    @Autowired
    PostPanasQuestionnaireRepository postPanasQuestionnaireRepository;

    @Autowired
    PostQuestionnaireRepository postQuestionnaireRepository;

    @Autowired
    PreAttrakdiffQuestionnaireRepository preAttrakdiffQuestionnaireRepository;
    @Autowired
    PostAttrakdiffQuestionnaireRepository postAttrakdiffQuestionnaireRepository;

    @Autowired
    DemographicQuestionnaireRepository demographicQuestionnaireRepository;

//    @Autowired
//    PostSamQuestionnaireRepository postSamQuestionnaireRepository;
    @Autowired
    MaterialVisitRepository materialVisitRepository;

    @Autowired
    MaterialTypeService materialTypeService;

    // A mystery function. Don't remove, just to be safe. :-)
    @RequestMapping(value = "/start/{opnro}", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitBackground(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @PathVariable String opnro) {

        session.setAttribute("username", opnro);

        return "redirect:/esikysely.html?o=" + opnro;
    }

    // Login and student number check.
    @RequestMapping(value = "/submit-login", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitLogin(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute Login login) {

        if (USER_WHITE_LIST.contains(login.getUsername().trim().toLowerCase())) {
            login.setSiteUrl(referer);
            login.setUsername(login.getUsername().trim());

            String materialType = materialTypeService.getMaterialType(login);
            login.setAssignedMaterialType(materialType);
            session.setAttribute("username", login.getUsername());
            session.setAttribute(MATERIAL_TYPE, materialType);
            login = loginRepository.save(login);

            if (preQuestionnaireRepository.findByUsername(login.getUsername()).isEmpty()) {
                return "redirect:/demografia-kysely.html";
                //return "redirect:/pre-attrakdiff.html";
            } else {
                return "redirect:/app/material-1";
            }
        } else {
            return "redirect:/index.html?virhe=1";
            //TODO: kuinka lomakkeeseen tehdään viesti virheellisestä syötteestä - GET-parametrit vai muuta?
        }
    }

    @RequestMapping(value = "/submit-demography", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitDemographytQuestionnaire(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute DemographicQuestionnaire demographicQuestionnaire) {

        demographicQuestionnaire.setSiteUrl(referer);
        demographicQuestionnaire.setUsername((String) session.getAttribute("username"));
        demographicQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
        demographicQuestionnaireRepository.save(demographicQuestionnaire);
        //return "redirect:/kiitos.html";
        return "redirect:/pre-attrakdiff.html";
    }

    // (Pre)Attrakdiff2 short questionnaire.
    @RequestMapping(value = "/submit-pre-attrakdiff", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPreAttrakdiff(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PreAttrakdiffQuestionnaire preAttrakdiffQuestionnaire) {

        preAttrakdiffQuestionnaire.setSiteUrl(referer);
        preAttrakdiffQuestionnaire.setUsername((String) session.getAttribute("username"));
        preAttrakdiffQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        // TODO: Set material type only if not already set (in login)
        //String materialType = materialTypeService.getMaterialType(preQuestionnaire);
        //preQuestionnaire.setAssignedMaterialType(materialType);
        preAttrakdiffQuestionnaireRepository.save(preAttrakdiffQuestionnaire);

        return "redirect:/tavoiteorientaatiokysely.html";
    }

    // Goal orientation questionnaire.
    @RequestMapping(value = "/submit-goal_orientation", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitGoalOrientationQuestionnaire(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute GoalOrientationQuestionnaire goalOrientationQuestionnaire) {

        goalOrientationQuestionnaire.setSiteUrl(referer);
        goalOrientationQuestionnaire.setUsername((String) session.getAttribute("username"));
        goalOrientationQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        goalOrientationRepository.save(goalOrientationQuestionnaire);

        return "redirect:/esikysely.html";
    }

    // Programming background.
    @RequestMapping(value = "/submit-background", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitBackground(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PreQuestionnaire preQuestionnaire) {

        preQuestionnaire.setSiteUrl(referer);
        preQuestionnaire.setUsername((String) session.getAttribute("username"));
        preQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        // TODO: Set material type only if not already set (in login)
        //String materialType = materialTypeService.getMaterialType(preQuestionnaire);
        //preQuestionnaire.setAssignedMaterialType(materialType);
        preQuestionnaireRepository.save(preQuestionnaire);

        return "redirect:/pre-panas-kysely.html";
    }

    // (Pre) I-PANAS-SF
    @RequestMapping(value = "/submit-pre-panas", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPrePanasQuestionnaire(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PrePanasQuestionnaire prePanasQuestionnaire) {
        prePanasQuestionnaire.setSiteUrl(referer);
        prePanasQuestionnaire.setUsername((String) session.getAttribute("username"));
        prePanasQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        prePanasQuestionnaire.setPreOrPost("pre");

        prePanasQuestionnaireRepository.save(prePanasQuestionnaire);

        //return "redirect:/pre_attrakdiff2-short.html";
        return "redirect:/app/material-1";
    }
//
//    @RequestMapping(value = "/submit-pre-sam", method = {RequestMethod.POST, RequestMethod.GET})
//    public String submitPreSamQuestionnaire(HttpSession session, @ModelAttribute PreSamQuestionnaire preSamQuestionnaire) {
//
//        preSamQuestionnaire.setUsername((String) session.getAttribute("username"));
//        preSamQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
//
//        preSamQuestionnaire.setPreOrPost("pre");
//
//        preSamQuestionnaireRepository.save(preSamQuestionnaire);
//
//        return "redirect:/pre-panas-kysely.html";
//    }

    // 
    // Study materials.
    @RequestMapping("/material-{id}")
    public String getMaterial(HttpSession session, Model model, @PathVariable Integer id) {
        model.addAttribute(MATERIAL_TYPE, session.getAttribute("materialType"));
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
        materialVisit.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
        materialVisit.setSiteUrl(referer);

        materialVisitRepository.save(materialVisit);

        if (id >= 21) {
            return "redirect:/post-panas-kysely.html";
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

//    @RequestMapping(value = "/submit-post-sam", method = {RequestMethod.POST, RequestMethod.GET})
//    public String submitPostSamQuestionnaire(HttpSession session, @ModelAttribute PostSamQuestionnaire postSamQuestionnaire) {
//        postSamQuestionnaire.setUsername((String) session.getAttribute("username"));
//        postSamQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
//
//        postSamQuestionnaire.setPreOrPost("post");
//
//        postSamQuestionnaireRepository.save(postSamQuestionnaire);
//
//        return "redirect:/post-panas-kysely.html";
//
//    }
    // (Post) I-PANAS-SF
    @RequestMapping(value = "/submit-post-panas", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostPanasQuestionnaire(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PostPanasQuestionnaire postPanasQuestionnaire) {

        postPanasQuestionnaire.setSiteUrl(referer);
        postPanasQuestionnaire.setUsername((String) session.getAttribute("username"));
        postPanasQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        postPanasQuestionnaire.setPreOrPost("post");

        postPanasQuestionnaireRepository.save(postPanasQuestionnaire);

        return "redirect:/post-attrakdiff.html";

    }

    // Programming background.
    @RequestMapping(value = "/submit-post-attrakdiff", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostAttrakdiff(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PostAttrakdiffQuestionnaire postAttrakdiffQuestionnaire) {

        postAttrakdiffQuestionnaire.setSiteUrl(referer);
        postAttrakdiffQuestionnaire.setUsername((String) session.getAttribute("username"));
        postAttrakdiffQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        // TODO: Set material type only if not already set (in login)
        //String materialType = materialTypeService.getMaterialType(preQuestionnaire);
        //preQuestionnaire.setAssignedMaterialType(materialType);
        postAttrakdiffQuestionnaireRepository.save(postAttrakdiffQuestionnaire);
        return "redirect:/jalkikysely.html";
    }

    @RequestMapping(value = "/submit-postquestionnaire", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostQuestionnaire(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @ModelAttribute PostQuestionnaire postQuestionnaire) {
        postQuestionnaire.setSiteUrl(referer);
        postQuestionnaire.setUsername((String) session.getAttribute("username"));
        postQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
        postQuestionnaireRepository.save(postQuestionnaire);
        //return "redirect:/demografia-kysely.html";

        return "redirect:/kiitos.html";
    }

}
