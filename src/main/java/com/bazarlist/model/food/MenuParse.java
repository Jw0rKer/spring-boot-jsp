/**
 * 
 */
package com.bazarlist.model.food;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author JK
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuParse {

	private String name;
	@JsonProperty("foods_html")
	private String foodsHtml;
	private List<FoodParse> foods;

	// -------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodHtml() {
		return foodsHtml;
	}

	public void setFoodHtml(String foodHtml) {
		this.foodsHtml = foodHtml;
	}

	public String getFoodsHtml() {
		return foodsHtml;
	}

	public void setFoodsHtml(String foodsHtml) {
		this.foodsHtml = foodsHtml;
	}

	public List<FoodParse> getFoods() {
		return foods;
	}

	public void setFoods(List<FoodParse> foods) {
		this.foods = foods;
	}


}
