package com.nineone.social.model;

public class Frame {
    private Integer height;
    private String frameType;
    
	public Frame() {
		super();
	}

	public Frame(Integer height, String frameType) {
		super();
		this.height = height;
		this.frameType = frameType;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getFrameType() {
		return frameType;
	}

	public void setFrameType(String frameType) {
		this.frameType = frameType;
	}
}
