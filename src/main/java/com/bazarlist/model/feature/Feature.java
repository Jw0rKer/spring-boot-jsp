
package com.bazarlist.model.feature;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


/**
 * @author JK
 *
 */
@Entity
public class Feature {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	@ManyToMany()
	private List<HallFeature> hallFeature = new ArrayList<>();

	// -------------------------------------------
	public void addHallFeature(HallFeature hallFeature) {
		this.hallFeature.add(hallFeature);
	}

	// -------------------------------------------
	public Long getId() {
		return id;
	}

	public List<HallFeature> getHallFeature() {
		return hallFeature;
	}

	public void setHallFeature(List<HallFeature> hallFeature) {
		this.hallFeature = hallFeature;
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

	
}
