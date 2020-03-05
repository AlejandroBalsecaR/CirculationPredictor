package com.predictor.circulation;

public class PlateNumber {
	private int plateNumber;

	public PlateNumber() {

	}

	public PlateNumber(int plateNumber) {
		super();
		this.plateNumber = plateNumber;
	}

	public int getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(int plateNumber) {
		this.plateNumber = plateNumber;
	}

	@Override
	public String toString() {
		return "PlateNumber [plateNumber=" + plateNumber + "]";
	}

}
