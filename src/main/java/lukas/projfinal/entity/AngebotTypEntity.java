package lukas.projfinal.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "angebottyp")
public class AngebotTypEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "angebottyp")
    private List<VerbEntity> verbindung;

    @OneToMany(mappedBy = "angebottyp")
    private List<SystemsEntity> systems;

    @Column(name = "angebotname", length = 700)
    private String angTypName;

    @Column(name = "angebotbeschreibung", length = 1000)
    private String angTypBeschreibung;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAngTypName() {
        return angTypName;
    }

    public void setAngTypName(String angTypName) {
        this.angTypName = angTypName;
    }

    public String getAngTypBeschreibung() {
        return angTypBeschreibung;
    }

    public void setAngTypBeschreibung(String angTypBeschreibung) {
        this.angTypBeschreibung = angTypBeschreibung;
    }


    public List<SystemsEntity> getSystems() {
        return systems;
    }

    public void setSystems(List<SystemsEntity> systems) {
        this.systems = systems;
    }

    public List<VerbEntity> getVerbindung() {
        return verbindung;
    }

    public void setVerbindung(List<VerbEntity> verbindung) {
        this.verbindung = verbindung;
    }
}
