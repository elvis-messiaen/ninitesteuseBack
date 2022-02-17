package fr.nini.service.serviceImp;

import fr.nini.dtos.DescriptionArticles.DescriptionArticlesDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesDeleteDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesSaveDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesUpdateDTO;

import java.util.List;
import java.util.Optional;

public interface DescriptionArticlesRepository {

    DescriptionArticlesSaveDTO save (DescriptionArticlesSaveDTO descriptionArticlesSaveDTO);

    DescriptionArticlesUpdateDTO update(DescriptionArticlesUpdateDTO descriptionArticlesUpdateDTO);

    void delete(Long id);

    List<DescriptionArticlesDTO> findAll();

    Optional<DescriptionArticlesDTO> findById(Long id);

}
