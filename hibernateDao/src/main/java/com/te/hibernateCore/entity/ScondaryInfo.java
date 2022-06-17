package com.te.hibernateCore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "secInfo_table")
public class ScondaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "secInfo_Pan")
	private String panNumber;
	@Column(name = "emp_adhar")
	private String adharNumber;
	@Column(name = "emp_fn")
	private String fatherName;
	@Column(name = "emp_mn")
	private String mootherName;
	@Column(name = "emp_spouse")
	private String spouseName;
	@Column(name = "emp_psprtNo")
	private String passportNumber;
	@Column(name = "emp_status")
	MaritialStatus maritalStatus;
	@OneToOne(cascade = CascadeType.ALL)
	Employee employee;

}
