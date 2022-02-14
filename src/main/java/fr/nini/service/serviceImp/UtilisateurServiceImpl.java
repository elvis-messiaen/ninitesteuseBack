package fr.nini.service.serviceImp;

import fr.nini.entities.Utilisateur;
import fr.nini.repository.UtilisateurRepository;
import fr.nini.service.UtilisateurService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur enregistrer(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void supprimer(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public List<Utilisateur> lister() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Optional<Utilisateur> trouver(Long id) {
        return utilisateurRepository.findById(id);
    }
}
