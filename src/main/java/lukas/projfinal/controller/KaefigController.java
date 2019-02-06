package lukas.projfinal.controller;

import lukas.projfinal.entity.KaefigEntity;
import lukas.projfinal.service.KaefigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class KaefigController {

    @Autowired
    private KaefigService kaefigService;


    @RequestMapping(value = {"/kaefigcreate"}, method = RequestMethod.GET)
    public String showAddKaefig(Model model) {

        model.addAttribute("kaefigmodel", new KaefigEntity());


        return "kaefigcreate";
    }

    @RequestMapping(value = {"/kaefigcreate"}, method = RequestMethod.POST)
    public String createKaefig(@ModelAttribute("kaefigmodel") KaefigEntity kaefig) {


        kaefigService.createKaefig(kaefig);

        return "redirect:/kaefigshow";
    }

    @RequestMapping(value = {"/kaefigshow"}, method = RequestMethod.GET)
    public String showKaefigs(Model model){

        model.addAttribute("kaefigshow", kaefigService.getKaefigs());

        return "kaefigshow";
    }
}
