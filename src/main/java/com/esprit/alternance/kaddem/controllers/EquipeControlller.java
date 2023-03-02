package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.models.Equipe;
import com.esprit.alternance.kaddem.services.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipes")
@AllArgsConstructor
public class EquipeControlller {
    EquipeService equipeService;

    @GetMapping()
    public List<Equipe> getAllEquipes() {
        return equipeService.retrieveAllEquipes();
    }

    @GetMapping("/{id}")
    public Equipe getEquipe(@PathVariable("id") Integer id) {
        return equipeService.retrieveEquipe(id);
    }

    @PostMapping()
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }

    @PutMapping()
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipe(@PathVariable("id") Integer id) {
        equipeService.deleteEquipe(id);
    }

}
