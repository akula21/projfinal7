package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.KundenEntity;
import lukas.projfinal.repository.KundenRepository;
import lukas.projfinal.service.KundenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundenServiceImpl implements KundenService {

    @Autowired
    private KundenRepository kundenRepository;

    @Override
    public List<KundenEntity> getKundens() {
        return kundenRepository.findAll();
    }

    @Override
    public void createKunden(KundenEntity kundenStamm) {
        kundenRepository.save(kundenStamm);
    }

    @Override
    public KundenEntity getKunden(Long id){
        return kundenRepository.getOne(id);
    }

    @Override
    public void updateKunden(KundenEntity kundenStamm){
        kundenRepository.save(kundenStamm);
    }

    @Override
    public void deleteKunden(Long id){
        kundenRepository.deleteById(id);
    }
}
