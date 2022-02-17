package fr.nini.dtos.DescriptionArticles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescriptionArticlesUpdateDTO {
    private Long id;
    private String nomArticle;
}
