package com.brotherssweets.bsmanagement.services;

import com.brotherssweets.bsmanagement.domain.Porosia;
import com.brotherssweets.bsmanagement.repositories.PorosiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PorosiaService {

    @Autowired
    private PorosiaRepository porosiaRepository;

    public Porosia saveOrUpdatePorosia(Porosia porosia){

        return porosiaRepository.save(porosia);
    }
}
