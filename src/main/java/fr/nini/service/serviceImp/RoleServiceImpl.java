package fr.nini.service.serviceImp;

import fr.nini.entities.Role;
import fr.nini.repository.RoleRepository;
import fr.nini.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public Role enregistrer(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void supprimer(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public List<Role> lister() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> trouver(Long id) {
        return roleRepository.findById(id);
    }
}
