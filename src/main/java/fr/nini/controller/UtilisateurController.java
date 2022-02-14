package fr.nini.controller;

import fr.nini.entities.Utilisateur;
import fr.nini.service.serviceImp.UtilisateurServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Meddiaen elvis
 */
@RestController
@CrossOrigin
public class UtilisateurController {
/*
    pour l'instance du service à la demande
 */
 private UtilisateurServiceImpl utilisateurService;

    public UtilisateurController(UtilisateurServiceImpl utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    /**
     * controller sert à parcourir la bdd
     * @return
     */
    // affiche la list des utilisateurs check
    @GetMapping(path = "/utilisateur")
    public List<Utilisateur> utilisateurList() {

        return utilisateurService.lister();
    }

    // affiche un utilisateur par son id check
    @GetMapping(path = "/utilisateur/{id}")
    public Optional<Utilisateur> getUtilisateur (@PathVariable Long id) {

        return utilisateurService.trouver(id);
    }

    //ajouter un utilisateur check
    @PostMapping(path = "/utilisateur")
    public Utilisateur save(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.enregistrer(utilisateur);

    }

    //mise a jour utilisateur check
    //PathVariable => { id } id => type
    //RequestBody => recupere le corps de la methode
    @PutMapping(path = "/utilisateur/{id}")
    public Utilisateur update(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        utilisateur.setId(id);
        return utilisateurService.enregistrer(utilisateur);
    }

    //supprimer un utilisateur check
    @DeleteMapping(path = "/utilisateur/{id}")
    public void delete(@PathVariable Long id) {

        utilisateurService.supprimer(id);
    }

}
