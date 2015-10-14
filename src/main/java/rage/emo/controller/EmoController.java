package rage.emo.controller;

import java.util.HashSet;
import java.util.Set;

import rage.emo.dto.Login;
import rage.emo.dto.PreQuestionnaire;
import rage.emo.dto.GoalOrientationQuestionnaire;
import rage.emo.dto.PostQuestionnaire;
import rage.emo.dto.PanasQuestionnaire;
import rage.emo.dto.SamQuestionnaire;

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
import rage.emo.repository.GoalOrientationRepository;
import rage.emo.repository.PreQuestionnaireRepository;

import rage.emo.repository.PreSamQuestionnaireRepository;
import rage.emo.repository.PrePanasQuestionnaireRepository;

import rage.emo.repository.PostPanasQuestionnaireRepository;
import rage.emo.repository.PostSamQuestionnaireRepository;

import rage.emo.service.MaterialTypeService;

@Controller
@RequestMapping("/app")
public class EmoController {

    private static final Set<String> USER_WHITE_LIST
            = new HashSet<String>() {
                {
                    String s = "Essi\n"
                    + "Petri\n"
                    + "Lassi\n"
                    + "Arto\n"
                    + "229807\n"
                    + "240338\n"
                    + "239882\n"
                    + "239794\n"
                    + "233507\n"
                    + "234158\n"
                    + "241262\n"
                    + "218254\n"
                    + "234109\n"
                    + "233950\n"
                    + "245829\n"
                    + "234196\n"
                    + "214689\n"
                    + "233787\n"
                    + "218583\n"
                    + "230540\n"
                    + "224999\n"
                    + "240025\n"
                    + "229347\n"
                    + "228896\n"
                    + "233698\n"
                    + "218874\n"
                    + "239851\n"
                    + "224956\n"
                    + "233615\n"
                    + "229248\n"
                    + "233788\n"
                    + "228800\n"
                    + "233763\n"
                    + "233885\n"
                    + "225234\n"
                    + "240449\n"
                    + "246099\n"
                    + "234035\n"
                    + "198675\n"
                    + "241261\n"
                    + "229729\n"
                    + "240234\n"
                    + "240625\n"
                    + "201456\n"
                    + "239867\n"
                    + "229260\n"
                    + "194679\n"
                    + "240344\n"
                    + "234278\n"
                    + "239956\n"
                    + "234134\n"
                    + "240059\n"
                    + "218097\n"
                    + "246314\n"
                    + "225228\n"
                    + "239935\n"
                    + "240213\n"
                    + "72992\n"
                    + "211960\n"
                    + "205353\n"
                    + "240333\n"
                    + "218465\n"
                    + "240560\n"
                    + "211858\n"
                    + "235702\n"
                    + "234159\n"
                    + "233935\n"
                    + "246222\n"
                    + "234276\n"
                    + "239896\n"
                    + "239923\n"
                    + "240044\n"
                    + "233756\n"
                    + "233825\n"
                    + "239849\n"
                    + "239929\n"
                    + "233966\n"
                    + "225033\n"
                    + "152261\n"
                    + "240552\n"
                    + "240966\n"
                    + "228821\n"
                    + "240537\n"
                    + "234295\n"
                    + "225440\n"
                    + "246172\n"
                    + "237402\n"
                    + "224763\n"
                    + "228840\n"
                    + "239975\n"
                    + "234197\n"
                    + "233997\n"
                    + "211657\n"
                    + "160554\n"
                    + "229386\n"
                    + "205732\n"
                    + "240226\n"
                    + "240481\n"
                    + "240599\n"
                    + "229758\n"
                    + "240526\n"
                    + "200293\n"
                    + "239888\n"
                    + "240138\n"
                    + "239958\n"
                    + "239919\n"
                    + "212262\n"
                    + "240275\n"
                    + "233984\n"
                    + "240290\n"
                    + "234342\n"
                    + "229384\n"
                    + "226499\n"
                    + "229660\n"
                    + "235843\n"
                    + "243540\n"
                    + "225992\n"
                    + "234252\n"
                    + "233817\n"
                    + "229051\n"
                    + "240092\n"
                    + "234264\n"
                    + "234001\n"
                    + "218277\n"
                    + "239871\n"
                    + "229274\n"
                    + "211838\n"
                    + "150593\n"
                    + "234115\n"
                    + "229064\n"
                    + "228889\n"
                    + "240425\n"
                    + "233904\n"
                    + "240346\n"
                    + "229411\n"
                    + "224898\n"
                    + "177175\n"
                    + "239995\n"
                    + "240068\n"
                    + "233619\n"
                    + "234228\n"
                    + "246481\n"
                    + "233588\n"
                    + "233579\n"
                    + "235651\n"
                    + "240568\n"
                    + "229659\n"
                    + "234099\n"
                    + "235636\n"
                    + "245656\n"
                    + "239907\n"
                    + "218904\n"
                    + "240585\n"
                    + "239844\n"
                    + "225310\n"
                    + "228966\n"
                    + "240251\n"
                    + "211379\n"
                    + "240482\n"
                    + "228907\n"
                    + "202018\n"
                    + "240478\n"
                    + "235921\n"
                    + "218454\n"
                    + "233927\n"
                    + "239930\n"
                    + "225282\n"
                    + "243680\n"
                    + "234217\n"
                    + "228900\n"
                    + "239836\n"
                    + "246283\n"
                    + "247780\n"
                    + "240490\n"
                    + "240037\n"
                    + "233889\n"
                    + "234155\n"
                    + "152186\n"
                    + "240308\n"
                    + "229760\n"
                    + "239870\n"
                    + "240227\n"
                    + "193988\n"
                    + "239796\n"
                    + "245973\n"
                    + "228872\n"
                    + "240567\n"
                    + "234142\n"
                    + "233939\n"
                    + "229067\n"
                    + "182442\n"
                    + "239947\n"
                    + "229018\n"
                    + "234089\n"
                    + "233820\n"
                    + "212199\n"
                    + "234283\n"
                    + "234165\n"
                    + "224613\n"
                    + "234082\n"
                    + "229504\n"
                    + "240015\n"
                    + "240507\n"
                    + "240135\n"
                    + "247602\n"
                    + "198264\n"
                    + "228980\n"
                    + "240572\n"
                    + "218809\n"
                    + "240142\n"
                    + "239860\n"
                    + "233906\n"
                    + "233576\n"
                    + "233498\n"
                    + "229467\n"
                    + "224975\n"
                    + "228930\n"
                    + "240551\n"
                    + "176321\n"
                    + "246484\n"
                    + "199099\n"
                    + "233479\n"
                    + "233557\n"
                    + "240310\n"
                    + "234352\n"
                    + "240517\n"
                    + "177579\n"
                    + "157187\n"
                    + "194719\n"
                    + "233942\n"
                    + "240311\n"
                    + "240522\n"
                    + "229457\n"
                    + "218180\n"
                    + "225026\n"
                    + "233883\n"
                    + "240504\n"
                    + "240256\n"
                    + "243840\n"
                    + "233821\n"
                    + "240538\n"
                    + "224825\n"
                    + "65914\n"
                    + "239959\n"
                    + "239881\n"
                    + "239998\n"
                    + "240471\n"
                    + "229559\n"
                    + "233726\n"
                    + "226589\n"
                    + "234314\n"
                    + "245818\n"
                    + "229747\n"
                    + "234193\n"
                    + "240362\n"
                    + "229743\n"
                    + "243440\n"
                    + "245800\n"
                    + "240272\n"
                    + "233799\n"
                    + "240386\n"
                    + "228964\n"
                    + "240352\n"
                    + "229228\n"
                    + "233876\n"
                    + "224888\n"
                    + "240590\n"
                    + "233969\n"
                    + "248300\n"
                    + "240078\n"
                    + "229456\n"
                    + "229324\n"
                    + "203739\n"
                    + "234255\n"
                    + "240369\n"
                    + "158827\n"
                    + "246305\n"
                    + "224948\n"
                    + "246321\n"
                    + "218992\n"
                    + "224552\n"
                    + "240477\n"
                    + "234041\n"
                    + "234047\n"
                    + "212001\n"
                    + "189900\n"
                    + "229098\n"
                    + "201864\n"
                    + "240098\n"
                    + "228837\n"
                    + "229068\n"
                    + "230659\n"
                    + "165129\n"
                    + "246453\n"
                    + "157163\n"
                    + "72226\n"
                    + "222500\n"
                    + "229666\n"
                    + "199154\n"
                    + "202216";

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

    // PreSamQuestionnaireRepository added for TTY survey.
    @Autowired
    PreSamQuestionnaireRepository preSamQuestionnaireRepository;
    @Autowired
    PrePanasQuestionnaireRepository prePanasQuestionnaireRepository;

    @Autowired
    PostQuestionnaireRepository postQuestionnaireRepository;
    
    @Autowired
    PostPanasQuestionnaireRepository postPanasQuestionnaireRepository;
    @Autowired
    PostSamQuestionnaireRepository postSamQuestionnaireRepository;


    @Autowired
    MaterialVisitRepository materialVisitRepository;

    @Autowired
    MaterialTypeService materialTypeService;

    @RequestMapping(value = "/start/{opnro}", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitBackground(
            @RequestHeader(value = "referer", required = false) final String referer,
            HttpSession session,
            @PathVariable String opnro) {

        session.setAttribute("username", opnro);

        return "redirect:/esikysely.html?o=" + opnro;
    }

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

        return "redirect:/pre-sam-kysely.html";
    }

    @RequestMapping(value = "/submit-pre-sam", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPreSamQuestionnaire(HttpSession session, @ModelAttribute SamQuestionnaire samQuestionnaire) {
        samQuestionnaire.setUsername((String) session.getAttribute("username"));
        samQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        preSamQuestionnaireRepository.save(samQuestionnaire);

        return "redirect:/pre-panas-kysely.html";
    }

    @RequestMapping(value = "/submit-pre-panas", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPrePanasQuestionnaire(HttpSession session, @ModelAttribute PanasQuestionnaire panasQuestionnaire) {
        panasQuestionnaire.setUsername((String) session.getAttribute("username"));
        panasQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        prePanasQuestionnaireRepository.save(panasQuestionnaire);

        return "redirect:/tavoitehakuisuuskysely.html";
    }

    @RequestMapping(value = "/submit-goal_orientation", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitGoalOrientationQuestionnaire(HttpSession session, @ModelAttribute GoalOrientationQuestionnaire goalOrientationQuestionnaire) {
        goalOrientationQuestionnaire.setUsername((String) session.getAttribute("username"));
        goalOrientationQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        goalOrientationRepository.save(goalOrientationQuestionnaire);

        return "redirect:/app/material-1";
    }

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
                return "redirect:/esikysely.html";
            } else {
                return "redirect:/app/material-1";
            }
        } else {
            return "redirect:/index.html?virhe=1";
            //TODO: kuinka lomakkeeseen tehdään viesti virheellisestä syötteestä - GET-parametrit vai muuta?
        }
    }

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
            return "redirect:/post-sam-kysely.html";
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
    
        @RequestMapping(value = "/submit-post-sam", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostSamQuestionnaire(HttpSession session, @ModelAttribute SamQuestionnaire samQuestionnaire) {
        samQuestionnaire.setUsername((String) session.getAttribute("username"));
        samQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        postSamQuestionnaireRepository.save(samQuestionnaire);

        return "redirect:/post-panas-kysely.html";

    }

    @RequestMapping(value = "/submit-post-panas", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostPanasQuestionnaire(HttpSession session, @ModelAttribute PanasQuestionnaire panasQuestionnaire) {
        panasQuestionnaire.setUsername((String) session.getAttribute("username"));
        panasQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));

        postPanasQuestionnaireRepository.save(panasQuestionnaire);

        return "redirect:/jalkikysely.html";

    }

    @RequestMapping(value = "/submit-postquestionnaire", method = {RequestMethod.POST, RequestMethod.GET})
    public String submitPostQuestionnaire(HttpSession session, @ModelAttribute PostQuestionnaire postQuestionnaire) {
        postQuestionnaire.setUsername((String) session.getAttribute("username"));
        postQuestionnaire.setAssignedMaterialType((String) session.getAttribute(MATERIAL_TYPE));
        postQuestionnaireRepository.save(postQuestionnaire);
        return "redirect:/kiitos.html";
    }
}
