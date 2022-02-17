package fr.nini.dtos.CardType;

import fr.nini.enumeration.TypesCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardTypeDTO {
    private Long id;
    private TypesCard typesCard;
    private String description;



}
