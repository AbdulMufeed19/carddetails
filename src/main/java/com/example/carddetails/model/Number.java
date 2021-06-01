package com.example.carddetails.model;

public class Number{
    public int length;
    public boolean luhn;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isLuhn() {
		return luhn;
	}
	public void setLuhn(boolean luhn) {
		this.luhn = luhn;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Number [length=");
		builder.append(length);
		builder.append(", luhn=");
		builder.append(luhn);
		builder.append("]");
		return builder.toString();
	}
    
    
    
}