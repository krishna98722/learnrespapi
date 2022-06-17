package com.te.mvclms.service.implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.mvclms.entity.Employee;
import com.te.mvclms.entity.dto.EmployeeDto;
import com.te.mvclms.entity.dto.UpdatedEmployeeDto;
import com.te.mvclms.repository.MvclmsRepository;
import com.te.mvclms.service.MvclmsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MvclmsServiceImplementation1 implements MvclmsService {
	private final MvclmsRepository mvclmsRepository;

	@Override
	public EmployeeDto register(EmployeeDto employeeDto) {
		Employee employee = new Employee();

		/* To Convert from EmployeeDto to Employee */
		BeanUtils.copyProperties(employeeDto, employee);

		/* Using Repository to Save Data */
		Employee register = mvclmsRepository.register(employee);

		/* To Convert From Employee to EmployeeDto */
		BeanUtils.copyProperties(register, employeeDto);
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeDetails(int employeeId) {
		/* Using repository to get employee data */
		Employee employee = mvclmsRepository.findByEmployeeId(employeeId);
		
		EmployeeDto employeeDto = new EmployeeDto();
		
		/* To convert from Employee to EmployeeDto */
		BeanUtils.copyProperties(employee, employeeDto);

		return employeeDto;
	}

	@Override
	public UpdatedEmployeeDto updateEmpDetails(int id, UpdatedEmployeeDto uemployeeDto) {
		// TODO logic for get data from repository
		Employee employee = mvclmsRepository.findByEmployeeId(id);
		UpdatedEmployeeDto updatedEmployeeDto= new UpdatedEmployeeDto();
		/* to update details in Employee */
		BeanUtils.copyProperties(updatedEmployeeDto, employee);
		
		/* to store updated employee i db */
		Employee employee2 = mvclmsRepository.register(employee);
		
		/* To convert from Employee to EmployeeDto */
		BeanUtils.copyProperties(employee2, updatedEmployeeDto);

		return updatedEmployeeDto;
		
	}

}
