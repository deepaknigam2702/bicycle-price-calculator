package com.nineone.social.model;

public class Wheel {
	
	private String tyreType;
	private String wheelType;
	
	public String getTyreType() {
		return tyreType;
	}
	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	public String getWheelType() {
		return wheelType;
	}
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	
	public Wheel() {
		super();
	}
	public Wheel(String tyreType, String wheelType) {
		super();
		this.tyreType = tyreType;
		this.wheelType = wheelType;
	}
}