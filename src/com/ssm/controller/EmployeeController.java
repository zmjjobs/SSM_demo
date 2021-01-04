package com.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.Employee;
import com.ssm.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/getAllEmps")
	public String getAllEmps(Map<String,Object> map){
		List<Employee> allEmps = employeeService.getAllEmps();
		map.put("allEmps", allEmps);
		return "list";
	}
}
