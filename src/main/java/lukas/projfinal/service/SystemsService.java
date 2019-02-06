package lukas.projfinal.service;

import lukas.projfinal.entity.SystemsEntity;

import java.util.List;

public interface SystemsService {

    List<SystemsEntity> getSystems();

    void createSystem(SystemsEntity systems);

    SystemsEntity getSystem(Long id);

    void updateSystem(SystemsEntity systems);

    void deleteSystem(Long id);
}
