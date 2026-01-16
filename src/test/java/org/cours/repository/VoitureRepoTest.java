package org.cours.repository;

import static org.assertj.core.api.Assertions.assertThat;
import org.cours.modele.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class VoitureRepoTest {

    @Autowired
    private VoitureRepo voitureRepo;

    @Test
    public void ajouterVoiture() {
        Voiture voiture = new Voiture("MiolaCar","Uber","Blanche","M-2020", 2021, 180000);
        voitureRepo.save(voiture);  // on utilise save() directement avec MariaDB
        assertThat(voiture.getId()).isNotNull();
    }

    @Test
    public void supprimerVoiture() {
        voitureRepo.save(new Voiture("MiolaCar","Uber","Blanche","M-2020", 2021, 180000));
        voitureRepo.save(new Voiture("MiniCooper","Uber","Rouge","C-2020", 2021, 180000));
        voitureRepo.deleteAll();
        assertThat(voitureRepo.findAll()).isEmpty();
    }
}
