package fr.nini.repository;

import fr.nini.entities.DescriptionArticles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionArticlesRepository extends JpaRepository<DescriptionArticles,Long> {
}
