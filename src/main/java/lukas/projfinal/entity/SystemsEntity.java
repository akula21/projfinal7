package lukas.projfinal.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "systems")
public class SystemsEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "angebottyp_id")
    private AngebotTypEntity angebottyp;

    @OneToMany(mappedBy = "systems")
    private List<VerbEntity> verbindung;

    @OneToMany(mappedBy = "systems")
    private List<ProduktsEntity> produkts;

    @Column(name = "systemname", length = 500)
    private String sysName;

    @Column(name = "systembeschreibung", length = 1000)
    private String sysBeschreibung;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysBeschreibung() {
        return sysBeschreibung;
    }

    public void setSysBeschreibung(String sysBeschreibung) {
        this.sysBeschreibung = sysBeschreibung;
    }

    public AngebotTypEntity getAngebottyp() {
        return angebottyp;
    }

    public void setAngebottyp(AngebotTypEntity angebottyp) {
        this.angebottyp = angebottyp;
    }

    public List<ProduktsEntity> getProdukts() {
        return produkts;
    }

    public void setProdukts(List<ProduktsEntity> produkts) {
        this.produkts = produkts;
    }

    public List<VerbEntity> getVerbindung() {
        return verbindung;
    }

    public void setVerbindung(List<VerbEntity> verbindung) {
        this.verbindung = verbindung;
    }


}
