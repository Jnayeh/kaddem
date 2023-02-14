package com.esprit.alternance.kaddem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.alternance.kaddem.models.Etudiant;
import com.esprit.alternance.kaddem.models.Niveau;

interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    public List<Etudiant> findByDepartmentIdDepartment(Long idDepartment);
    public List<Etudiant> findByequipesNiveau(Niveau n);
}