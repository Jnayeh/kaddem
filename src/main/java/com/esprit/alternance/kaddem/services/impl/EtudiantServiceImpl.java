package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.Department;
import com.esprit.alternance.kaddem.models.Etudiant;
import com.esprit.alternance.kaddem.models.Niveau;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.EtudiantRepository;
import com.esprit.alternance.kaddem.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements EtudiantService {

    EtudiantRepository etudiantRepository;
    DepartmentRepository departmentRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        // TODO Auto-generated method stub
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        // TODO Auto-generated method stub
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        // TODO Auto-generated method stub
        Etudiant etudiant = this.retrieveEtudiant(e.getIdEtudiant());
        if (etudiant == null)
            throw new ServerErrorException("Could not find etudiant");
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        // TODO Auto-generated method stub
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public List<Etudiant> findByDepartmentIdDepartment(Integer idDepartment) {
        return etudiantRepository.findByDepartmentIdDepartment(idDepartment);
    }


    @Override
    public List<Etudiant> findByequipesNiveauSenior() {
        // TODO Auto-generated method stub
        Niveau n = Niveau.SENIOR;
        return etudiantRepository.findByequipesNiveau(n);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Department department = departmentRepository.findById(departementId).get();
        Etudiant etudiant = etudiantRepository.findById(etudiantId).get();
        etudiant.setDepartment(department);
        etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
    }

}
