package lukas.projfinal.service;

import  lukas.projfinal.entity.KaefigEntity;

import java.util.List;

public interface KaefigService {

    List<KaefigEntity> getKaefigs();

    void createKaefig(KaefigEntity kaefig);

    KaefigEntity getKaefig(Long id);

    void updateKaefig(KaefigEntity kaefig);

    void deleteKaefig(Long id);

    KaefigEntity kaefig = new KaefigEntity();
}
