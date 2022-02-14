package fr.nini.repository;

import fr.nini.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pagerepository extends JpaRepository<Page, Long> {
}
