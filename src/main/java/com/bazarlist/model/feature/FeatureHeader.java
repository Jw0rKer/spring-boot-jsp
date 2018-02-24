/**
 * 
 */
package com.bazarlist.model.feature;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * @author JK
 *
 */
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class FeatureHeader {
	@Id
	@GeneratedValue
	private Long id;

	private String title;
	
	/*
	 * @OneToMany(mappedBy = "featureHeader") private Set<Feature> feature;
	 */
	// ------------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
