package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.Universite;
import com.esprit.alternance.kaddem.repositories.UniversiteRepository;
import com.esprit.alternance.kaddem.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.hibernate.boot.MappingNotFoundException;
import org.hibernate.boot.jaxb.Origin;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements UniversiteService {

    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        // TODO Auto-generated method stub
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        // TODO Auto-generated method stub
        return universiteRepository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        // TODO Auto-generated method stub
        retrieveUniversite(e.getIdUnive());
        return universiteRepository.save(e);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        // TODO Auto-generated method stub
        try {
            return universiteRepository.findById(idUniversite).get();
        } catch (Exception exception) {
            throw new MappingNotFoundException("Not found", new Origin(SourceType.RESOURCE, Universite.class.getName()));
        }
    }

}
