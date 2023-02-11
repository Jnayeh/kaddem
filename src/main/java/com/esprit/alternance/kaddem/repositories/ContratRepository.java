package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
