package akingspackage;

public class SleepInn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//If its not a vacation and a weekday then you can't sleep in
	sleepIn(true, false);			
	System.out.println(sleepIn (true, false));
	}
	public static boolean sleepIn(boolean weekend, boolean vacation) {
		// TODO Auto-generated method stub		
if (weekend|| vacation) {
	return true;
	
}
else {
return false;
	}
	}	
}	