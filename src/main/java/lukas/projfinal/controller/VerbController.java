package lukas.projfinal.controller;

import lukas.projfinal.entity.VerbEntity;
import lukas.projfinal.service.VerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VerbController {

    @Autowired
    private VerbService verbService;

    @RequestMapping(value = {"/verbcreate"}, method = RequestMethod.GET)
    public String showAddVerb(Model model) {

        model.addAttribute("verbmodel", new VerbEntity());

        return "verbcreate";

    }

    @RequestMapping(value = {"/verbcreate"}, method = RequestMethod.POST)
    public String createVerb(@ModelAttribute("verbmodel") VerbEntity verb) {

        verbService.createVerb(verb);

        return "redirect:/verbshow";
    }

    @RequestMapping(value = {"/verbshow"}, method = RequestMethod.GET)
    public String showVerb(Model model) {

        model.addAttribute("verbshow", verbService.getVerbs());

        return "verbshow";
    }
}
