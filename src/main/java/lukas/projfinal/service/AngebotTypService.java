package lukas.projfinal.service;

import lukas.projfinal.entity.AngebotTypEntity;

import java.util.List;

public interface AngebotTypService {

    List<AngebotTypEntity> getAngebotTyps();

    void createAngebotTyp(AngebotTypEntity angebotTyp);

    AngebotTypEntity getAngebotTyp(Long id);

    void updateAngebotTyp(AngebotTypEntity angebotTyp);

    void deleteAngebotTyp(Long id);

}
