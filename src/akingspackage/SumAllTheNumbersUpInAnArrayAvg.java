package akingspackage;

public class SumAllTheNumbersUpInAnArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i : arrayName){
		// }
		
			int[] numberList = { 56, 67, 90, 11 };

			int sum = 0;
			for (int number : numberList) {
				// sum += number;(short and nifty version)
				sum = sum + number;

			}

			System.out.println("The sum of elements is " + sum);
			double calAvg=sum;
			calAvg =sum/numberList.length;
			System.out.println("Your avg is " + calAvg ) ;
}
}