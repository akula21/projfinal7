package lukas.projfinal.controller;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import lukas.projfinal.entity.*;
import lukas.projfinal.pojo.PojoClass1;
import lukas.projfinal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AngebotsController {

    @Autowired
    private AngebotService angebotService;

    @Autowired
    private KaefigService kaefigService;

    @Autowired
    private KundenService kundenService;

    @Autowired
    private MitarbeiterService mitarbeiterService;

    @Autowired
    private AngebotTypService angebotTypService;

    @Autowired
    private ImgService imgService;

    @Autowired
    private VerbService verbService;    //service zviazku system i produkt

    @Autowired
    private SystemsService systemsService;

    @Autowired
    private ProduktsService produktsService;

    @RequestMapping(value = { "/angebotcreate" }, method = RequestMethod.GET)
    public String showAddAngebot(Model model) {

        model.addAttribute("pojo1", new PojoClass1());

        List<KundenEntity> kunList = kundenService.getKundens();
        model.addAttribute("kundens", kunList);

        List<MitarbeiterEntity> mitList = mitarbeiterService.getMitarbeiters();
        model.addAttribute("mitarbeiters", mitList);

        List<AngebotTypEntity> anTList = angebotTypService.getAngebotTyps();
        model.addAttribute("angebottyps", anTList);

        List<SystemsEntity> sysList = systemsService.getSystems();
        model.addAttribute("systems", sysList);

        List<ProduktsEntity> prodList = produktsService.getProdukts();
        model.addAttribute("prodkts", prodList);

        verbService.getVerbs();     //distatu vsi zviazku

        kaefigService.getKaefigs();

        imgService.getImges();

        return "angebotcreate";
    }


    @RequestMapping(value = { "/angebotcreate" }, method = RequestMethod.POST)
    public String createAngebot(@ModelAttribute("pojo1") PojoClass1 pojo) {


        AngebotEntity angebotEntity = new AngebotEntity();

        KaefigEntity kaefigEntity = new KaefigEntity();

        ImgEntity imgEntity = new ImgEntity();



        angebotEntity.setKundens(kundenService.getKunden(Long.valueOf(pojo.getKundE()).longValue()));

        angebotEntity.setMitarbeiter(mitarbeiterService.getMitarbeiter(Long.valueOf(pojo.getMitarbeiteR()).longValue()));


        imgEntity.setPath(pojo.getPath());

        imgEntity.setPath2(pojo.getPath2());

        imgEntity.setPath3(pojo.getPath3());


        angebotEntity.setActive(true);


        angebotEntity.setAngBeschreibung(pojo.getAngBeschreibung());

        angebotEntity.setAngDatum(pojo.getAngDatum());

        angebotEntity.setAnzDerStaelle(pojo.getAnzDerStaelle());

        angebotEntity.setStallLange(pojo.getStallLange());

        angebotEntity.setStallBreite(pojo.getStallBreite());

        angebotEntity.setFirstHohe(pojo.getFirstHohe());

        angebotEntity.setTraufenHohe(pojo.getTraufenHohe());

        angebotEntity.setKopfteilLange(pojo.getKopfteilLange());

        angebotEntity.setTierGewicht(pojo.getTierGewicht());

        kaefigEntity.setKaefigReihen(pojo.getKaefigReihen());

        kaefigEntity.setKaefigEtagen(pojo.getKaefigEtagen());

        kaefigEntity.setKefReihenBreite(pojo.getKefReihenBreite());

        kaefigEntity.setKaefLange(pojo.getKaefLange());

        kaefigEntity.setKaefTiefe(pojo.getKaefTiefe());

        kaefigEntity.setAnzDerKaefJeEtage(pojo.getAnzDerKaefJeEtage());

        kaefigEntity.setAnzDerTierEinstallen(pojo.getAnzDerTierEinstallen());

        kaefigEntity.setAnzDerTireAusstallen(pojo.getAnzDerTireAusstallen());



        angebotService.createAngebot(angebotEntity);

        Long newKaef = new Long(angebotService.getAngebots().size());
        kaefigEntity.setAngebot(angebotService.getAngebot(newKaef));

        kaefigService.createKaefig(kaefigEntity);

        Long newImg = new Long(angebotService.getAngebots().size());
        imgEntity.setAngebot(angebotService.getAngebot(newImg));

        imgService.createImg(imgEntity);



        Map<String, List<String>> prodSys = new HashMap<>();

        List<String> prod1 = new ArrayList<>();

        prod1.add(pojo.getProdukt1());

        prod1.add(pojo.getProdukt2());

        prod1.add(pojo.getProdukt3());

        prod1.add(pojo.getProdukt4());

//        prod1.add(pojo.getProdukt5());
//
//        prod1.add(pojo.getProdukt6());



        List<String> prod2 = new ArrayList<>();

        prod2.add(pojo.getProdukt21());

        prod2.add(pojo.getProdukt22());

        prod2.add(pojo.getProdukt23());

        prod2.add(pojo.getProdukt24());

//        prod2.add(pojo.getProdukt25());
//
//        prod2.add(pojo.getProdukt26());


        List<String> prod3 = new ArrayList<>();

        prod3.add(pojo.getProdukt41());

        prod3.add(pojo.getProdukt42());

        prod3.add(pojo.getProdukt43());

        prod3.add(pojo.getProdukt44());


        prodSys.put(pojo.getSystem1(), prod1);

        prodSys.put(pojo.getSystem2(), prod2);

        prodSys.put(pojo.getSystem3(), prod3);



        for(Map.Entry<String, List<String>> en : prodSys.entrySet()){

            for(Object obj : en.getValue()){

                if(en.getKey()==null){

                    return "redirect:/angebotshow";

                }


                VerbEntity verbEntity = new VerbEntity();

                Long newAng = new Long(angebotService.getAngebots().size());
                verbEntity.setAngebot(angebotService.getAngebot(newAng));

                verbEntity.setAngebottyp(angebotTypService.getAngebotTyp(Long.valueOf(pojo.getAngebotTyp()).longValue()));


                String numb = String.valueOf(obj);

                Long numbi = Long.parseLong(numb);

                verbEntity.setSystems(systemsService.getSystem(Long.valueOf(en.getKey()).longValue()));

                verbEntity.setProdukts(produktsService.getProdukt(numbi));

                verbService.createVerb(verbEntity);

            }

        }


        return "redirect:/angebotshow";
    }

    @RequestMapping(value = { "/angebotshow" }, method = RequestMethod.GET)
    public String showAngebots(Model model) {

        model.addAttribute("angebotshow", angebotService.findAllActirve());


        return "angebotshow";
    }

    @RequestMapping(value = {"/angebotedit/{id}"},method = RequestMethod.GET)
    public String showEdit(@PathVariable Long id,Model model){
        AngebotEntity angebotEntity = angebotService.getAngebot(id);

        model.addAttribute("anbot",angebotEntity);

        return "angebotedit";
    }

    @RequestMapping(value = "/angeboteditsave",method = RequestMethod.POST)
    public String saveEdit(@ModelAttribute("anbot")AngebotEntity angebotEntity){

        AngebotEntity angebotEntity1 = angebotService.getAngebot(angebotEntity.getId());


        angebotEntity1.setId(angebotEntity.getId());

        angebotEntity1.setKundens(angebotEntity.getKundens());

        angebotEntity1.setMitarbeiter(angebotEntity.getMitarbeiter());

        angebotService.createAngebot(angebotEntity1);

        return "redirect:/angebotshow";
    }

    @RequestMapping(value = {"/delete/{id}"})
    public String showEdit(@PathVariable Long id){

        AngebotEntity angebotEntity1 = angebotService.getAngebot(id);

        angebotEntity1.setActive(false);

        angebotService.createAngebot(angebotEntity1);

        return "redirect:/angebotshow";
    }


    @RequestMapping(value = { "/oneangebot/{id}" }, method = RequestMethod.GET)
    public String showAngebots(@PathVariable Long id, Model model){

        model.addAttribute("angebot",angebotService.getAngebot(id));

        return "oneangebot";
    }

    @RequestMapping(value = { "/oneangeboten/{id}" }, method = RequestMethod.GET)
    public String showAngebotsen(@PathVariable Long id, Model model){

        model.addAttribute("angeboten",angebotService.getAngebot(id));

        return "oneangeboten";
    }

    @RequestMapping(value = { "/oneangebotru/{id}" }, method = RequestMethod.GET)
    public String showAngebotsru(@PathVariable Long id, Model model){

        model.addAttribute("angebotru",angebotService.getAngebot(id));

        return "oneangebotru";
    }


}



