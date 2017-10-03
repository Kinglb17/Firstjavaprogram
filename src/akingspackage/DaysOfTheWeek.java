package akingspackage;

import java.util.Scanner;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your day of week (eg:m,t,w,h,f,s,y): ");
		String weekDay = new Scanner(System.in).next();
		weekDay(weekDay);
	}
	static void weekDay(String weekDay) {
		
		switch(weekDay) {
		case("m"):
		System.out.println("Monday");
		break;
		case("t"):
		System.out.println("Tuesday");
		break;
		case("w"):
		System.out.println("Wensday");
		break;
		case ("h"):
		System.out.println("Thursday");
		break;
		case ("f"):
		System.out.println("Friday");
		case ("s"):
			System.out.println("Saturday");
		break;
		case ("y"):
			System.out.println("Sunday");
		break;
		default : System.out.println("wrong key asshole");
}
}
}
