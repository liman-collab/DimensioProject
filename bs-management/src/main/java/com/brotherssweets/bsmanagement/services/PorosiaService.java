package com.brotherssweets.bsmanagement.services;

import com.brotherssweets.bsmanagement.domain.Porosia;
import com.brotherssweets.bsmanagement.exceptions.PorosiaIdException;
import com.brotherssweets.bsmanagement.repositories.PorosiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PorosiaService {

    @Autowired
    private PorosiaRepository porosiaRepository;

    public Porosia saveOrUpdatePorosia(Porosia porosia){

        try {
            porosia.setPorosiaIdentifier(porosia.getPorosiaIdentifier().toUpperCase());
            return porosiaRepository.save(porosia);
        }catch (Exception e){
            throw new PorosiaIdException("Porosia ID '"+porosia.getPorosiaIdentifier().toUpperCase()+"' already exists");
        }

    }

    public Porosia findPorosiaByIdentifier(String porosiaId){

        Porosia porosia = porosiaRepository.findByPorosiaIdentifier(porosiaId.toUpperCase());

        if (porosia==null){
            throw new PorosiaIdException("Porosia ID '"+porosiaId+"' does not exists");
        }

        return porosia;
    }

    public Iterable<Porosia> findAllProjects(){
        return porosiaRepository.findAll();
    }
}
