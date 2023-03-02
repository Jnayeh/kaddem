package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.models.Etudiant;
import com.esprit.alternance.kaddem.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
@AllArgsConstructor
public class EtudiantControlller {
    EtudiantService etudiantService;

    @GetMapping()
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }


    @GetMapping("/{id}")
    public Etudiant getEtdiant(@PathVariable("id") Integer id) {
        return etudiantService.retrieveEtudiant(id);
    }

    @PostMapping()
    public Etudiant addEtdiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping()
    public Etudiant updateEtdiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @PutMapping("/{etId}/{depId}")
    public void assignEtudiantToDepartement(@PathVariable("etId") Integer etId, @PathVariable("depId") Integer depId) {
        etudiantService.assignEtudiantToDepartement(etId, depId);
    }

    @DeleteMapping("/{id}")
    public void deleteEtdiant(@PathVariable("id") Integer id) {
        etudiantService.deleteEtudiant(id);
    }

}
