package findTheMissingLetter;

public class FindTheMissingLetterB {

	public static char findMissingLetter(String[] array) {

		for (int i = 1; i < array.length; i++) {
			if (array[i].codePointAt(0) - array[i-1].codePointAt(0) == 2) {
				int code = array[i].codePointAt(0) - 1;
				char[] missingLetter = Character.toChars(code);
				return missingLetter[0];
			}
		}

		return ' ';
	}

	public static void main(String args[]) {

		System.out.println(findMissingLetter(new String[] { "O", "Q", "R", "S", "T" }));
	}

}
