package com.nineone.social.model;

public class ChainAssembly {
    private Integer numberOfGears;
    private Boolean autoGear;
    
	public ChainAssembly() {
		super();
	}

	public ChainAssembly(Integer numberOfGears, Boolean autoGear) {
		super();
		this.numberOfGears = numberOfGears;
		this.autoGear = autoGear;
	}
	
	public Integer getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(Integer numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	public Boolean getAutoGear() {
		return autoGear;
	}

	public void setAutoGear(Boolean autoGear) {
		this.autoGear = autoGear;
	}
}