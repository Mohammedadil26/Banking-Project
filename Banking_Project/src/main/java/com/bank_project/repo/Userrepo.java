package com.bank_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank_project.entity.User;

@Repository
public interface Userrepo extends JpaRepository<User,String > {

}
