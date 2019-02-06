package lukas.projfinal.controller;

import lukas.projfinal.entity.AngebotEntity;
import lukas.projfinal.entity.AngebotTypEntity;
import lukas.projfinal.entity.SystemsEntity;
import lukas.projfinal.service.AngebotTypService;
import lukas.projfinal.service.SystemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SystemsController {

    @Autowired
    private SystemsService systemsService;

    @Autowired
    private AngebotTypService angebotTypService;

    @RequestMapping(value = {"/systemcreate"}, method = RequestMethod.GET)
    public String showAddSystem(Model model) {

        model.addAttribute("systemmodel", new SystemsEntity());

        List<AngebotTypEntity> anTypList = angebotTypService.getAngebotTyps();
        model.addAttribute("angTyps", anTypList);

        return "systemcreate";
    }

    @RequestMapping(value = {"/systemcreate"}, method = RequestMethod.POST)
    public String createSystem(@ModelAttribute("systemmodel") SystemsEntity systems) {

        AngebotTypEntity angebotTypEntity = new AngebotTypEntity();

        systemsService.createSystem(systems);

        systems.setAngebottyp(angebotTypEntity);

        return "redirect:/systemshow";
    }

    @RequestMapping(value = {"/systemshow"}, method = RequestMethod.GET)
    public String showSystems(Model model){

        model.addAttribute("systemshow", systemsService.getSystems());

        return "systemshow";
    }
}
