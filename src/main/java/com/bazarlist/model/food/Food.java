/**
 * 
 */
package com.bazarlist.model.food;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author JK
 *
 */
@Entity
public class Food {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Enumerated(EnumType.STRING)
	private FoodType foodType;
	
	//----------------------------------------
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
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}


}
