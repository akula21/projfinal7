package lukas.projfinal.controller;

import lukas.projfinal.entity.KundenEntity;
import lukas.projfinal.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KundenController {

    @Autowired
    private KundenService kundenService;

    @RequestMapping(value = {"/kundecreate"}, method = RequestMethod.GET)
    public String showAddKaefig(Model model) {

        model.addAttribute("kundemodel", new KundenEntity());

        return "kundecreate";
    }

    @RequestMapping(value = {"/kundecreate"}, method = RequestMethod.POST)
    public String createKaefig(@ModelAttribute("kaefigmodel") KundenEntity kundenStamm) {


        kundenService.createKunden(kundenStamm);


        return "redirect:/kundeshow";
    }

    @RequestMapping(value = {"/kundeshow"}, method = RequestMethod.GET)
    public String showKaefigs(Model model){

        model.addAttribute("kundeshow", kundenService.getKundens());

        return "kundeshow";
    }
}
