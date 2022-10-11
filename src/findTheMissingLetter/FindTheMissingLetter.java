package findTheMissingLetter;

public class FindTheMissingLetter {

	public static char findMissingLetter(char[] array) {
		
		for (int i = 1; i < array.length; i++) {
			if (Character.codePointAt(array, i) - Character.codePointAt(array, i-1) == 2) {
				int code = Character.codePointAt(array, i) - 1;
				char[] missingLetter = Character.toChars(code);
				return missingLetter[0];
			}
		}
		
		return ' ';	
	}

	public static void main(String args[]) {
		
		System.out.println(findMissingLetter(new char[] {'a','b','c','d','f'}));
	}

}
