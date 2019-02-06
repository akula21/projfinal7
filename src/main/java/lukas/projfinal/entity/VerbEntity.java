package lukas.projfinal.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "verbindung")
public class VerbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private  AngebotEntity angebot;

    @ManyToOne
    @JoinColumn(name = "angebottyp_id")
    private AngebotTypEntity angebottyp;

    @ManyToOne
    @JoinColumn(name = "system_id")
    private SystemsEntity systems;

    @ManyToOne
    @JoinColumn(name = "produkt_id")
    private ProduktsEntity produkts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
    }

    public AngebotTypEntity getAngebottyp() {
        return angebottyp;
    }

    public void setAngebottyp(AngebotTypEntity angebottyp) {
        this.angebottyp = angebottyp;
    }

    public SystemsEntity getSystems() {
        return systems;
    }

    public void setSystems(SystemsEntity systems) {
        this.systems = systems;
    }

    public ProduktsEntity getProdukts() {
        return produkts;
    }

    public void setProdukts(ProduktsEntity produkts) {
        this.produkts = produkts;
    }
}
