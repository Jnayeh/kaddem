package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Universite;

import java.util.List;

public interface UniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite e);

    Universite updateUniversite(Universite e);

    Universite retrieveUniversite(Integer idUniversite);
}
