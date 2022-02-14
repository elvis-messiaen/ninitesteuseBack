package fr.nini.controller;

import fr.nini.entities.Photo;
import fr.nini.service.serviceImp.PhotoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PhotoController {
    private PhotoServiceImpl photoService;

    public PhotoController(PhotoServiceImpl photoService) {
        this.photoService = photoService;
    }

    @GetMapping(path = "photo")
    public List<Photo>photoList(){
        return photoService.lister();
    }

    @PostMapping(path = "/photo")
    public Photo save (@RequestBody Photo photo){

        return photoService.enregistrer(photo);
    }

    @PutMapping (path = "/photo")
    public Photo update(@PathVariable Long id, @RequestBody Photo photo){
        photo.setId(id);
        return photoService.enregistrer(photo);
    }

    @DeleteMapping (path = "photo/{id}")
    public void delete (@PathVariable Long id){
        photoService.supprimer(id);
    }
}















