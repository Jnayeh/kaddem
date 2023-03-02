package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Etudiant;
import com.esprit.alternance.kaddem.models.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    List<Etudiant> findByDepartmentIdDepartment(Integer idDepartment);

    List<Etudiant> findByequipesNiveau(Niveau n);
}