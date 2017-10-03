package akingspackage;

public class LoudParrot {

	public static void main(String[] args) {

	

		boolean isBirdLoud = loudBird(true, 5);
		if (isBirdLoud) {
			System.out.println("We are in Trouble this bird won't shut up ");
		} else {
			System.out.println("This bird is chillin");
		}
	}

	static boolean loudBird(boolean h, int m) {
		if (h && m < 7 || m > 20) {
			return true;
		}

		else {

			return false;

		}
	}
}
