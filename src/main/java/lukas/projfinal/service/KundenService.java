package lukas.projfinal.service;

import lukas.projfinal.entity.KundenEntity;

import java.util.List;

public interface KundenService {

    List<KundenEntity> getKundens();

    void createKunden(KundenEntity kundenStamm);

    KundenEntity getKunden(Long id);

    void updateKunden(KundenEntity kundenStamm);

    void deleteKunden(Long id);

    KundenEntity kundenStamm = new KundenEntity();

}
