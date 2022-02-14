package fr.nini.service.serviceImp;

import fr.nini.entities.Login;
import fr.nini.repository.LoginRepository;
import fr.nini.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LoginServiceImpl implements LoginService {
    private LoginRepository loginRepository;

    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Login enregistrer(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public void supprimer(Long id) {
        loginRepository.deleteById(id);
    }

    @Override
    public List<Login> lister() {
        return loginRepository.findAll();
    }

    @Override
    public Optional<Login> trouver(Long id) {
        return loginRepository.findById(id);
    }
}
