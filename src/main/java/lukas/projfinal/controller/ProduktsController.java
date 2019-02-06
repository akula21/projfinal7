package lukas.projfinal.controller;

import lukas.projfinal.entity.ProduktsEntity;
import lukas.projfinal.entity.SystemsEntity;
import lukas.projfinal.service.ProduktsService;
import lukas.projfinal.service.SystemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProduktsController {

    @Autowired
    private ProduktsService produktsService;

    @Autowired
    private SystemsService systemsService;

    @RequestMapping(value = {"/produktcreate"}, method = RequestMethod.GET)
    public String showAddProdukt(Model model) {

        model.addAttribute("produktmodel", new ProduktsEntity());

        List<SystemsEntity> sysList = systemsService.getSystems();
        model.addAttribute("systems", sysList);

        return "produktcreate";
    }

    @RequestMapping(value = {"/produktcreate"}, method = RequestMethod.POST)
    public String createProdukt(@ModelAttribute("produktmodel") ProduktsEntity produkts) {

        SystemsEntity systemsEntity = new SystemsEntity();

        produktsService.createProdukt(produkts);

        produkts.setSystems(systemsEntity);

        return "redirect:/produktshow";
    }

    @RequestMapping(value = {"/produktshow"}, method = RequestMethod.GET)
    public String showProdukts(Model model){

        model.addAttribute("produktshow", produktsService.getProdukts());

        return "produktshow";
    }
}
