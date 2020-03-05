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
}
