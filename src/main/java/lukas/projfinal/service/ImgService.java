package lukas.projfinal.service;

import lukas.projfinal.entity.ImgEntity;

import java.util.List;

public interface ImgService {

    List<ImgEntity> getImges();

    void createImg(ImgEntity imgEntity);

    ImgEntity getImg(Long id);

    void updateImg(ImgEntity imgEntity);

    void deleteImg(Long id);

}
