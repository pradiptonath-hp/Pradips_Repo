package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.binding.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
