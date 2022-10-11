package convertStringToCamelCase;

import java.util.Arrays;

public class ConvertStringToCamelCase {

	static String toCamelCase(String s) {
		
		System.out.println("String original: " + s);
		
		s = s.replace("-", " ").replace("_", " ");
		System.out.println("Tratamento inicial da String: " + s);
		
		String[] arrStr = s.split(" ");
		System.out.println("Transformado em array: " + Arrays.toString(arrStr));
				
		String newString = "";
		for (int i = 0; i < arrStr.length; i++) {
			if (i == 0) {
				newString += arrStr[i];
			} else {
				newString += (arrStr[i].charAt(0)+"")
									   .toUpperCase()
						               .concat(arrStr[i]
						               .substring(1, arrStr[i].length()));
			}
		}
		
		return newString;
	}

	public static void main(String args[]) {
		
		System.out.println(toCamelCase("The_Stealth_Warrior"));
	}
}