//        prod1.add(pojo.getProdukt7());
//
//        prod1.add(pojo.getProdukt8());
//
//        prod1.add(pojo.getProdukt9());
//
//        prod1.add(pojo.getProdukt10());
//
//        prod1.add(pojo.getProdukt11());
//
//        prod1.add(pojo.getProdukt12());
//
//        prod1.add(pojo.getProdukt13());
//
//        prod1.add(pojo.getProdukt14());
//
//        prod1.add(pojo.getProdukt15());
//
//        prod1.add(pojo.getProdukt16());
//
//        prod1.add(pojo.getProdukt17());
//
//        prod1.add(pojo.getProdukt18());
//
//        prod1.add(pojo.getProdukt19());
//
//        prod1.add(pojo.getProdukt20());

// prod2.add(pojo.getProdukt27());
//
//        prod2.add(pojo.getProdukt28());
//
//        prod2.add(pojo.getProdukt29());
//
//        prod2.add(pojo.getProdukt30());
//
//        prod2.add(pojo.getProdukt31());
//
//        prod2.add(pojo.getProdukt33());
//
//        prod2.add(pojo.getProdukt34());
//
//        prod2.add(pojo.getProdukt35());
//
//        prod2.add(pojo.getProdukt36());
//
//        prod2.add(pojo.getProdukt37());
//
//        prod2.add(pojo.getProdukt38());
//
//        prod2.add(pojo.getProdukt39());
//
//        prod2.add(pojo.getProdukt40());

//        verbEntity.setProdukts(produktsService.getProdukt(Long.valueOf(pojo.getProdukT()).longValue()));
//
//        verbEntity.setProdukts(produktsService.getProdukt(Long.valueOf(pojo.getProdukT1()).longValue()));
//
//        verbEntity.setProdukts(produktsService.getProdukt(Long.valueOf(pojo.getProdukT2()).longValue()));
//
//        verbEntity.setProdukts(produktsService.getProdukt(Long.valueOf(pojo.getProdukT3()).longValue()));
//
//        verbEntity.setProdukts(produktsService.getProdukt(Long.valueOf(pojo.getProdukT4()).longValue()));