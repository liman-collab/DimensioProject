package com.brotherssweets.bsmanagement.repositories;

import com.brotherssweets.bsmanagement.domain.Porosia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorosiaRepository extends CrudRepository<Porosia,Long> {
    @Override
    Iterable<Porosia> findAllById(Iterable<Long> iterable);
}
