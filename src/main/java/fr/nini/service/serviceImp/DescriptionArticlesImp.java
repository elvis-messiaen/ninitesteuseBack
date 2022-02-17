package fr.nini.service.serviceImp;

import fr.nini.dtos.DescriptionArticles.DescriptionArticlesDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesDeleteDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesSaveDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DescriptionArticlesImp implements DescriptionArticlesRepository {
    @Autowired
    private DescriptionArticlesRepository descriptionArticlesRepository;

    @Override
    public DescriptionArticlesSaveDTO save(DescriptionArticlesSaveDTO descriptionArticlesSaveDTO) {
        return descriptionArticlesRepository.save(descriptionArticlesSaveDTO);
    }

    @Override
    public DescriptionArticlesUpdateDTO update(DescriptionArticlesUpdateDTO descriptionArticlesUpdateDTO) {
        return descriptionArticlesRepository.update(descriptionArticlesUpdateDTO);
    }

    @Override
    public void delete(Long id) {
        DescriptionArticlesDeleteDTO descriptionArticlesDeleteDTO;
    }

    @Override
    public List<DescriptionArticlesDTO> findAll() {
        return descriptionArticlesRepository.findAll();
    }

    @Override
    public Optional<DescriptionArticlesDTO> findById(Long id) {
        return descriptionArticlesRepository.findById(id);
    }
}
