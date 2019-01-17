package entities;

import java.util.ArrayList;

public class Vehicle {

	int mileage;
	double marketValue;
	String serialNumber;
	String marque;
	String modelName;
	ArrayList<Component> components;
	String colour;

	public Vehicle(int mileage, double marketValue, String serialNumber, String marque, String modelName, String colour) {
		this.mileage = mileage;
		this.marketValue = marketValue;
		this.serialNumber = serialNumber;
		this.marque = marque;
		this.modelName = modelName;
		this.colour = colour;
	}

	public int getMileage() {
		return mileage;
	}

	public double getMarketValue() {
		return marketValue;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getMarque() {
		return marque;
	}

	public String getModelName() {
		return modelName;
	}

	public ArrayList<Component> getComponents() {
		return components;
	}

	public String getColour() {
		return colour;
	}
}
