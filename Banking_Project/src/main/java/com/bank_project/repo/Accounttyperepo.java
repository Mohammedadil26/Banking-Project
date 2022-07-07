package com.bank_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_project.entity.Accounttype;
@Repository
public interface Accounttyperepo extends JpaRepository<Accounttype, Long>{

}
