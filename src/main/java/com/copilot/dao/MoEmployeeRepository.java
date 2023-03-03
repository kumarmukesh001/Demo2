package com.copilot.dao;

import com.copilot.dao.model.MoEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoEmployeeRepository extends CrudRepository<MoEmployee, Long> {

    Optional<MoEmployee> findById(Long id);
    List<MoEmployee> findAll();

    Optional<MoEmployee> findByName(String name);


}
