package fr.nini.service.serviceImp;

import fr.nini.entities.CardType;
import fr.nini.repository.CardTypeRepository;
import fr.nini.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceimpl implements CardService {
    @Autowired
    private CardTypeRepository cardTypeRepository;

    public CardServiceimpl(CardTypeRepository cardTypeRepository) {
        this.cardTypeRepository = cardTypeRepository;
    }

    @Override
    public CardType enregistrer(CardType cardType) {
        return cardTypeRepository.save(cardType);
    }

    @Override
    public void supprimer(Long id) {
        cardTypeRepository.deleteById(id);
    }

    @Override
    public List<CardType> lister() {
        return cardTypeRepository.findAll();
    }

    @Override
    public Optional<CardType> findById(Long id) {

        return cardTypeRepository.findById(id);
    }
}
