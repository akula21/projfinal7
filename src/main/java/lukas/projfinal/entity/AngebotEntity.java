package lukas.projfinal.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "angebot")
public class AngebotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "angebot")
    private List<KaefigEntity> kaefig;

    @OneToMany(mappedBy = "angebot")
    private List<ImgEntity> imgg;

    @OneToMany(mappedBy = "angebot")
    private List<VerbEntity> verbindung;

    @ManyToOne
    @JoinColumn(name = "kuden_id")
    private KundenEntity kundens;

    @ManyToOne
    @JoinColumn(name = "mitarbeiter_id")
    private MitarbeiterEntity mitarbeiter;

    @Column(name = "beschreibung", length = 600)
    private String angBeschreibung;

    @Column(name = "angebotsdatum")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate angDatum;

    @Column(name = "anzahlderstaelle")
    private double anzDerStaelle;

    @Column(name = "stalllange")
    private double stallLange;

    @Column(name = "stallbreite")
    private double stallBreite;

    @Column(name = "firsthohe")
    private double firstHohe;

    @Column(name = "traufenhohe")
    private double traufenHohe;

    @Column(name = "kopfteillaenge")
    private double kopfteilLange;

    @Column(name = "tiergewicht")
    private double tierGewicht;

    @Column(name = "active")
    private Boolean active;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<KaefigEntity> getKaefig() {
        return kaefig;
    }

    public void setKaefig(List<KaefigEntity> kaefig) {
        this.kaefig = kaefig;
    }

    public List<ImgEntity> getImgg() {
        return imgg;
    }

    public void setImgg(List<ImgEntity> imgg) {
        this.imgg = imgg;
    }

    public KundenEntity getKundens() {
        return kundens;
    }

    public void setKundens(KundenEntity kundens) {
        this.kundens = kundens;
    }

    public MitarbeiterEntity getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(MitarbeiterEntity mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

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

    public double getAnzDerStaelle() {
        return anzDerStaelle;
    }

    public void setAnzDerStaelle(double anzDerStaelle) {
        this.anzDerStaelle = anzDerStaelle;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<VerbEntity> getVerbindung() {
        return verbindung;
    }

    public void setVerbindung(List<VerbEntity> verbindung) {
        this.verbindung = verbindung;
    }
}
