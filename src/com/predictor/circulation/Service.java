package com.predictor.circulation;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Service {
	Verification verification = new Verification();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");

	public Service() {

	}
	
	// Method to insert plate number
	public void dinamicInsertPlateNumber(PlateNumber plateNumber) {
		verification.enterPlateNumber(plateNumber.getPlateNumber());
	}
	
	// Method to insert date
	public void dinamicInsertDateEntered(DateEntered dateEntered) {
		verification.enterDate(dateEntered.getDateEntered());
	}
	
	// Method to insert hour
	public void dinamicInsertHourEntered(HourEntered hourEntered) {
		verification.enterHour(hourEntered.getHourEntered());
	}
	
	// Obtein the las digit of plate number
	public int getLastDigit(int plate) {
		return plate % 10;
	}
	
	// Obtein the day of the date entered
	public Integer getDayOfWeek(String dateEntered) {
		Integer dayOfWeek = null;
		try {
			Calendar calendar = Calendar.getInstance();
			Date dateData = dateFormat.parse(dateEntered);
			calendar.setTime(dateData);
			
			dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			System.err.println("Enter the date with the correct format ... ");
		}
		return dayOfWeek;
	}
	
	// Validate the hour entered between the hours of pico y placa
	public boolean hourValidation(String hourEntered) {
		try {
			Time hourData = new Time(hourFormat.parse(hourEntered).getTime());
			Time hourDataMorningMin = new Time(hourFormat.parse(Constants.HOUR_MIN_MORNING).getTime());
			Time hourDataMorningMax = new Time(hourFormat.parse(Constants.HOUR_MAX_MORNING).getTime());
			Time hourDataAfternoonMin = new Time(hourFormat.parse(Constants.HOUR_MIN_AFTERNOON).getTime());
			Time hourDataAfternoonMax = new Time(hourFormat.parse(Constants.HOUR_MAX_AFTERNOON).getTime());

			return (hourData.after(hourDataMorningMin) && hourData.before(hourDataMorningMax))
					|| ((hourData.after(hourDataAfternoonMin) && hourData.before(hourDataAfternoonMax)));
		} catch (Exception e) {
			System.out.println("The hour is incorrect");
		}
		return false;
	}
	
	// Method to validate with 3 parameters (date, plate, hour) to display if car can be road or not
	public boolean validatePlateByDay(String date, Integer plate, String hour) {
		Integer dayOfWeek = this.getDayOfWeek(date);
		Integer lastDigit = this.getLastDigit(plate);
		boolean validHour = this.hourValidation(hour);
		
		if((lastDigit == 1 || lastDigit == 2) && (dayOfWeek == Constants.DAY_MONDAY) && validHour == true) {
			return false;
		}
		
		if((lastDigit == 3 || lastDigit == 4) && (dayOfWeek == Constants.DAY_TUESDAY) && validHour == true) {
			return false;
		}
		
		if((lastDigit == 5 || lastDigit == 6) && (dayOfWeek == Constants.DAY_WEDNESDAY) && validHour == true) {
			return false;
		}
		
		if((lastDigit == 7 || lastDigit == 8) && (dayOfWeek == Constants.DAY_THURSDAY) && validHour == true) {
			return false;
		}
		
		if((lastDigit == 9 || lastDigit == 0) && (dayOfWeek == Constants.DAY_FRIDAY) && validHour == true) {
			return false;
		}
		
		return true;
	}

}
