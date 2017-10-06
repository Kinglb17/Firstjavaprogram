package akingspackage;
//created a class
public class unlucky13 {
//set main method
	public static void main(String[] args) {
		// declare variables and create array
int[] numbers= {1,6,7,13,1};
	System.out.println(unluck13(numbers));
	}
static int unluck13(int[] numlist) {
	
	int sum=0;
	for(int number : numlist) {
	if(number !=13) {
	sum=sum + number;
	}
	else {
		break;
	}
}
	return sum;
	}
}