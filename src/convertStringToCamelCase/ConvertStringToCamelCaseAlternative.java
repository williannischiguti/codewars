package convertStringToCamelCase;

import java.util.Arrays;

public class ConvertStringToCamelCaseAlternative {

	static String toCamelCase(String s) {
		
		System.out.println("String original: " + s);
		
	    String newString = "";
	    String[] arrStr = s.split("[-_]+");
	    System.out.println("Transformado em array: " + Arrays.toString(arrStr));
	    
	    for(int i = 0; i < arrStr.length; i++){
	    	newString += (i == 0) ? newString += arrStr[i] : arrStr[i].substring(0,1).toUpperCase() + arrStr[i].substring(1);
	    }
	   
	    return newString;
	}

	public static void main(String args[]) {
		
		System.out.println(toCamelCase("the-stealth-warrior"));
	}
}
