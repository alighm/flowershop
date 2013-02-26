package com.sample.flowershop;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SHOP")
public class FlowerShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SHOP_ID")
	private Long id;

	@Column(length=50)
	private String name;

	@Transient
	private int numFlowerTypes;

	private Map<String,Integer> weeklySales = new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);

	@OneToMany(mappedBy="shop")
	private List<Manager> managers;

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
