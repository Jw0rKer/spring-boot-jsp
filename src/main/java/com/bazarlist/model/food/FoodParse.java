/**
 * 
 */
package com.bazarlist.model.food;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author JK
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodParse {

	private String name;

	// -------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
