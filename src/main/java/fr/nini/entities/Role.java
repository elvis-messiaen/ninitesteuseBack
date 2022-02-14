package fr.nini.entities;


import fr.nini.enumeration.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //declaration en java des roles sous forme Enum + declarations en base de données en String
    /*
        @Enumerated(EnumType.STRING) => sa sert a definir le comportement en bdd
        STRING => il sera enregistré en String en base de donné
        ORDINAL => il sera enregistré en int en base de donné
     */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;

}
