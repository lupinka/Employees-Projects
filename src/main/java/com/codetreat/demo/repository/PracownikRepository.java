package com.codetreat.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codetreat.demo.entity.PracownikEntity;

@Repository
public interface PracownikRepository extends CrudRepository<PracownikEntity, Long> {

    @Query("FROM PracownikEntity ")
    public List<PracownikEntity> getAll();
}
