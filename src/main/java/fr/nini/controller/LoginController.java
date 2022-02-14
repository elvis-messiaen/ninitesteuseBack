package fr.nini.controller;

import fr.nini.entities.Login;
import fr.nini.service.serviceImp.LoginServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Meddiaen elvis
 */

@RestController
@CrossOrigin
public class LoginController {


    private LoginServiceImpl loginService;

    public LoginController(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    // affiche la list des logins check
    @GetMapping(path = "/login")
    public List<Login> loginList() {

        return loginService.lister();
    }

    // affiche un login par son id check
    @GetMapping(path = "/login/{id}")
    public Optional<Login> getLogin(@PathVariable Long id) {

        return loginService.trouver(id);
    }

    //ajouter un login check
    @PostMapping(path = "/login")
    public Login save(@RequestBody Login login) {
        return loginService.enregistrer(login);

    }

    //mise a jour login check
    @PutMapping(path = "/login/{id}")
    public Login update(@PathVariable Long id, @RequestBody Login login) {
        login.setId(id);
        return loginService.enregistrer(login);
    }

    //supprimer un login check
    @DeleteMapping(path = "/login/{id}")
    public void delete(@PathVariable Long id) {

        loginService.supprimer(id);
    }
}
