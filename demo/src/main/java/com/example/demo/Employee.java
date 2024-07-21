package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private String employeeNumber;
	
	private int employeeSalary;

	/*
	 * public int getEmployeeId() { return employeeId; }
	 * 
	 * public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
	 * 
	 * public String getEmployeeName() { return employeeName; }
	 * 
	 * public void setEmployeeName(String employeeName) { this.employeeName =
	 * employeeName; }
	 * 
	 * public String getEmployeeNumber() { return employeeNumber; }
	 * 
	 * public void setEmployeeNumber(String employeeNumber) { this.employeeNumber =
	 * employeeNumber; }
	 * 
	 * public int getEmployeeSalary() { return employeeSalary; }
	 * 
	 * public void setEmployeeSalary(int employeeSalary) { this.employeeSalary =
	 * employeeSalary; }
	 * 
	 */

}
