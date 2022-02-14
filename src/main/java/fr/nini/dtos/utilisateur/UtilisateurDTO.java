package fr.nini.dtos.utilisateur;


import fr.nini.entities.Login;
import fr.nini.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author Meddiaen elvis
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDTO implements Serializable {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Role role;
    private Login login;


}
