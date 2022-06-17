package com.te.learning_spring_rest.controleer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
@GetMapping(path="/employee",produces= { MediaType.APPLICATION_JSON_VALUE })
	public String getEmployee() {
		return "This is Employee Data!";
	}
@GetMapping(path="/employee/{employeeId}",produces = {MediaType.APPLICATION_JSON_VALUE})
public String getEmployee(@PathVariable int employeeId) {
	return "This is Employee data : "+employeeId;
}
}
