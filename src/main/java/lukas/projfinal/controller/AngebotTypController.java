package lukas.projfinal.controller;

import lukas.projfinal.entity.AngebotEntity;
import lukas.projfinal.entity.AngebotTypEntity;
import lukas.projfinal.service.AngebotService;
import lukas.projfinal.service.AngebotTypService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AngebotTypController {

    @Autowired
    private AngebotTypService angebotTypService;

    @RequestMapping(value = {"/angebottypcreate"}, method = RequestMethod.GET)
    public String showAngebotTyp(Model model) {

        model.addAttribute("angebottypmodel", new AngebotTypEntity());

        return "angebottypcreate";
    }

    @RequestMapping(value = {"/angebottypcreate"}, method = RequestMethod.POST)
    public String createAngebotTyp(@ModelAttribute("angebottypmodel") AngebotTypEntity angebotTyp) {


        angebotTypService.createAngebotTyp(angebotTyp);


        return "redirect:/angebottypshow";
    }

    @RequestMapping(value = {"/angebottypshow"}, method = RequestMethod.GET)
    public String showAngebotTyps(Model model){

        model.addAttribute("angebottypshow", angebotTypService.getAngebotTyps());

        return "angebottypshow";
    }
}
