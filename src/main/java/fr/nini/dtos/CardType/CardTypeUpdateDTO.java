package fr.nini.dtos.CardType;

import fr.nini.enumeration.TypesCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardTypeUpdateDTO {
    private Long id;
    private TypesCard typesCard;
    private String description;

    //private List<String> lienPhoto;


}
