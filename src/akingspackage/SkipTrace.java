package akingspackage;

public class SkipTrace {

	public static void main(String[] args) {
		// This programs prints numbers from 10 to 1, but skips numbers // 3, 4 and 6
		for(int t=10; t>=0; t--) {
			//The condition will skip 3 numbers
			if(t==3||t==4||t==6) {
			continue;
			}
			System.out.println("You made the cut" + " " + t);
		
	}
		

	}
}
	