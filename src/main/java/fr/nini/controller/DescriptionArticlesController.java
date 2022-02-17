package fr.nini.controller;

import fr.nini.dtos.DescriptionArticles.DescriptionArticlesDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesSaveDTO;
import fr.nini.dtos.DescriptionArticles.DescriptionArticlesUpdateDTO;
import fr.nini.entities.DescriptionArticles;
import fr.nini.service.serviceImp.DescriptionArticlesImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class DescriptionArticlesController {

    private DescriptionArticlesImp descriptionArticlesImp;

    public DescriptionArticlesController(DescriptionArticlesImp descriptionArticlesImp) {
        this.descriptionArticlesImp = descriptionArticlesImp;
    }

    @GetMapping(path = "/descriptionArticles")
    public List<DescriptionArticlesDTO> descriptionArticles() {
        return  descriptionArticlesImp.findAll();
    }

    @GetMapping(path = "/descriptionArticles/{id}")
    public Optional<DescriptionArticlesDTO> descriptionArticles (@PathVariable Long id) {
        return descriptionArticlesImp.findById(id);
    }

    @PostMapping(path = "/descriptionArticles")
    public DescriptionArticlesSaveDTO save (@RequestBody DescriptionArticlesSaveDTO descriptionArticlesSaveDTO){
        return  descriptionArticlesImp.save(descriptionArticlesSaveDTO);
    }

    @PutMapping (path = "/descriptionArticles")
    public DescriptionArticlesUpdateDTO update(@PathVariable Long id, @RequestBody DescriptionArticlesUpdateDTO descriptionArticlesUpdateDTO) {
        descriptionArticlesUpdateDTO.setId(id);
        return descriptionArticlesImp.update(descriptionArticlesUpdateDTO);
    }

    @DeleteMapping(path = "/descriptionArticles/{id}")
    public void delete (@PathVariable Long id){
        descriptionArticlesImp.delete(id);
    }


}























