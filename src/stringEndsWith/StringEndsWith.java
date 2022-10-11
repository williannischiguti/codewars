package stringEndsWith;

public class StringEndsWith {

	public static boolean solution(String str, String ending) {

		return str.endsWith(ending) ? true : false;
		
	}

	public static void main(String args[]) {

		String firstString = "abc";
		String secondString = "dc";

		solution(firstString, secondString);
	}

}
