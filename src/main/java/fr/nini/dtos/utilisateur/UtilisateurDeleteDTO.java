package fr.nini.dtos.utilisateur;


import fr.nini.entities.Login;
import fr.nini.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author Meddiaen elvis
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDeleteDTO implements Serializable {
    private Long id;
}
