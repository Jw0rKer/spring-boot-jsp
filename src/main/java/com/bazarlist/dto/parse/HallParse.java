/**
 * 
 */
package com.bazarlist.dto.parse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bazarlist.dto.parse.feature.FeatureParse;
import com.bazarlist.model.food.MenuParse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author JK
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HallParse {

	private String name;
	private String url;
	@JsonProperty("modir")
	private String managerName;
	private String tel;
	private String mobile;
	private String fax;
	private String address;
	private String email;
	private String website;
	private String description;
	private String featureHtml;
	@JsonProperty("map_url")
	private String mapUrl;

	private List<FeatureParse> feature;
	private List<ImageParse> image;
	private List<MenuParse> menu;

	// -------------------------------------------
	public List<String> getMobileList() {
		if (mobile == null || mobile.trim().isEmpty())
			return null;
		mobile = mobile.trim();
		if (mobile.contains(","))
			return Arrays.asList(mobile.split(","));
		else {
			List<String> r = new ArrayList<>();
			r.add(mobile);
			return r;
		}
	}

	public List<String> getTelList() {
		if (tel == null || tel.trim().isEmpty())
			return null;
		tel = tel.trim();
		if (tel.contains(","))
			return Arrays.asList(tel.split(","));
		else {
			List<String> r = new ArrayList<>();
			r.add(tel);
			return r;
		}
	}

	public String getLongitudeFromMap() {
		if (mapUrl == null || mapUrl.isEmpty())
			return null;
		Matcher matcher = Pattern.compile(".*&ll=([0-9.]+)%2C([0-9.]+).*").matcher(mapUrl);
		if (matcher.matches()) {
			return matcher.group(1);
		} else
			return null;
	}

	public String getLatitudeFromMap() {
		if (mapUrl == null || mapUrl.isEmpty())
			return null;
		Matcher matcher = Pattern.compile(".*&ll=([0-9.]+)%2C([0-9.]+).*").matcher(mapUrl);
		if (matcher.matches()) {
			return matcher.group(2);
		} else
			return null;
	}

	// -------------------------------------------
	public String getName() {
		return name;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public String getFeatureHtml() {
		return featureHtml;
	}

	public void setFeatureHtml(String featureHtml) {
		this.featureHtml = featureHtml;
	}

	public List<FeatureParse> getFeature() {
		return feature;
	}

	public void setFeature(List<FeatureParse> feature) {
		this.feature = feature;
	}

	public List<ImageParse> getImage() {
		return image;
	}

	public void setImage(List<ImageParse> image) {
		this.image = image;
	}

	public List<MenuParse> getMenu() {
		return menu;
	}

	public void setMenu(List<MenuParse> menu) {
		this.menu = menu;
	}

}
