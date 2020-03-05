package com.predictor.circulation;

public class Service {
	Verification verification = new Verification();

	public Service() {

	}

	public void dinamicInsertPlateNumber(PlateNumber plateNumber) {
		verification.enterPlateNumber(plateNumber.getPlateNumber());
	}

	public void dinamicInsertDateEntered(DateEntered dateEntered) {
		verification.enterDate(dateEntered.getDateEntered());
	}

	public void dinamicInsertHourEntered(HourEntered hourEntered) {
		verification.enterHour(hourEntered.getHourEntered());
	}

}
