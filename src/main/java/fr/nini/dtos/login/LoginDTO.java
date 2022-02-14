package fr.nini.dtos.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Meddiaen elvis
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO implements Serializable {
    private Long id;
    private String login;
    private String mdp;


}
