package domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Destination {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("code")
	private String zipcode;
	
	@JsonProperty("province")
	private String province;
	
	public Destination(String name, String zipcode, String province) {
		setName(name);
		setZipcode(zipcode);
		setProvince(province);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
}
