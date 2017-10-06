package akingspackage;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    

		System.out.println("Enter a password");
		String input = new Scanner(System.in).nextLine();
		
		if(isValid(input)) {
		System.out.println(input + " is valid");
		}
		else {
			System.out.println(input + " is inValid");
		}

	}

	static boolean isValid(String input) {

		// A password must have at least ten characters
		if (input.length() < 10) {
			return false;
		}

		int charCount = 0;
		int numberCount = 0;
		for (int i = 0; i < input.length() -1; i++) {
			char eachCharInPassword = input.charAt(i);
			eachCharInPassword =Character.toUpperCase(eachCharInPassword);
			if (eachCharInPassword >= 'A' && eachCharInPassword <= 'Z') {
				
				charCount++;
			}

			else if (eachCharInPassword >= '0' && eachCharInPassword <= '9') {
				numberCount++;
			}

		}

		if (numberCount >= 2 && charCount >= 1) {
			return true;
		} else {
			return false;
		}

	}

	// public static boolean isValid
	// (String password) {if(password.length()<10);
	// return false;
	// }
	// if(password >='0'&& password<=9)||password =="a"
	//
	// }
	// char
	// int i;
	// for(i=0;i<password.length;i ++)
	// if
	// System.out.println("Invalid Password must have 10 characters"){
	//
	// }
	// else if(password==10) {
	// System.out.println();
	// }
	//
}