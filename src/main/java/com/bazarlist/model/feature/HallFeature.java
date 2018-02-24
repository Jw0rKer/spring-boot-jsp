/**
 * 
 */
package com.bazarlist.model.feature;

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
 */
@Entity
public class HallFeature {

	@ManyToOne()
	private Hall hall;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(mappedBy = "hallFeature", cascade = CascadeType.ALL)
	private List<Feature> feature = new ArrayList<>();
	private String value;

	// -------------------------------------------

	public void addFeature(String name) {
		Feature feature = new Feature();
		feature.setName(name);
		feature.addHallFeature(this);
		this.feature.add(feature);
	}

	// -------------------------------------------
	public Hall getHall() {
		return hall;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public List<Feature> getFeature() {
		return feature;
	}

	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
