package vowelCount;

public class Vowels {
	
	  public static int getCount(String str) {
		  	
		  	int vowelCount = 0;
		  	
		  	for (int i = 0; i < str.length(); i++) {
		  		if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
		  			str.charAt(i) == 'o' || str.charAt(i) == 'u') {
		  			vowelCount += 1;
		  		}
		  	}
		  	
		  	System.out.print(vowelCount);
		    return vowelCount;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "muito bem cara, deu certinho";
		
		getCount(word);
	}

}
