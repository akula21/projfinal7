package lukas.projfinal.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "produkts")
public class ProduktsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "produkts")
    private List<VerbEntity> verbindung;

    @ManyToOne
    @JoinColumn(name = "systems_id")
    private SystemsEntity systems;

    @Column(name = "produktname", length = 500)
    private String prodName;

    @Column(name = "produktbeschreibung", length = 1000)
    private String prodBeschreibung;

    @Column(name = "produktprice")
    private double prPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdBeschreibung() {
        return prodBeschreibung;
    }

    public void setProdBeschreibung(String prodBeschreibung) {
        this.prodBeschreibung = prodBeschreibung;
    }

    public SystemsEntity getSystems() {
        return systems;
    }

    public void setSystems(SystemsEntity systems) {
        this.systems = systems;
    }

    public List<VerbEntity> getVerbindung() {
        return verbindung;
    }

    public void setVerbindung(List<VerbEntity> verbindung) {
        this.verbindung = verbindung;
    }

    public double getPrPrice() {
        return prPrice;
    }

    public void setPrPrice(double prPrice) {
        this.prPrice = prPrice;
    }
}
