package akingspackage;

public class vowelCount {

	public static void main(String[] args) {
		System.out.println(countVowelInaWord("Compilation"));
	}
	static int countVowelInaWord(String word) {
	int vowelCount=0;
	for(int i=0; i < word.length(); i ++) {
		if(word.charAt(i) == 'a'
			||word.charAt(i) == 'e'	
			||word.charAt(i) =='i'
			||word.charAt(i) =='o'
			||word.charAt(i) =='u') {
			vowelCount++;
		}
	}	
	return vowelCount;
}
}    	