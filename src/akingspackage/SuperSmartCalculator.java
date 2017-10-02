package akingspackage;

import java.util.Scanner;

public class SuperSmartCalculator {

	
	public static void main(String[] args) {
		
	System.out.println("Please enter numbers 1");
	int numb1= new Scanner(System.in).nextInt();
	
	System.out.println("Please enter number 2");
	int numb2= new Scanner(System.in).nextInt();
	System.out.println("Please enter number 3");
int numb3= new Scanner(System.in).nextInt();
	System.out.println("Please enter number 4");
int numb4= new Scanner(System.in).nextInt();
	System.out.println("Please enter number 5");
int numb5= new Scanner(System.in).nextInt();
	
  System.out.println("you average is " +  calculateAvg(numb1, numb2, numb3, numb4, numb5));  
// Take 5 numbers of your choice to sum up 
// print out the average 
	 

	}
	
	static int calculateAvg(int   numb1, 
							int   numb2, 
							int   numb3, 
							int   numb4, 
							int   numb5) {
	 	
		return (numb1+ numb2+ numb3+ numb4+ numb5) / 5;
	}

	{
}
}
