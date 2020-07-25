package com.nineone.social.model;

public class Seat {
    private String type;
    private Integer height;
    
	public Seat() {
		super();
	}
	public Seat(String type, Integer height) {
		super();
		this.type = type;
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
}