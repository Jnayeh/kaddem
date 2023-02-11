package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Contrat;
import com.esprit.alternance.kaddem.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
