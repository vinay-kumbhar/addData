package com.cjc.app.twl.cibilcheck.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.twl.cibilcheck.main.model.Cibil;
@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer>{

}
