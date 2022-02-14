package fr.nini;

import fr.nini.entities.Login;
import fr.nini.entities.Role;
import fr.nini.entities.Utilisateur;
import fr.nini.repository.LoginRepository;
import fr.nini.repository.RoleRepository;
import fr.nini.repository.UtilisateurRepository;
import fr.nini.enumeration.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NiniTesteuseApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiniTesteuseApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RoleRepository roleRepository, UtilisateurRepository utilisateurRepository, LoginRepository loginRepository) {
        return args -> {
            // creations des Roles UTILISATEUR et ADMINISTRATEUR
            Role utilisateur = new Role(null, Type.UTILISATEUR);
            Role administrateur = roleRepository.save(new Role(null, Type.ADMINISTRATEUR));
            roleRepository.save(new Role(null, Type.UTILISATEUR));

            Login log1 = new Login(null,"elvis","123456");
            Login log2 = new Login(null,"nini","987456");
            loginRepository.save(log1);
            loginRepository.save(log2);

            Utilisateur elvis = new Utilisateur(null, "elvis", "messiaen", "elvism72@hotmail.com", administrateur,log1);
            Utilisateur nini = new Utilisateur(null, "nini", "dumalin", "ninim1976@hotmail.fr", administrateur,log2);
            utilisateurRepository.save(elvis);
            utilisateurRepository.save(nini);

        };
    }
}

