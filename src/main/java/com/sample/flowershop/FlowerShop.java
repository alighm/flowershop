package com.sample.flowershop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class FlowerShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length=50)
	private String name;

	@Transient
	private int numFlowerTypes;

	private Map<String,Integer> weeklySales = new HashMap<String,Integer>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="FLOWERSHOP_ID")
	private List<Manager> managers = new ArrayList<Manager>();

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public int getNumFlowerTypes() {
		return numFlowerTypes;
	}

	public void setNumFlowerTypes(int numFlowerTypes) {
		this.numFlowerTypes = numFlowerTypes;
	}

	public Map<String,Integer> getWeeklySales() {
		return weeklySales;
	}

	public void setWeeklySales(Map<String,Integer> weeklySales) {
		this.weeklySales = weeklySales;
	}
}
