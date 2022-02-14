package fr.nini.service;

import fr.nini.entities.Page;

import java.util.List;
import java.util.Optional;
public interface Pageservice {

    Page enregistrer(Page page);

    void supprimer(Long id);

    List<Page> lister();

    Optional<Page> trouver(Long id);
}
