package com.sample.flowershop;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="manager_id")
	private Long id;

	@Column(length=50)
	private String firstName;

	@Column(length=50)
	private String lastName;

	@Transient
	private String fullName = lastName + firstName;

	private Date hireDate;
	
	@ManyToOne
	@JoinColumn(name="shop_id")
	private FlowerShop shop;

	public Long getId() {
		return id;
	}

	public FlowerShop getShop() {
		return shop;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
