package fr.nini.service;

import fr.nini.entities.Login;

import java.util.List;
import java.util.Optional;

public interface LoginService {
    Login enregistrer(Login login);

    void supprimer(Long id);

    List<Login> lister();

    Optional<Login> trouver(Long id);
}
