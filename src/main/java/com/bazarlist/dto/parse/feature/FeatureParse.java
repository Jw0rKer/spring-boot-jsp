/**
 * 
 */
package com.bazarlist.dto.parse.feature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author JK
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureParse {
	private String name;
	private Boolean active;


	// -------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
