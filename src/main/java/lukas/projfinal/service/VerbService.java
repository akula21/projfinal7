package lukas.projfinal.service;

import lukas.projfinal.entity.VerbEntity;

import java.util.List;

public interface VerbService {

    List<VerbEntity> getVerbs();

    void createVerb(VerbEntity verb);

    VerbEntity getVerb(Long id);

    void updateVerb(VerbEntity verb);

    void deleteVerb(Long id);
}
