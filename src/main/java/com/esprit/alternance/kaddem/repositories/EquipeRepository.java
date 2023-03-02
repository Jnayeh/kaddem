package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}
