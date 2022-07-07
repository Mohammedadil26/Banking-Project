package com.bank_project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank_project.entity.Account;
import com.bank_project.entity.Employee;
import com.bank_project.entity.User;
import com.bank_project.repo.Accountrepo;
import com.bank_project.repo.Employeerepo;
import com.bank_project.repo.Userrepo;
import com.bank_project.service.Employeeservice;

@Component
public class Employeeserviceimpl implements Employeeservice {
	@Autowired
	Userrepo repo;
	@Autowired
	Accountrepo arepo;
	@Autowired
	Userrepo urepo;
	@Autowired
	Employeerepo erepo;

	@Override
	public List<User> getdetail(String username, int age, String address) {

		return repo.findAll();
	}

	@Override
	public List<Account> deletebyaccountnumber(long accountnumber) {

		arepo.deleteById(accountnumber);
		return arepo.findAll();
	}

	@Override
	public void getupdate(User user) {

		urepo.save(user);
	}

	@Override
	public List<Employee> getall() {
		// TODO Auto-generated method stub
		return erepo.findAll();
	}

}
