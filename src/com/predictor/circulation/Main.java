package com.predictor.circulation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static Service service = new Service();
	static Scanner sc = new Scanner(System.in);
	
	public Main() {
		
	}
	
	// Method to validate the length of number of plate
	public static int plateOfConsultant(String message) {
		int intPlate = 0;
		boolean verificationPlateNumber = true;

		while (verificationPlateNumber == true) {
			System.out.println(message);
			String stringPlate = sc.nextLine();
			if (stringPlate.length() == Constants.MIN_NUMBER_PLATE | stringPlate.length() == Constants.MAX_NUMBER_PLATE) {
				try {
					intPlate = Integer.parseInt(stringPlate);
					verificationPlateNumber = false;
				} catch (Exception e) {
					System.err.println("The plate must be a number ... ");
				}
			} else {
				System.err.println("The plate must be have 3 or 4 numbers ... ");
			}

		}
		return intPlate;
	}
	
	// Method to validate the correct pattern of date
	public static String dateOfConsult(String message) {
		boolean verificationDate = true;
		String dateEntered = "";

		while (verificationDate == true) {
			System.out.println(message);
			dateEntered = sc.nextLine();
			Pattern pattern = Pattern.compile(Constants.DATE_PATTERN);
			Matcher matcher = pattern.matcher(dateEntered);
			
			if (matcher.matches()) {
				try {
					verificationDate = false;
				} catch (Exception e) {
					System.err.println("Enter the date with the correct format ... ");
				}
			} else {
				System.err.println("The format is not correct ... ");
			}
		}
		return dateEntered;
	}
	
	// Method to validate the correct pattern of hour entered
	public static String hourOfConsult(String message) {
		boolean verificationDate = true;
		String hourEntered = "";

		while (verificationDate == true) {
			System.out.println(message);
			hourEntered = sc.nextLine();
			Pattern pattern = Pattern.compile(Constants.HOUR_PATTERN);
			Matcher matcher = pattern.matcher(hourEntered);
			
			if (matcher.matches()) {
				try {
					verificationDate = false;
				} catch (Exception e) {
					System.err.println("Enter the hour with the correct format ... ");
				}
			} else {
				System.err.println("The format is not correct ... ");
			}
		}
		return hourEntered;
	}
	
	// Methods to recive the message and data of each one
	public static void enterPlate() {
		int dataPlate = plateOfConsultant("Enter a plate number");
		service.dinamicInsertPlateNumber(new PlateNumber(dataPlate));
	}

	public static void enterDate() {
		String dataDate = dateOfConsult("Enter the date: year-month-day");
		service.dinamicInsertDateEntered(new DateEntered(dataDate));
	}

	public static void enterHour() {
		String dataHour = hourOfConsult("Enter the hour: hour:minute 24hr");
		service.dinamicInsertHourEntered(new HourEntered(dataHour));
	}
	
	public static void main(String[] args) {
		enterPlate();
		enterDate();
		enterHour();
	}
}
