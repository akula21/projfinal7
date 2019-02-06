package lukas.projfinal.service;

import lukas.projfinal.entity.MitarbeiterEntity;

import java.util.List;

public interface MitarbeiterService {

    List<MitarbeiterEntity> getMitarbeiters();

    void createMitarbeiter(MitarbeiterEntity mitarbeiter);

    MitarbeiterEntity getMitarbeiter(Long id);

    void updateMitarbeiter(MitarbeiterEntity mitarbeiter);

    void deleteMitarbeiter(Long id);

    MitarbeiterEntity mitarbeiter = new MitarbeiterEntity();
}
