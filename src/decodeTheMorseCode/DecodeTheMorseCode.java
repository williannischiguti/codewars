package decodeTheMorseCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DecodeTheMorseCode {
	
    public static String decode(String morseCode) {
        
    	Map<String, String> code = new HashMap<String, String>();
    	code.put(".-", "A"); code.put("-...", "B"); code.put("-.-.", "C"); code.put("-..", "D");
    	code.put(".", "E"); code.put("..-.", "F"); code.put("--.", "G"); code.put("....", "H");
    	code.put("..", "I"); code.put(".---", "J"); code.put("-.-", "K"); code.put(".-..", "L");
    	code.put("--", "M"); code.put("-.", "N"); code.put("---", "O"); code.put(".--.", "P");
    	code.put("--.-", "Q"); code.put(".-.", "R"); code.put("...", "S"); code.put("-", "T");
    	code.put("..-", "U"); code.put("...-", "V"); code.put(".--", "W"); code.put("-..-", "X");
    	code.put("-.--", "Y"); code.put("--..", "Z");
    	code.put(".----", "1"); code.put("..---", "2"); code.put("...--", "3"); code.put("....-", "4");
    	code.put(".....", "5"); code.put("-....", "6"); code.put("--...", "7"); code.put("---..", "8");
    	code.put("----.", "9"); code.put("-----", "0"); code.put("/", " ");
    	code.put("-.-.--", "!"); code.put(".-.-.-", "."); code.put("--··--", ","); code.put("··--··", "?");
    	code.put("-··-·", "/"); code.put("·----·", "'"); code.put("-·--·", "("); code.put("-·--·-", ")");
    	code.put("·-···", "&"); code.put("---···", ":"); code.put("-·-·-·", ";"); code.put("-···-", "=");
    	code.put("-····-", "-"); code.put("··--·-", "_"); code.put("·-··-·", "\""); code.put("···-··-", "$");
    	code.put("·--·-·", "@"); code.put("...---...", "SOS"); 
  
    	System.out.println("String original: " + morseCode);
    	morseCode = morseCode.trim().replace("   ", "/").replace(" ", ",").replace("/",",/,");
    	System.out.println("Tratamento da String: " + morseCode);
    	String[] arr = morseCode.split(",");
    	System.out.println("Transformado em array: " + Arrays.toString(arr));
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(code.containsKey(arr[i])) {
    			arr[i] = code.get(arr[i]);
    		}
    	}
    	
    	morseCode = Arrays.toString(arr).replace("[", "")
    									.replace("]", "")
    									.replace(", ","");
    	
    	return morseCode;
    }

	public static void main(String[] args) {
		
		System.out.println("Código decodificado: " + decode("- . -. .... .- / ..- -- / -... --- -- / -.. .. .-"));

	}

}
