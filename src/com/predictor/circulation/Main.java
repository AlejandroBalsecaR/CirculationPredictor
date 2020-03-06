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
		boolean verificationHour = true;
		String hourEntered = "";

		while (verificationHour == true) {
			System.out.println(message);
			hourEntered = sc.nextLine();
			Pattern pattern = Pattern.compile(Constants.HOUR_PATTERN);
			Matcher matcher = pattern.matcher(hourEntered);
			
			if (matcher.matches()) {
				try {
					verificationHour = false;
				} catch (Exception e) {
					System.err.println("Enter the hour with the correct format ... ");
				}
			} else {
				System.err.println("The format is not correct ... ");
			}
		}
		return hourEntered;
	}
	
	// Methods to receive the message and data of each one
	public static int enterPlate() {
		int dataPlate = plateOfConsultant("Enter a plate number, only digits, must be 3 or 4 digits");
		service.dinamicInsertPlateNumber(new PlateNumber(dataPlate));
		return dataPlate;
	}

	// Method to receive the date
	public static String enterDate() {
		String dataDate = dateOfConsult("Enter the date: must be Year-Month-Day");
		service.dinamicInsertDateEntered(new DateEntered(dataDate));
		return dataDate;
	}
	
	// Method to receive the hour
	public static String enterHour() {
		String dataHour = hourOfConsult("Enter the hour: Hour:Minute 24hr");
		service.dinamicInsertHourEntered(new HourEntered(dataHour));
		return dataHour;
	}
	
	public static void main(String[] args) {
		String optionMenu = "";
		
		while (!optionMenu.equals("x")) {
			System.out.println("");
			System.out.println("============== Menu ==============");
			System.out.println("Press 1 to validate Pico y Placa");
			System.out.println("Press x to exit");
			optionMenu = sc.nextLine();
			
			switch (optionMenu) {
			case "1":
				System.out.println("You must enter the plate of car, the date and the hour");
				int plate = enterPlate();
				String date = enterDate();
				String hour = enterHour();
				if(service.validatePlateByDay(date, plate, hour)) {
					System.out.println("This car can be road");
				}else {
					System.err.println("This car can not be road");
				};
				break;
			case "2":
				System.out.println("Exit press x");
			default:
				break;
			}	
		}
	}
}
