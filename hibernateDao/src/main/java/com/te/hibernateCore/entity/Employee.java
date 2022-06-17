package com.te.hibernateCore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Entity
@Table(name = "emp_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer employeeId;
	@Column(name = "emp_name", unique = true)
	private String employeeName;
	@Column(name = "emp_age")
	private int employeeAge;

	@OneToOne(cascade = CascadeType.ALL)
	ScondaryInfo secondaryinfo;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;
	@ManyToOne(cascade = CascadeType.ALL)
	private Batch batch;
}
