/**
 * 
 */
package com.bazarlist.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.bazarlist.model.feature.HallFeature;
import com.bazarlist.model.food.Menu;

/**
 * @author JK
 *
 */
@Entity
public class Hall {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String managerName;

	@ElementCollection
	private List<String> phone = new ArrayList<>();
	private String fax;
	private String longitude;
	private String latitude;
	private String address;
	private String email;
	private String website;

	@Lob
	private String description;

	@OneToMany(mappedBy = "hall", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Sallon> sallon = new ArrayList<>();

	@OneToMany(mappedBy = "hall", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Menu> menu = new ArrayList<>();

	@OneToMany(mappedBy = "hall", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<HallFeature> hallFeatures = new ArrayList<>();

	// -------------------------------------------
	public void addPhoneList(List<String> phoneList) {
		if (phoneList != null)
			phone.addAll(phoneList);
	}

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

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLongitute() {
		return longitude;
	}

	public void setLongitute(String longitute) {
		this.longitude = longitute;
	}

	public String getLatetute() {
		return latitude;
	}

	public void setLatetute(String latetute) {
		this.latitude = latetute;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public List<Sallon> getSallon() {
		return sallon;
	}

	public void setSallon(List<Sallon> sallon) {
		this.sallon = sallon;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public List<HallFeature> getHallFeatures() {
		return hallFeatures;
	}

	public void setHallFeatures(List<HallFeature> hallFeatures) {
		this.hallFeatures = hallFeatures;
	}



}

