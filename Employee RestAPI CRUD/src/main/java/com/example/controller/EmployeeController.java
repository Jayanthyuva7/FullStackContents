package com.example.controller;

import java.util.ArrayList;
import java.util.Optional;
import com.example.*;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.*;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

import com.example.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employees")
	public String createNewEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Employee Created in database";
	}

	
@GetMapping("/employees/{empid}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable long empid){
	Optional<Employee> emp = employeeRepository.findById(empid);
	if(emp.isPresent()) {
		return new ResponseEntity<Employee>(emp.get(),HttpStatus.FOUND);
	}else {
		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
}

@GetMapping("/employees")
public ResponseEntity<ArrayList> getAllEmployees(){
	ArrayList<Employee> list = new ArrayList<>();
	employeeRepository.findAll().forEach(list::add);
	return new ResponseEntity<ArrayList>(list,HttpStatus.OK);
	
}

@PutMapping("/employees/{empid}")
public String updateEmployeeById(@PathVariable long empid,@RequestBody Employee employee) {
	Optional<Employee> emp = employeeRepository.findById(empid);
	if(emp.isPresent()) {
		Employee existEmp = emp.get();
		
		existEmp.setEmp_name(employee.getEmp_name());
		existEmp.setEmp_salary(employee.getEmp_salary());
		existEmp.setEmp_age(employee.getEmp_age());
		existEmp.setEmp_city(employee.getEmp_city());
		employeeRepository.save(existEmp);
		return "Employee Details against Id " +empid + " Updated";
 	}else {
 		return "Employee Details does not exist for empid " +empid; 
 	}
}

@DeleteMapping("/employees/{empid}")
public String deleteEmployeeByEmpId(@PathVariable Long empid) {
	employeeRepository.deleteById(empid);
	return "Employee Deleted Successfully";
}

@DeleteMapping("/employee")
public String deleteAllEmployee() {
	employeeRepository.deleteAll();
	return "Employee deleted successfully..";
}
}
