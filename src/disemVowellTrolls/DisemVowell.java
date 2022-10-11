package disemVowellTrolls;

import java.util.Scanner;

public class DisemVowell {

	public static String disemvowel(String str) {

		String removeVowels = "";

		if (str.contains("a") || str.contains("e") || str.contains("i") || 
			str.contains("o") || str.contains("u") || 
			str.contains("A") || str.contains("E") || str.contains("I") || 
			str.contains("O") || str.contains("U")) {
			removeVowels = str.replaceAll("[aeiouAEIOU]", "");
			System.out.println(removeVowels);
			return removeVowels;
		} else {
			System.out.println(str);
			return str;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		disemvowel(sc.nextLine());

		sc.close();
	}

}
