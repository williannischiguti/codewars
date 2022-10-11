package findTheMissingLetter;

public class FindTheMissingLetterAlternative {

	public static char findMissingLetter(char[] array) {

		char letter = array[0];
		
		for (char element : array) {
			if (element != letter) {
				break;
			}

			letter += 1;
		}
		return letter;
	}

	public static void main(String args[]) {

		System.out.println(findMissingLetter(new char[] { 'a', 'b', 'c', 'd', 'f' }));
	}

}
