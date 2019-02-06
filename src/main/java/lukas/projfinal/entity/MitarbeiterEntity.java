package lukas.projfinal.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "mitarbeiter")
public class MitarbeiterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "mitarbeiter")
    private List<AngebotEntity> angebot;

    @Column(name = "name")
    private String mitName;

    @Column(name = "vorname")
    private String mitVorName;

    @Column(name = "tel_num")
    private String mitTelNum;

    @Column(name = "mob_nummer")
    private String mitMobNum;

    @Column(name = "e_mail")
    private String mitEMail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AngebotEntity> getAngebot() {
        return angebot;
    }

    public void setAngebot(List<AngebotEntity> angebot) {
        this.angebot = angebot;
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
}
