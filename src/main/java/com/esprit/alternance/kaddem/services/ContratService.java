package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Contrat;

import java.util.List;

public interface ContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat e);

    Contrat updateContrat(Contrat e);

    Contrat retrieveContrat(Integer idContrat);

    void deleteContrat(Integer id);
}
