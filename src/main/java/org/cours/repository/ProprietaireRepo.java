package org.cours.repository;

import java.util.List;

import org.cours.modele.Proprietaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "proprietaires") // expose automatiquement via Spring Data REST
public interface ProprietaireRepo extends CrudRepository<Proprietaire, Long> {

    @Override
    List<Proprietaire> findAll();

    List<Proprietaire> findByNom(@Param("nom") String nom);

    List<Proprietaire> findByEmail(@Param("email") String email);
}
