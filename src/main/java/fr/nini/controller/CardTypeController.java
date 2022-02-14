package fr.nini.controller;

import fr.nini.entities.CardType;
import fr.nini.service.serviceImp.CardServiceimpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class CardTypeController {
    private CardServiceimpl cardService;

    public CardTypeController(CardServiceimpl cardService) {
        this.cardService = cardService;
    }


    @GetMapping(path = "/cardtype")
    public List<CardType>cardTypeList(){

        return cardService.lister();
    }

    @GetMapping(path = "/cardtype/{id}")
    public Optional<CardType> cardType (@PathVariable Long id) {

        return cardService.trouver(id);
    }

    @PostMapping(path = "/cardtype")
    public CardType save (@RequestBody CardType cardType){

        return cardService.enregistrer(cardType);
    }

    @PutMapping (path = "/cardtype")
    public CardType update(@PathVariable Long id, @RequestBody CardType cardType){
        cardType.setId(id);
        return cardService.enregistrer(cardType);
    }

    @DeleteMapping (path = "cardtype/{id}")
    public void delete (@PathVariable Long id){

        cardService.supprimer(id);
    }
}
