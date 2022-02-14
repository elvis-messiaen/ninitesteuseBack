package fr.nini.service;

import fr.nini.entities.CardType;
import java.util.List;
import java.util.Optional;

public interface CardService {
    CardType enregistrer(CardType cardType);

    void supprimer(Long id);

    List<CardType> lister();

    Optional<CardType> trouver(Long id);
}
