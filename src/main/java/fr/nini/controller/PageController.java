package fr.nini.controller;

import fr.nini.entities.Page;
import fr.nini.service.Pageservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PageController {
    private Pageservice pageservice;

    public PageController(Pageservice pageservice) {
        this.pageservice = pageservice;
    }

    @GetMapping
    public List<Page> findall ( ){
        return pageservice.lister();
    }

    @GetMapping("{id}")
    public Optional<Page> findById (@PathVariable Long id) {
        return pageservice.trouver(id);
    }

    @PostMapping()
    public Page save (@RequestBody Page page){
        return  pageservice.enregistrer(page);
    }

    @PutMapping("{id}")
    public Page update (@RequestBody Page page,@PathVariable Long id){
        return pageservice.enregistrer(page);
    }

    @DeleteMapping ("{id}")
    public void delete (@PathVariable Long id){
        pageservice.supprimer(id);
    }
}
