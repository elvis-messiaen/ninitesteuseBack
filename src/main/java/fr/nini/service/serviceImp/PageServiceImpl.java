package fr.nini.service.serviceImp;

import fr.nini.entities.Page;
import fr.nini.repository.Pagerepository;
import fr.nini.service.Pageservice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PageServiceImpl implements Pageservice {
    private Pagerepository pagerepository;

    public PageServiceImpl(Pagerepository pagerepository) {
        this.pagerepository = pagerepository;
    }

    @Override
    public Page enregistrer(Page page) {
        return pagerepository.save(page);
    }

    @Override
    public void supprimer(Long id) {
        pagerepository.deleteById(id);
    }

    @Override
    public List<Page> lister() {
        return pagerepository.findAll();
    }

    @Override
    public Optional<Page> trouver(Long id) {
        return pagerepository.findById(id);
    }
}
