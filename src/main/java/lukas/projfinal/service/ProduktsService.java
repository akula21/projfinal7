package lukas.projfinal.service;

import lukas.projfinal.entity.ProduktsEntity;

import java.util.List;

public interface ProduktsService {

    List<ProduktsEntity> getProdukts();

    void createProdukt(ProduktsEntity produkts);

    ProduktsEntity getProdukt(Long id);

    void updateProdukt(ProduktsEntity produkts);

    void deleteProdukt(Long id);

}
