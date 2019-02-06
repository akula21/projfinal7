package lukas.projfinal.pojo;


import lukas.projfinal.entity.ProduktsEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public class PojoClass1 {

    //Angebot

    private String angBeschreibung;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate angDatum;

    private double stallLange;

    private double stallBreite;

    private double firstHohe;

    private double traufenHohe;

    private double kopfteilLange;

    private double tierGewicht;

    private double anzDerStaelle;


    //Picture

    private String path;

    private String path2;

    private String path3;

    //Kaefig

    private int kaefigReihen;

    private int kaefigEtagen;

    private double kefReihenBreite;

    private double kaefLange;

    private double kaefTiefe;

    private int anzDerKaefJeEtage;

    private int anzDerTierEinstallen;

    private int anzDerTireAusstallen;


    // Kunden

    private String kunName;

    private String kunLand;

    private String kunAdress;

    private String kunTelNum;

    private String kunMobil;

    private String kunEMail;

    private String hinweis;

    private int rabat;


    //Mitarbeiter

    private String mitName;

    private String mitVorName;

    private String mitTelNum;

    private String mitMobNum;

    private String mitEMail;

    int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
//Menu

    private String KundE;

    private String MitarbeiteR;


    private String AngebotTyp;

    private String VerB;


    private String system;

    private String produkt;



    private String system1;

    private String system2;

    private String system3;

    private String system4;

    private String system5;

    private String system6;

    private String system7;

    private String system8;

    private String system9;

    private String system10;

    private String system11;

    private String system12;

    private String system13;

    private String system14;

    private String system15;

    private String system16;

    private String system17;

    private String system18;

    private String system19;

    private String system20;




    private String produkt1;

    private String produkt2;

    private String produkt3;

    private String produkt4;

    private String produkt5;

    private String produkt6;

    private String produkt7;

    private String produkt8;

    private String produkt9;

    private String produkt10;

    private String produkt11;

    private String produkt12;

    private String produkt13;

    private String produkt14;

    private String produkt15;

    private String produkt16;

    private String produkt17;

    private String produkt18;

    private String produkt19;

    private String produkt20;

    private String produkt21;

    private String produkt22;

    private String produkt23;

    private String produkt24;

    private String produkt25;

    private String produkt26;

    private String produkt27;

    private String produkt28;

    private String produkt29;

    private String produkt30;

    private String produkt31;

    private String produkt32;

    private String produkt33;

    private String produkt34;

    private String produkt35;

    private String produkt36;

    private String produkt37;

    private String produkt38;

    private String produkt39;

    private String produkt40;

    private String produkt41;

    private String produkt42;

    private String produkt43;

    private String produkt44;

    private String produkt45;

    private String produkt46;

    private String produkt47;

    private String produkt48;

    private String produkt49;

    private String produkt50;

    private String produkt51;

    private String produkt52;

    private String produkt53;

    private String produkt54;

    private String produkt55;

    private String produkt56;

    private String produkt57;

    private String produkt58;

    private String produkt59;

    private String produkt60;

    private String produkt61;

    private String produkt62;

    private String produkt63;

    private String produkt64;

    private String produkt65;

    private String produkt66;

    private String produkt67;

    private String produkt68;

    private String produkt69;

    private String produkt70;

    private String produkt71;

    private String produkt72;

    private String produkt73;

    private String produkt74;

    private String produkt75;

    private String produkt76;

    private String produkt77;

    private String produkt78;

    private String produkt79;

    private String produkt80;

    private String produkt81;

    private String produkt82;

    private String produkt83;

    private String produkt84;

    private String produkt85;

    private String produkt86;

    private String produkt87;

    private String produkt88;

    private String produkt89;

    private String produkt90;

    private String produkt91;

    private String produkt92;

    private String produkt93;

    private String produkt94;

    private String produkt95;

    private String produkt96;

    private String produkt97;

    private String produkt98;

    private String produkt99;

    private String produkt100;




    public String getAngBeschreibung() {
        return angBeschreibung;
    }

    public void setAngBeschreibung(String angBeschreibung) {
        this.angBeschreibung = angBeschreibung;
    }

    public LocalDate getAngDatum() {
        return angDatum;
    }

    public void setAngDatum(LocalDate angDatum) {
        this.angDatum = angDatum;
    }

    public double getStallLange() {
        return stallLange;
    }

    public void setStallLange(double stallLange) {
        this.stallLange = stallLange;
    }

    public double getStallBreite() {
        return stallBreite;
    }

    public void setStallBreite(double stallBreite) {
        this.stallBreite = stallBreite;
    }

    public double getFirstHohe() {
        return firstHohe;
    }

    public void setFirstHohe(double firstHohe) {
        this.firstHohe = firstHohe;
    }

    public double getTraufenHohe() {
        return traufenHohe;
    }

    public void setTraufenHohe(double traufenHohe) {
        this.traufenHohe = traufenHohe;
    }

    public double getKopfteilLange() {
        return kopfteilLange;
    }

    public void setKopfteilLange(double kopfteilLange) {
        this.kopfteilLange = kopfteilLange;
    }

    public double getTierGewicht() {
        return tierGewicht;
    }

    public void setTierGewicht(double tierGewicht) {
        this.tierGewicht = tierGewicht;
    }

    public double getAnzDerStaelle() {
        return anzDerStaelle;
    }

    public void setAnzDerStaelle(double anzDerStaelle) {
        this.anzDerStaelle = anzDerStaelle;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getKaefigReihen() {
        return kaefigReihen;
    }

    public void setKaefigReihen(int kaefigReihen) {
        this.kaefigReihen = kaefigReihen;
    }

    public int getKaefigEtagen() {
        return kaefigEtagen;
    }

    public void setKaefigEtagen(int kaefigEtagen) {
        this.kaefigEtagen = kaefigEtagen;
    }

    public double getKefReihenBreite() {
        return kefReihenBreite;
    }

    public void setKefReihenBreite(double kefReihenBreite) {
        this.kefReihenBreite = kefReihenBreite;
    }

    public double getKaefLange() {
        return kaefLange;
    }

    public void setKaefLange(double kaefLange) {
        this.kaefLange = kaefLange;
    }

    public double getKaefTiefe() {
        return kaefTiefe;
    }

    public void setKaefTiefe(double kaefTiefe) {
        this.kaefTiefe = kaefTiefe;
    }

    public int getAnzDerKaefJeEtage() {
        return anzDerKaefJeEtage;
    }

    public void setAnzDerKaefJeEtage(int anzDerKaefJeEtage) {
        this.anzDerKaefJeEtage = anzDerKaefJeEtage;
    }

    public int getAnzDerTierEinstallen() {
        return anzDerTierEinstallen;
    }

    public void setAnzDerTierEinstallen(int anzDerTierEinstallen) {
        this.anzDerTierEinstallen = anzDerTierEinstallen;
    }

    public int getAnzDerTireAusstallen() {
        return anzDerTireAusstallen;
    }

    public void setAnzDerTireAusstallen(int anzDerTireAusstallen) {
        this.anzDerTireAusstallen = anzDerTireAusstallen;
    }

    public String getKunName() {
        return kunName;
    }

    public void setKunName(String kunName) {
        this.kunName = kunName;
    }

    public String getKunLand() {
        return kunLand;
    }

    public void setKunLand(String kunLand) {
        this.kunLand = kunLand;
    }

    public String getKunAdress() {
        return kunAdress;
    }

    public void setKunAdress(String kunAdress) {
        this.kunAdress = kunAdress;
    }

    public String getKunTelNum() {
        return kunTelNum;
    }

    public void setKunTelNum(String kunTelNum) {
        this.kunTelNum = kunTelNum;
    }

    public String getKunMobil() {
        return kunMobil;
    }

    public void setKunMobil(String kunMobil) {
        this.kunMobil = kunMobil;
    }

    public String getKunEMail() {
        return kunEMail;
    }

    public void setKunEMail(String kunEMail) {
        this.kunEMail = kunEMail;
    }

    public String getHinweis() {
        return hinweis;
    }

    public void setHinweis(String hinweis) {
        this.hinweis = hinweis;
    }

    public int getRabat() {
        return rabat;
    }

    public void setRabat(int rabat) {
        this.rabat = rabat;
    }

    public String getMitName() {
        return mitName;
    }

    public void setMitName(String mitName) {
        this.mitName = mitName;
    }

    public String getMitVorName() {
        return mitVorName;
    }

    public void setMitVorName(String mitVorName) {
        this.mitVorName = mitVorName;
    }

    public String getMitTelNum() {
        return mitTelNum;
    }

    public void setMitTelNum(String mitTelNum) {
        this.mitTelNum = mitTelNum;
    }

    public String getMitMobNum() {
        return mitMobNum;
    }

    public void setMitMobNum(String mitMobNum) {
        this.mitMobNum = mitMobNum;
    }

    public String getMitEMail() {
        return mitEMail;
    }

    public void setMitEMail(String mitEMail) {
        this.mitEMail = mitEMail;
    }

    public String getKundE() {
        return KundE;
    }

    public void setKundE(String kundE) {
        KundE = kundE;
    }

    public String getMitarbeiteR() {
        return MitarbeiteR;
    }

    public void setMitarbeiteR(String mitarbeiteR) {
        MitarbeiteR = mitarbeiteR;
    }

    public String getPath2() {
        return path2;
    }

    public void setPath2(String path2) {
        this.path2 = path2;
    }

    public String getPath3() {
        return path3;
    }

    public void setPath3(String path3) {
        this.path3 = path3;
    }

    public String getAngebotTyp() {
        return AngebotTyp;
    }

    public void setAngebotTyp(String angebotTyp) {
        AngebotTyp = angebotTyp;
    }

    public String getSystem1() {
        return system1;
    }

    public void setSystem1(String system1) {
        this.system1 = system1;
    }

    public String getProdukt1() {
        return produkt1;
    }

    public void setProdukt1(String produkt1) {
        this.produkt1 = produkt1;
    }

    public String getVerB() {
        return VerB;
    }

    public void setVerB(String verB) {
        VerB = verB;
    }

    public String getSystem2() {
        return system2;
    }

    public void setSystem2(String system2) {
        this.system2 = system2;
    }

    public String getSystem3() {
        return system3;
    }

    public void setSystem3(String system3) {
        this.system3 = system3;
    }

    public String getProdukt2() {
        return produkt2;
    }

    public void setProdukt2(String produkt2) {
        this.produkt2 = produkt2;
    }

    public String getProdukt3() {
        return produkt3;
    }

    public void setProdukt3(String produkt3) {
        this.produkt3 = produkt3;
    }

    public String getProdukt4() {
        return produkt4;
    }

    public void setProdukt4(String produkt4) {
        this.produkt4 = produkt4;
    }

    public String getProdukt5() {
        return produkt5;
    }

    public void setProdukt5(String produkt5) {
        this.produkt5 = produkt5;
    }

    public String getProdukt6() {
        return produkt6;
    }

    public void setProdukt6(String produkt6) {
        this.produkt6 = produkt6;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public String getSystem4() {
        return system4;
    }

    public void setSystem4(String system4) {
        this.system4 = system4;
    }

    public String getSystem5() {
        return system5;
    }

    public void setSystem5(String system5) {
        this.system5 = system5;
    }

    public String getSystem6() {
        return system6;
    }

    public void setSystem6(String system6) {
        this.system6 = system6;
    }

    public String getSystem7() {
        return system7;
    }

    public void setSystem7(String system7) {
        this.system7 = system7;
    }

    public String getSystem8() {
        return system8;
    }

    public void setSystem8(String system8) {
        this.system8 = system8;
    }

    public String getSystem9() {
        return system9;
    }

    public void setSystem9(String system9) {
        this.system9 = system9;
    }

    public String getSystem10() {
        return system10;
    }

    public void setSystem10(String system10) {
        this.system10 = system10;
    }

    public String getSystem11() {
        return system11;
    }

    public void setSystem11(String system11) {
        this.system11 = system11;
    }

    public String getSystem12() {
        return system12;
    }

    public void setSystem12(String system12) {
        this.system12 = system12;
    }

    public String getSystem13() {
        return system13;
    }

    public void setSystem13(String system13) {
        this.system13 = system13;
    }

    public String getSystem14() {
        return system14;
    }

    public void setSystem14(String system14) {
        this.system14 = system14;
    }

    public String getSystem15() {
        return system15;
    }

    public void setSystem15(String system15) {
        this.system15 = system15;
    }

    public String getSystem16() {
        return system16;
    }

    public void setSystem16(String system16) {
        this.system16 = system16;
    }

    public String getSystem17() {
        return system17;
    }

    public void setSystem17(String system17) {
        this.system17 = system17;
    }

    public String getSystem18() {
        return system18;
    }

    public void setSystem18(String system18) {
        this.system18 = system18;
    }

    public String getSystem19() {
        return system19;
    }

    public void setSystem19(String system19) {
        this.system19 = system19;
    }

    public String getSystem20() {
        return system20;
    }

    public void setSystem20(String system20) {
        this.system20 = system20;
    }

    public String getProdukt7() {
        return produkt7;
    }

    public void setProdukt7(String produkt7) {
        this.produkt7 = produkt7;
    }

    public String getProdukt8() {
        return produkt8;
    }

    public void setProdukt8(String produkt8) {
        this.produkt8 = produkt8;
    }

    public String getProdukt9() {
        return produkt9;
    }

    public void setProdukt9(String produkt9) {
        this.produkt9 = produkt9;
    }

    public String getProdukt10() {
        return produkt10;
    }

    public void setProdukt10(String produkt10) {
        this.produkt10 = produkt10;
    }

    public String getProdukt11() {
        return produkt11;
    }

    public void setProdukt11(String produkt11) {
        this.produkt11 = produkt11;
    }

    public String getProdukt12() {
        return produkt12;
    }

    public void setProdukt12(String produkt12) {
        this.produkt12 = produkt12;
    }

    public String getProdukt13() {
        return produkt13;
    }

    public void setProdukt13(String produkt13) {
        this.produkt13 = produkt13;
    }

    public String getProdukt14() {
        return produkt14;
    }

    public void setProdukt14(String produkt14) {
        this.produkt14 = produkt14;
    }

    public String getProdukt15() {
        return produkt15;
    }

    public void setProdukt15(String produkt15) {
        this.produkt15 = produkt15;
    }

    public String getProdukt16() {
        return produkt16;
    }

    public void setProdukt16(String produkt16) {
        this.produkt16 = produkt16;
    }

    public String getProdukt17() {
        return produkt17;
    }

    public void setProdukt17(String produkt17) {
        this.produkt17 = produkt17;
    }

    public String getProdukt18() {
        return produkt18;
    }

    public void setProdukt18(String produkt18) {
        this.produkt18 = produkt18;
    }

    public String getProdukt19() {
        return produkt19;
    }

    public void setProdukt19(String produkt19) {
        this.produkt19 = produkt19;
    }

    public String getProdukt20() {
        return produkt20;
    }

    public void setProdukt20(String produkt20) {
        this.produkt20 = produkt20;
    }

    public String getProdukt21() {
        return produkt21;
    }

    public void setProdukt21(String produkt21) {
        this.produkt21 = produkt21;
    }

    public String getProdukt22() {
        return produkt22;
    }

    public void setProdukt22(String produkt22) {
        this.produkt22 = produkt22;
    }

    public String getProdukt23() {
        return produkt23;
    }

    public void setProdukt23(String produkt23) {
        this.produkt23 = produkt23;
    }

    public String getProdukt24() {
        return produkt24;
    }

    public void setProdukt24(String produkt24) {
        this.produkt24 = produkt24;
    }

    public String getProdukt25() {
        return produkt25;
    }

    public void setProdukt25(String produkt25) {
        this.produkt25 = produkt25;
    }

    public String getProdukt26() {
        return produkt26;
    }

    public void setProdukt26(String produkt26) {
        this.produkt26 = produkt26;
    }

    public String getProdukt27() {
        return produkt27;
    }

    public void setProdukt27(String produkt27) {
        this.produkt27 = produkt27;
    }

    public String getProdukt28() {
        return produkt28;
    }

    public void setProdukt28(String produkt28) {
        this.produkt28 = produkt28;
    }

    public String getProdukt29() {
        return produkt29;
    }

    public void setProdukt29(String produkt29) {
        this.produkt29 = produkt29;
    }

    public String getProdukt30() {
        return produkt30;
    }

    public void setProdukt30(String produkt30) {
        this.produkt30 = produkt30;
    }

    public String getProdukt31() {
        return produkt31;
    }

    public void setProdukt31(String produkt31) {
        this.produkt31 = produkt31;
    }

    public String getProdukt32() {
        return produkt32;
    }

    public void setProdukt32(String produkt32) {
        this.produkt32 = produkt32;
    }

    public String getProdukt33() {
        return produkt33;
    }

    public void setProdukt33(String produkt33) {
        this.produkt33 = produkt33;
    }

    public String getProdukt34() {
        return produkt34;
    }

    public void setProdukt34(String produkt34) {
        this.produkt34 = produkt34;
    }

    public String getProdukt35() {
        return produkt35;
    }

    public void setProdukt35(String produkt35) {
        this.produkt35 = produkt35;
    }

    public String getProdukt36() {
        return produkt36;
    }

    public void setProdukt36(String produkt36) {
        this.produkt36 = produkt36;
    }

    public String getProdukt37() {
        return produkt37;
    }

    public void setProdukt37(String produkt37) {
        this.produkt37 = produkt37;
    }

    public String getProdukt38() {
        return produkt38;
    }

    public void setProdukt38(String produkt38) {
        this.produkt38 = produkt38;
    }

    public String getProdukt39() {
        return produkt39;
    }

    public void setProdukt39(String produkt39) {
        this.produkt39 = produkt39;
    }

    public String getProdukt40() {
        return produkt40;
    }

    public void setProdukt40(String produkt40) {
        this.produkt40 = produkt40;
    }

    public String getProdukt41() {
        return produkt41;
    }

    public void setProdukt41(String produkt41) {
        this.produkt41 = produkt41;
    }

    public String getProdukt42() {
        return produkt42;
    }

    public void setProdukt42(String produkt42) {
        this.produkt42 = produkt42;
    }

    public String getProdukt43() {
        return produkt43;
    }

    public void setProdukt43(String produkt43) {
        this.produkt43 = produkt43;
    }

    public String getProdukt44() {
        return produkt44;
    }

    public void setProdukt44(String produkt44) {
        this.produkt44 = produkt44;
    }

    public String getProdukt45() {
        return produkt45;
    }

    public void setProdukt45(String produkt45) {
        this.produkt45 = produkt45;
    }

    public String getProdukt46() {
        return produkt46;
    }

    public void setProdukt46(String produkt46) {
        this.produkt46 = produkt46;
    }

    public String getProdukt47() {
        return produkt47;
    }

    public void setProdukt47(String produkt47) {
        this.produkt47 = produkt47;
    }

    public String getProdukt48() {
        return produkt48;
    }

    public void setProdukt48(String produkt48) {
        this.produkt48 = produkt48;
    }

    public String getProdukt49() {
        return produkt49;
    }

    public void setProdukt49(String produkt49) {
        this.produkt49 = produkt49;
    }

    public String getProdukt50() {
        return produkt50;
    }

    public void setProdukt50(String produkt50) {
        this.produkt50 = produkt50;
    }

    public String getProdukt51() {
        return produkt51;
    }

    public void setProdukt51(String produkt51) {
        this.produkt51 = produkt51;
    }

    public String getProdukt52() {
        return produkt52;
    }

    public void setProdukt52(String produkt52) {
        this.produkt52 = produkt52;
    }

    public String getProdukt53() {
        return produkt53;
    }

    public void setProdukt53(String produkt53) {
        this.produkt53 = produkt53;
    }

    public String getProdukt54() {
        return produkt54;
    }

    public void setProdukt54(String produkt54) {
        this.produkt54 = produkt54;
    }

    public String getProdukt55() {
        return produkt55;
    }

    public void setProdukt55(String produkt55) {
        this.produkt55 = produkt55;
    }

    public String getProdukt56() {
        return produkt56;
    }

    public void setProdukt56(String produkt56) {
        this.produkt56 = produkt56;
    }

    public String getProdukt57() {
        return produkt57;
    }

    public void setProdukt57(String produkt57) {
        this.produkt57 = produkt57;
    }

    public String getProdukt58() {
        return produkt58;
    }

    public void setProdukt58(String produkt58) {
        this.produkt58 = produkt58;
    }

    public String getProdukt59() {
        return produkt59;
    }

    public void setProdukt59(String produkt59) {
        this.produkt59 = produkt59;
    }

    public String getProdukt60() {
        return produkt60;
    }

    public void setProdukt60(String produkt60) {
        this.produkt60 = produkt60;
    }

    public String getProdukt61() {
        return produkt61;
    }

    public void setProdukt61(String produkt61) {
        this.produkt61 = produkt61;
    }

    public String getProdukt62() {
        return produkt62;
    }

    public void setProdukt62(String produkt62) {
        this.produkt62 = produkt62;
    }

    public String getProdukt63() {
        return produkt63;
    }

    public void setProdukt63(String produkt63) {
        this.produkt63 = produkt63;
    }

    public String getProdukt64() {
        return produkt64;
    }

    public void setProdukt64(String produkt64) {
        this.produkt64 = produkt64;
    }

    public String getProdukt65() {
        return produkt65;
    }

    public void setProdukt65(String produkt65) {
        this.produkt65 = produkt65;
    }

    public String getProdukt66() {
        return produkt66;
    }

    public void setProdukt66(String produkt66) {
        this.produkt66 = produkt66;
    }

    public String getProdukt67() {
        return produkt67;
    }

    public void setProdukt67(String produkt67) {
        this.produkt67 = produkt67;
    }

    public String getProdukt68() {
        return produkt68;
    }

    public void setProdukt68(String produkt68) {
        this.produkt68 = produkt68;
    }

    public String getProdukt69() {
        return produkt69;
    }

    public void setProdukt69(String produkt69) {
        this.produkt69 = produkt69;
    }

    public String getProdukt70() {
        return produkt70;
    }

    public void setProdukt70(String produkt70) {
        this.produkt70 = produkt70;
    }

    public String getProdukt71() {
        return produkt71;
    }

    public void setProdukt71(String produkt71) {
        this.produkt71 = produkt71;
    }

    public String getProdukt72() {
        return produkt72;
    }

    public void setProdukt72(String produkt72) {
        this.produkt72 = produkt72;
    }

    public String getProdukt73() {
        return produkt73;
    }

    public void setProdukt73(String produkt73) {
        this.produkt73 = produkt73;
    }

    public String getProdukt74() {
        return produkt74;
    }

    public void setProdukt74(String produkt74) {
        this.produkt74 = produkt74;
    }

    public String getProdukt75() {
        return produkt75;
    }

    public void setProdukt75(String produkt75) {
        this.produkt75 = produkt75;
    }

    public String getProdukt76() {
        return produkt76;
    }

    public void setProdukt76(String produkt76) {
        this.produkt76 = produkt76;
    }

    public String getProdukt77() {
        return produkt77;
    }

    public void setProdukt77(String produkt77) {
        this.produkt77 = produkt77;
    }

    public String getProdukt78() {
        return produkt78;
    }

    public void setProdukt78(String produkt78) {
        this.produkt78 = produkt78;
    }

    public String getProdukt79() {
        return produkt79;
    }

    public void setProdukt79(String produkt79) {
        this.produkt79 = produkt79;
    }

    public String getProdukt80() {
        return produkt80;
    }

    public void setProdukt80(String produkt80) {
        this.produkt80 = produkt80;
    }

    public String getProdukt81() {
        return produkt81;
    }

    public void setProdukt81(String produkt81) {
        this.produkt81 = produkt81;
    }

    public String getProdukt82() {
        return produkt82;
    }

    public void setProdukt82(String produkt82) {
        this.produkt82 = produkt82;
    }

    public String getProdukt83() {
        return produkt83;
    }

    public void setProdukt83(String produkt83) {
        this.produkt83 = produkt83;
    }

    public String getProdukt84() {
        return produkt84;
    }

    public void setProdukt84(String produkt84) {
        this.produkt84 = produkt84;
    }

    public String getProdukt85() {
        return produkt85;
    }

    public void setProdukt85(String produkt85) {
        this.produkt85 = produkt85;
    }

    public String getProdukt86() {
        return produkt86;
    }

    public void setProdukt86(String produkt86) {
        this.produkt86 = produkt86;
    }

    public String getProdukt87() {
        return produkt87;
    }

    public void setProdukt87(String produkt87) {
        this.produkt87 = produkt87;
    }

    public String getProdukt88() {
        return produkt88;
    }

    public void setProdukt88(String produkt88) {
        this.produkt88 = produkt88;
    }

    public String getProdukt89() {
        return produkt89;
    }

    public void setProdukt89(String produkt89) {
        this.produkt89 = produkt89;
    }

    public String getProdukt90() {
        return produkt90;
    }

    public void setProdukt90(String produkt90) {
        this.produkt90 = produkt90;
    }

    public String getProdukt91() {
        return produkt91;
    }

    public void setProdukt91(String produkt91) {
        this.produkt91 = produkt91;
    }

    public String getProdukt92() {
        return produkt92;
    }

    public void setProdukt92(String produkt92) {
        this.produkt92 = produkt92;
    }

    public String getProdukt93() {
        return produkt93;
    }

    public void setProdukt93(String produkt93) {
        this.produkt93 = produkt93;
    }

    public String getProdukt94() {
        return produkt94;
    }

    public void setProdukt94(String produkt94) {
        this.produkt94 = produkt94;
    }

    public String getProdukt95() {
        return produkt95;
    }

    public void setProdukt95(String produkt95) {
        this.produkt95 = produkt95;
    }

    public String getProdukt96() {
        return produkt96;
    }

    public void setProdukt96(String produkt96) {
        this.produkt96 = produkt96;
    }

    public String getProdukt97() {
        return produkt97;
    }

    public void setProdukt97(String produkt97) {
        this.produkt97 = produkt97;
    }

    public String getProdukt98() {
        return produkt98;
    }

    public void setProdukt98(String produkt98) {
        this.produkt98 = produkt98;
    }

    public String getProdukt99() {
        return produkt99;
    }

    public void setProdukt99(String produkt99) {
        this.produkt99 = produkt99;
    }

    public String getProdukt100() {
        return produkt100;
    }

    public void setProdukt100(String produkt100) {
        this.produkt100 = produkt100;
    }
}
