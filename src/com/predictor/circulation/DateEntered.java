package com.predictor.circulation;

public class DateEntered {
	private String dateEntered;

	public DateEntered() {

	}

	public DateEntered(String dateEntered) {
		super();
		this.dateEntered = dateEntered;
	}

	public String getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}

	@Override
	public String toString() {
		return "DateEntered [dateEntered=" + dateEntered + "]";
	}

}
