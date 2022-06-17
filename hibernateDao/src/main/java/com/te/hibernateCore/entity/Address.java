package com.te.hibernateCore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "address_table")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer addressId;
	@Column(name = "doorNo_id")
	private String doorNo;
	@Column(name = "street_id")
	private String street;
	@Column(name = "locality_id")
	private String locality;
	@Column(name = "pincode_id")
	private Integer pincode;
	@Column(name = "address_type")
	private String addressType;
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
}
