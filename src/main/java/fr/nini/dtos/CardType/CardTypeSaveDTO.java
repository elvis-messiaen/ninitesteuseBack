package fr.nini.dtos.CardType;

import fr.nini.enumeration.TypesCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardTypeSaveDTO {

    private TypesCard typesCard;
    private String description;


}
