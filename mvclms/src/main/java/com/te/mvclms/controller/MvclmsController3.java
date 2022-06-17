package com.te.mvclms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.te.mvclms.entity.Employee;
import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.UpdatedEmployeeDto;
import com.te.mvclms.service.MvclmsService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping(path = "/c3")
public class MvclmsController3 {
	private final MvclmsService mvclmsService;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	@RequestMapping(path = "/register2", method = RequestMethod.POST)
	public String contact(HttpServletRequest reqvest, Model model) {
		String name = reqvest.getParameter("name");
		String email = reqvest.getParameter("email");
		int age = Integer.parseInt(reqvest.getParameter("age"));
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("age", age);

		return "contact";
	}

	/* view to controller */
	@RequestMapping(path = "/register3", method = RequestMethod.POST)
	public String register1(@ModelAttribute EmployeeDto employeeDto, Model model) {
		// ToDo: Logic to save data in database
		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "welcome";
	}

	/* View to Controller */
	@RequestMapping(path = "/register4", method = RequestMethod.POST)
	public String register(@ModelAttribute EmployeeDto employeeDto, Model model) {
		/* Using Service to use repository */
		employeeDto = mvclmsService.register(employeeDto);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "welcome";
	}

	@RequestMapping(path = "/employee/{employeeId}", method = RequestMethod.GET)
	public String getEmployeeDetails(@PathVariable int employeeId, Model model) {

		/* Using service to use repository to get data */
		EmployeeDto employeeDto = mvclmsService.getEmployeeDetails(employeeId);

		model.addAttribute("name", employeeDto.getName());
		model.addAttribute("email", employeeDto.getEmail());
		model.addAttribute("age", employeeDto.getAge());
		return "profile";
	}
	
	//update
	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	public String update() {
		return "updateinfo";
		
	}

	@RequestMapping(path = "/employee/update", method = RequestMethod.POST)
	public String updateEmpInfo(@ModelAttribute UpdatedEmployeeDto uemployeeDto, Model model) {
		
		/* using service to use repository for update data */
		UpdatedEmployeeDto employeeDto=mvclmsService.updateEmpDetails(uemployeeDto.getId(),uemployeeDto);
		model.addAttribute("name", uemployeeDto.getName());
		model.addAttribute("email", uemployeeDto.getEmail());
		model.addAttribute("age", uemployeeDto.getAge());

		return "welcome";
	}

}
