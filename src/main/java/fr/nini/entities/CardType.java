package fr.nini.entities;

import fr.nini.enumeration.TypesCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CardType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypesCard typescard;

    @Size(max = 50)
    @Column(nullable = false)
    private String description;

    @ManyToOne
    private DescriptionArticles descriptionArticles;


    @OneToMany(mappedBy="cardtype")
    private Collection<Photo> photos;
}
