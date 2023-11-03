package com.blog.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.binding.Employee;
import com.blog.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private  EmpRepository repo;
	public boolean saveEmployee( Employee employee) {		
		employee = repo.save(employee);
		return employee.getId()>0;
		
	}
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}
	 
}
