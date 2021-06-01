package com.example.carddetails.model;

public class Country{
    public String numeric;
    public String alpha2;
    public String name;
    public String emoji;
    public String currency;
    public int latitude;
    public int longitude;
	public String getNumeric() {
		return numeric;
	}
	public void setNumeric(String numeric) {
		this.numeric = numeric;
	}
	public String getAlpha2() {
		return alpha2;
	}
	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmoji() {
		return emoji;
	}
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [numeric=");
		builder.append(numeric);
		builder.append(", alpha2=");
		builder.append(alpha2);
		builder.append(", name=");
		builder.append(name);
		builder.append(", emoji=");
		builder.append(emoji);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append("]");
		return builder.toString();
	}
    
    
}
