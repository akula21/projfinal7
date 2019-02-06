package lukas.projfinal.entity;

import javax.persistence.*;

@Entity
@Table(name = "ImgTable")
public class ImgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "angebot_id")
    private AngebotEntity angebot;

    @Column(name = "imgpath")
    private String path;

    @Column(name = "imgpath2")
    private String path2;

    @Column(name = "imgpath3")
    private String path3;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public AngebotEntity getAngebot() {
        return angebot;
    }

    public void setAngebot(AngebotEntity angebot) {
        this.angebot = angebot;
    }
}
