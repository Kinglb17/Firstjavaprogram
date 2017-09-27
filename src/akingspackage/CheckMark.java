package akingspackage;

public class CheckMark {

	public static void main(String[] args) {
		gradeStudents (58);


	}
	//if student scores 50-59 there are not passing
	static void gradeStudents(int score) {
	if(score >= 50 && score < 60){
	// if student scores 60-69 they pass with a D
		System.out.println("You are not passing");
	}
	else if(score >= 60 && score < 70) {
			System.out.println("D");
	}
	//if student scores 70-79 they get a C
	else if(score >=70 && score< 80 ) {
		System.out.println("C");
	}
	// if student scores 80-89 they get a B
	else if (score >= 80 && score <90) {
		System.out.println("B");	
	}
	// if students score 90-100 they get a A
	else if (score >=90 && score <100) {
		System.out.println("A");
	}
			
		
}
}