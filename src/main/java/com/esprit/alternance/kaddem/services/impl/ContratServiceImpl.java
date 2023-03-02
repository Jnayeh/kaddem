package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.Contrat;
import com.esprit.alternance.kaddem.repositories.ContratRepository;
import com.esprit.alternance.kaddem.services.ContratService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements ContratService {
    ContratRepository contratRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        // TODO Auto-generated method stub
        return contratRepository.findAll();
    }

    @Override
    public Contrat addContrat(Contrat e) {
        // TODO Auto-generated method stub
        return contratRepository.save(e);
    }

    @Override
    public Contrat updateContrat(Contrat e) {
        // TODO Auto-generated method stub
        Contrat Contrat = this.retrieveContrat(e.getIdContract());
        if (Contrat == null)
            throw new ServerErrorException("Could not find Contrat");
        return contratRepository.save(e);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        // TODO Auto-generated method stub
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }

}
