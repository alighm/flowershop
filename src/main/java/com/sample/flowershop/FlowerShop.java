package com.sample.flowershop;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

=======
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
>>>>>>> 6c0dacbb1ec2da6280f17d205b0c943d5fb028e3
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="SHOP")
=======
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
>>>>>>> 6c0dacbb1ec2da6280f17d205b0c943d5fb028e3
public class FlowerShop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
	@Column(name="SHOP_ID")
=======
>>>>>>> 6c0dacbb1ec2da6280f17d205b0c943d5fb028e3
	private Long id;

	@Column(length=50)
	private String name;

	@Transient
	private int numFlowerTypes;

<<<<<<< HEAD
	private Map<String,Integer> weeklySales = new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);

	@OneToMany(mappedBy="shop")
	private List<Manager> managers;
=======
	private Map<String,Integer> weeklySales = new HashMap<String,Integer>();

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="FLOWERSHOP_ID")
	private List<Manager> managers = new ArrayList<Manager>();
>>>>>>> 6c0dacbb1ec2da6280f17d205b0c943d5fb028e3

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
