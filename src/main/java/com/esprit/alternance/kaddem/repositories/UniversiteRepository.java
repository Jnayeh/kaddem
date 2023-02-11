package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Contrat;
import com.esprit.alternance.kaddem.models.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
