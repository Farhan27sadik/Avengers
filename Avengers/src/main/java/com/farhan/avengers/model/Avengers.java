package com.farhan.avengers.model;

import org.springframework.stereotype.Component;

@Component
public class Avengers {

	private int avengersId;
	private String avengersTitle;
	private String avengersName;
	private String category;

	
    
	public Avengers() {
		super();
	}



	public Avengers(int avengersId, String avengersTitle, String avengersName, String category) {
		super();
		this.avengersId = avengersId;
		this.avengersTitle = avengersTitle;
		this.avengersName = avengersName;
		this.category = category;
	}



	public int getAvengersId() {
		return avengersId;
	}



	public void setAvengersId(int avengersId) {
		this.avengersId = avengersId;
	}



	public String getAvengersTitle() {
		return avengersTitle;
	}



	public void setAvengersTitle(String avengersTitle) {
		this.avengersTitle = avengersTitle;
	}



	public String getAvengersName() {
		return avengersName;
	}



	public void setAvengersName(String avengersName) {
		this.avengersName = avengersName;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Avengers Id: " + avengersId + " Title: " + avengersTitle + " Avengers Name: " + avengersName + " Category: " + category;
	}

}