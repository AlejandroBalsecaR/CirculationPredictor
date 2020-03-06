package com.predictor.circulation;

public class Verification {
	// Instances
	private PlateNumber plateNumber = new PlateNumber();
	private DateEntered dateEntered = new DateEntered();
	private HourEntered hourEntered = new HourEntered();

	public Verification() {

	}

	// Method for receiving the plate number
	public void enterPlateNumber(int intPlateNumber) {
		plateNumber.setPlateNumber(intPlateNumber);
	}

	// Method for receiving the plate number
	public void enterDate(String stringDate) {
		dateEntered.setDateEntered(stringDate);
	}

	// Method for receiving hour
	public void enterHour(String stringHour) {
		hourEntered.setHourEntered(stringHour);
	}

	public PlateNumber getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(PlateNumber plateNumber) {
		this.plateNumber = plateNumber;
	}

	public DateEntered getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(DateEntered dateEntered) {
		this.dateEntered = dateEntered;
	}

	public HourEntered getHourEntered() {
		return hourEntered;
	}

	public void setHourEntered(HourEntered hourEntered) {
		this.hourEntered = hourEntered;
	}

	@Override
	public String toString() {
		return "Verification [plateNumber=" + plateNumber + ", dateEntered=" + dateEntered + ", hourEntered="
				+ hourEntered + "]";
	}

}
