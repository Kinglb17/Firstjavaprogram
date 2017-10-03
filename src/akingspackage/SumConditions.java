package akingspackage;

public class SumConditions {

public static void main(String[] args) {
		
		
		System.out.println(checkTen(10, 5));


	}
	
	static boolean checkTen(int a, int b) {
		
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		} else {
			return false;

		}
		
	}
}
