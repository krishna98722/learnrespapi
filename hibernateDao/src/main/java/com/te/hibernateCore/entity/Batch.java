package com.te.hibernateCore.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "batch_table")
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batch_id")
	private Integer batchId;
	@Column(name = "emp_batchName")
	private String batchName;
	@Column(name = "emp_batchStart")
	LocalDate batchStartDate;
	@Column(name = "emp_batchEnd")
	LocalDate batchEndDate;
	@OneToMany(cascade = CascadeType.ALL)
	List<Employee> employee;
	@OneToOne(cascade = CascadeType.ALL)
	Mentor mentor;
}
