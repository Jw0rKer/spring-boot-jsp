/**
 * 
 */
package com.bazarlist.model.food;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.bazarlist.model.Hall;

/**
 * @author JK
 *
 */
@Entity
public class Menu {

	@ManyToOne()
	private Hall hall;

	@Id
	@GeneratedValue
	private Long id;
	private String name; 
	private Long price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Food> food = new ArrayList<>();

	// -------------------------------------------
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}
	
}
