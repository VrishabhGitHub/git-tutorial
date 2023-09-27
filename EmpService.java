package com.emp.service;

import java.util.List;

import com.emp.entities.Employee;

public interface EmpService {

	public Employee getEmpById(int id);
	public List<Employee> getAllEmp();
	public Employee addEmp(Employee employee);
	public Employee updateEmpById(int id, Employee employee);
	public Employee deleteEmpById(int id);
	public void deleteAllEmp();
}
