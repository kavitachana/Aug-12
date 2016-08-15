package com.kavita.roshambo;

public class Validation {

	public static boolean oppNumber(String numChosen) {

		try {

			int isValid = Integer.parseInt(numChosen);
			if ((isValid < 0) || (isValid > 10)) {
				System.out.println("Invalid entry. Please enter a number 1 - 10");
				return true;
			}
			return false;
		}

		catch (NumberFormatException e) {
			System.out.println("Invalid entry. Please enter a number 1 - 10");
			return true;
		}

	}

	public static boolean userThrow(String numChosen) {

		try {

			int isValid = Integer.parseInt(numChosen);
			if ((isValid < 0) || (isValid > 5)) {
				System.out.println("Invalid entry. Please enter a number 1 - 5");
				return true;
			}
			return false;
		}

		catch (NumberFormatException e) {
			System.out.println("Invalid entry. Please enter a number 1 - 5");
			return true;
		}

	}
}
