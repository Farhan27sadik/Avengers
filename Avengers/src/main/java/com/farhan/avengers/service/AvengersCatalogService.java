package com.farhan.avengers.service;

import java.util.ArrayList;
import java.util.List;

import com.farhan.avengers.model.Avengers;

public class AvengersCatalogService {

	private List<Avengers> avengersList = new ArrayList<Avengers>();

	public AvengersCatalogService() {
		super();
		this.avengersList.add(new Avengers(1, "S Class", "Ironman", "Scientist"));
		this.avengersList.add(new Avengers(2, "A Class", "black widow", "Worrior"));
		this.avengersList.add(new Avengers(3, "A Class", "black panther", "king"));
	}

	public Avengers getAvengersById(int avengersId) {
		return this.avengersList.stream().filter(avengers -> avengers.getAvengersId() == avengersId).findFirst()
				.orElse(null);
	}

	public List<Avengers> getAllAvengers() {
		return this.avengersList;
	}

	public String addAvengers(Avengers avengers) {
		try {
			this.avengersList.add(avengers);
		} catch (Exception ex) {
			return "Error adding new avengers";
		}

		return "Successfully adding the new avengers";
	}
	
	public Avengers getAvengerById(int Id) {
		return this.avengersList.stream().filter(avengers -> avengers.getAvengersId() == Id).findFirst().orElse(null);
	}

	public String updateAvenger(Avengers avengers,int id) {
		try {
			this.avengersList.set(id, avengers);
		} catch (Exception ex) {
			return "Error updating employee information";
		}

		return "Successfully update employee information";
	}

	public String deleteAvengers(int Id) {
		try {
			this.avengersList.remove(Id);
		} catch (Exception ex) {
			return "Error deleting avengers info";
		}

		return "Successfully deleted avengers info";
	}

}
