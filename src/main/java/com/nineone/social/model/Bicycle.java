package com.nineone.social.model;

public class Bicycle {
    private HandleBar handleBar;
    private ChainAssembly chainAssembly;
    private Frame frame;
    private Seat seat;
    private Wheel wheel;
    
	public Bicycle() {
		super();
	}
	
	public Bicycle(HandleBar handleBar, ChainAssembly chainAssembly, Frame frame, Seat seat, Wheel wheel) {
		super();
		this.handleBar = handleBar;
		this.chainAssembly = chainAssembly;
		this.frame = frame;
		this.seat = seat;
		this.wheel = wheel;
	}

	public HandleBar getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(HandleBar handleBar) {
		this.handleBar = handleBar;
	}
	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}
	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}
	public Frame getFrame() {
		return frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
}