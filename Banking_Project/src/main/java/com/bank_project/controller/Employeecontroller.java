package com.bank_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank_project.entity.Account;
import com.bank_project.entity.Employee;
import com.bank_project.entity.User;
import com.bank_project.service.Employeeservice;

@RestController
@RequestMapping("employee")
public class Employeecontroller {
	@Autowired
	Employeeservice service;

	@GetMapping("/")
	public List<Employee> getall() {
		return service.getall();
	}

	@GetMapping("/{username}/{age}/{address}")
	public List<User> getdetail(@PathVariable("username") String username, @PathVariable("age") int age,
			@PathVariable("address") String address) {
		return service.getdetail(username, age, address);
	}

	@DeleteMapping("/{accountnumber}")
	public List<Account> deletebyaccountnumber(@PathVariable("accountnumber") long accountnumber) {

		return service.deletebyaccountnumber(accountnumber);
	}

	@PutMapping("/{id}")
	public void getupdate(@RequestBody User user) {

		service.getupdate(user);
	}

}
