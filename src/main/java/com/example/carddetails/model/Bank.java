package com.example.carddetails.model;

public class Bank{
    public String name;
    public String url;
    public String phone;
    public String city;
	public String getName() {
		return name;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bank [name=");
		builder.append(name);
		builder.append(", url=");
		builder.append(url);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", city=");
		builder.append(city);
		builder.append("]");
		return builder.toString();
	}
    
    
}
