package lukas.projfinal.controller;

import lukas.projfinal.entity.MitarbeiterEntity;
import lukas.projfinal.service.MitarbeiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MitarbeiterController {

    @Autowired
    private MitarbeiterService mitarbeiterService;

    @RequestMapping(value = {"/mitarbeitercreate"}, method = RequestMethod.GET)
    public String showAddMitarbeiter(Model model) {

        model.addAttribute("mitarbeitermodel", new MitarbeiterEntity());

        return "mitarbeitercreate";

    }

    @RequestMapping(value = {"/mitarbeitercreate"}, method = RequestMethod.POST)
    public String createMitarbeiter(@ModelAttribute("mitarbeitermodel") MitarbeiterEntity mitarbeiter) {

        mitarbeiterService.createMitarbeiter(mitarbeiter);

        return "redirect:/mitarbeitershow";
    }

    @RequestMapping(value = {"/mitarbeitershow"}, method = RequestMethod.GET)
    public String showMitarbeiters(Model model) {

        model.addAttribute("mitarbeitershow", mitarbeiterService.getMitarbeiters());

        return "mitarbeitershow";
    }

}
