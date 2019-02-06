package lukas.projfinal.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "kundens")
public class KundenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "kundens")
    private List<AngebotEntity> angebot;

    @Column(name = "kundenname", length = 400)
    private String kunName;

    @Column(name = "Land")
    private String kunLand;

    @Column(name = "adress", length = 600)
    private String kunAdress;

    @Column(name = "telnummer")
    private String kunTelNum;

    @Column(name = "mobil")
    private String kunMobil;

    @Column(name = "email")
    private String kunEMail;

    @Column(name = "hinweis", length = 500)
    private String hinweis;

    @Column(name = "rabat")
    private int rabat;

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
}
