package com.nineone.social.service;

import java.util.Date;

import com.nineone.social.model.Bicycle;

public class BicyclePrice {
    private Integer price;
    private Date dateOfPurchase;

	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public int calculatePrice(Bicycle bicycle, Date dateOfPurchase) {

		return 0;
	}
}