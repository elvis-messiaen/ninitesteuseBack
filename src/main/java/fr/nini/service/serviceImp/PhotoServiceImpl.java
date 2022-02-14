package fr.nini.service.serviceImp;

import fr.nini.entities.Photo;
import fr.nini.repository.PhotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoServiceImpl implements PhotoService{
    private PhotoRepository photoRepository;

    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public Photo enregistrer(Photo photo) {
        return photoRepository.save(photo);
    }

    @Override
    public void supprimer(Long id) {
        photoRepository.deleteById(id);
    }

    @Override
    public List<Photo> lister() {
        return photoRepository.findAll();
    }

    @Override
    public Optional<Photo> trouver(Long id) {
        return photoRepository.findById(id);
    }
}
