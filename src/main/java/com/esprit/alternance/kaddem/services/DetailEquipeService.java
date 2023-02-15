package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.DetailEquipe;

import java.util.List;

public interface DetailEquipeService {

    List<DetailEquipe> retrieveAllDetailsEquipes();

    DetailEquipe addDetailEquipe(DetailEquipe e);

    DetailEquipe updateDetailEquipe(DetailEquipe e);

    DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe);
}
