package lukas.projfinal.service;

import lukas.projfinal.entity.AngebotEntity;

import java.util.List;

public interface AngebotService {

    List<AngebotEntity> getAngebots();

    void createAngebot(AngebotEntity angebot);

    AngebotEntity getAngebot(Long id);

    void updateAngebot(AngebotEntity angebot);

    void deleteAngebot(Long id);

    List<AngebotEntity> findAllActirve();

}
