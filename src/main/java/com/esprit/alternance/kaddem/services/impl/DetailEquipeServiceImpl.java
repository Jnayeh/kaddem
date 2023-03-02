package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.DetailEquipe;
import com.esprit.alternance.kaddem.repositories.DetailEquipeRepository;
import com.esprit.alternance.kaddem.services.DetailEquipeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DetailEquipeServiceImpl implements DetailEquipeService {

    DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDetailsEquipes() {
        // TODO Auto-generated method stub
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe e) {
        // TODO Auto-generated method stub
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe e) {
        // TODO Auto-generated method stub
        retrieveDetailEquipe(e.getIdDetailEquipe());
        return detailEquipeRepository.save(e);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe) {
        // TODO Auto-generated method stub
        return detailEquipeRepository.getReferenceById(idDetailEquipe);
    }

}
