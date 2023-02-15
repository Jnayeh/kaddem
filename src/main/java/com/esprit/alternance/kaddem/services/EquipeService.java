package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Equipe;

import java.util.List;

public interface EquipeService {

    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe(Equipe e);

    Equipe retrieveEquipe(Integer idEquipe);
}
