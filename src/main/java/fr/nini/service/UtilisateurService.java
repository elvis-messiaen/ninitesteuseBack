package fr.nini.service;

import fr.nini.entities.Login;
import fr.nini.entities.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    Utilisateur enregistrer(Utilisateur utilisateur);

    void supprimer(Long id);

    List<Utilisateur> lister();

    Optional<Utilisateur> trouver(Long id);
}
