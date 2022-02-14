package fr.nini.controller;

import fr.nini.entities.Role;
import fr.nini.service.serviceImp.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Meddiaen elvis
 */

@RestController
@CrossOrigin
public class RoleController {

    private RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
        this.roleService = roleService;
    }


    // affiche la list des roles check
    @GetMapping(path = "/role")
    public List<Role> roleList() {

        return roleService.lister();
    }

    // affiche un role par id check
    @GetMapping(path = "/role/{id}")
    public Optional<Role> getRole(@PathVariable Long id) {
        return roleService.trouver(id);
    }

    //ajouter un role check
    @PostMapping(path = "/role")
    public Role save(@RequestBody Role role) {
        return roleService.enregistrer(role);
    }

    //mise a jour role  marche seulement si l'on change par ceux qui sont définis dans l'enum
    @PutMapping(path = "/role/{id}")
    public Role update(@PathVariable Long id, @RequestBody Role role) {
        role.setId(id);
        return roleService.enregistrer(role);
    }

    //supprimer un role
    @DeleteMapping(path = "/role/{id}")
    public void delete(@PathVariable Long id) {

        roleService.supprimer(id);
    }

}
