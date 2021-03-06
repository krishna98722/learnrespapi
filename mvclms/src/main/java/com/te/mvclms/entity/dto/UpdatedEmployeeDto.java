package com.te.mvclms.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdatedEmployeeDto {
	private int id;
	private String name;
	private String email;
	private int age;
}
