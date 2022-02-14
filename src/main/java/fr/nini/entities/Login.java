package fr.nini.entities;

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
@Entity
public class Login implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String login;

    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String mdp;


}
