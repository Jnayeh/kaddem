package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Etudiant;

import java.util.List;


public interface EtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    List<Etudiant> findByDepartmentIdDepartment(Integer idDepartment);

    List<Etudiant> findByequipesNiveauSenior();

    void assignEtudiantToDepartement(Integer etudiantId, Integer departementId);

    void deleteEtudiant(Integer id);
}
