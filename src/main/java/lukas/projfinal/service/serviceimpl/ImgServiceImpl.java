package lukas.projfinal.service.serviceimpl;

import lukas.projfinal.entity.ImgEntity;
import lukas.projfinal.repository.ImgRepository;
import lukas.projfinal.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgRepository imgRepository;

    @Override
    public List<ImgEntity> getImges() {

        return imgRepository.findAll();
    }

    @Override
    public void createImg(ImgEntity imgEntity) {

        imgRepository.save(imgEntity);
    }

    @Override
    public ImgEntity getImg(Long id) {

        return imgRepository.getOne(id);
    }

    @Override
    public void updateImg(ImgEntity imgEntity) {

        imgRepository.save(imgEntity);
    }

    @Override
    public void deleteImg(Long id) {

        imgRepository.deleteById(id);
    }


}
