package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.Equipe;
import com.esprit.alternance.kaddem.services.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipeServiceImpl implements EquipeService {
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return null;
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return null;
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return null;
    }
}
