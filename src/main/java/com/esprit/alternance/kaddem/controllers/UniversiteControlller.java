package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.models.Universite;
import com.esprit.alternance.kaddem.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universites")
@AllArgsConstructor
public class UniversiteControlller {
    UniversiteService universiteService;

    @GetMapping()
    public List<Universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }


    @GetMapping("/{id}")
    public Universite retrieveUniversite(@PathVariable("id") Integer id) {
        return universiteService.retrieveUniversite(id);
    }

    @PostMapping()
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping()
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }
}
