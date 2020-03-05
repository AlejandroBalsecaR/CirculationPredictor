package com.predictor.circulation;

public class HourEntered {
	private String hourEntered;

	public HourEntered() {

	}

	public HourEntered(String hourEntered) {
		super();
		this.hourEntered = hourEntered;
	}

	public String getHourEntered() {
		return hourEntered;
	}

	public void setHourEntered(String hourEntered) {
		this.hourEntered = hourEntered;
	}

	@Override
	public String toString() {
		return "HourEntered [hourEntered=" + hourEntered + "]";
	}

}
