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
public class LoginDeleteDTO implements Serializable {
    private Long id;

}
