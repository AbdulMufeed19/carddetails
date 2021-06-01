package com.example.carddetails.model;

public class Root{
    public Number number;
    public String scheme;
    public String type;
    public String brand;
    public boolean prepaid;
    public Country country;
    public Bank bank;
	public Number getNumber() {
		return number;
	}
	public void setNumber(Number number) {
		this.number = number;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPrepaid() {
		return prepaid;
	}
	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Root [number=");
		builder.append(number);
		builder.append(", scheme=");
		builder.append(scheme);
		builder.append(", type=");
		builder.append(type);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", prepaid=");
		builder.append(prepaid);
		builder.append(", country=");
		builder.append(country);
		builder.append(", bank=");
		builder.append(bank);
		builder.append("]");
		return builder.toString();
	}
    
    
}