package fr.nini.dtos.login;

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
public class LoginSaveDTO implements Serializable {
    private String login;
    private String mdp;


}
