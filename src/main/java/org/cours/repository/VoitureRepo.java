package org.cours.repository;

import java.util.List;

import org.cours.modele.Voiture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3001")
@RepositoryRestResource
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

    @Override
    List<Voiture> findAll();

    List<Voiture> findByModele(@Param("modele") String modele);

    List<Voiture> findByCouleur(@Param("couleur") String couleur);
}
