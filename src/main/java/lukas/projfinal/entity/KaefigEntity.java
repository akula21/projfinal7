package lukas.projfinal.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "kaefig")
public class KaefigEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    @Column(name = "anzahlreihen")
    private int kaefigReihen;

    @Column(name = "anzahletagen")
    private int kaefigEtagen;

    @Column(name = "reihenbreite")
    private double kefReihenBreite;

    @Column(name = "kaefiglange")
    private double kaefLange;

    @Column(name = "kaefigtiefe")
    private double kaefTiefe;

    @Column(name = "anzahlderkaefigJeEtage")
    private int anzDerKaefJeEtage;

    @Column(name = "tiereinstallen")
    private int anzDerTierEinstallen;

    @Column(name = "tiereausstallen")
    private int anzDerTireAusstallen;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
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
}
