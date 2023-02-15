package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Etudiant;
import com.esprit.alternance.kaddem.models.Niveau;

import java.util.List;

public interface EtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);
    
    public List<Etudiant> findByDepartmentIdDepartment(Long idDepartment);
    public List<Etudiant> findByequipesNiveauSenior();
}
