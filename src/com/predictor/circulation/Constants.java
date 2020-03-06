package com.predictor.circulation;

public final class Constants {
	
	// Class to declare constants and centralize this ones
	// Date pattern
	public static final String DATE_PATTERN = ("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
		      + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
		      + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
		      + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
	
	// Hour pattern
	public static final String HOUR_PATTERN = ("([01]?[0-9]|2[0-3]):[0-5][0-9]");
	
	// Max & min length of number of plate
	public static final int MIN_NUMBER_PLATE = 3;
	public static final int MAX_NUMBER_PLATE = 4;
	
	// Days: Each day have 2 numbers to block circulation plate's car
	public static final int DAY_SUNDAY = 1;
	public static final int DAY_MONDAY = 2;
	public static final int DAY_TUESDAY = 3;
	public static final int DAY_WEDNESDAY = 4;
	public static final int DAY_THURSDAY = 5;
	public static final int DAY_FRIDAY = 6;
	public static final int DAY_SATURDAY = 7;
	
	// Hours: Range of "pico y placa"
	public static final String HOUR_MIN_MORNING = "06:59";
	public static final String HOUR_MAX_MORNING = "09:31";
	public static final String HOUR_MIN_AFTERNOON = "15:59";
	public static final String HOUR_MAX_AFTERNOON = "17:31";
	
	
}
