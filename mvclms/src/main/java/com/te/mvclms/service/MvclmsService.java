package com.te.mvclms.service;

import org.springframework.stereotype.Service;

import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.UpdatedEmployeeDto;
@Service
public interface MvclmsService {

	public abstract EmployeeDto register(EmployeeDto employeeDto);

	public abstract EmployeeDto getEmployeeDetails(int employeeId);

	public abstract UpdatedEmployeeDto updateEmpDetails(int id, UpdatedEmployeeDto uemployeeDto);
}
