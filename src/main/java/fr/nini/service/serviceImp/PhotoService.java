package fr.nini.service.serviceImp;

import fr.nini.entities.Photo;

import java.util.List;
import java.util.Optional;

public interface PhotoService {
    Photo enregistrer (Photo photo);

    void supprimer (Long id);

    List<Photo> lister();

    Optional<Photo> trouver (Long id);
}
