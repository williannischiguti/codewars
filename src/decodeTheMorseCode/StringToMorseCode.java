package decodeTheMorseCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringToMorseCode {
	
    public static String code(String morseCode) {
        
    	Map<String, String> decode = new HashMap<String, String>();
    	decode.put("A", ".-"); decode.put("B", "-..."); decode.put("C", "-.-."); decode.put("D", "-..");
    	decode.put("E", "."); decode.put("F", "..-."); decode.put("G", "--."); decode.put("H", "....");
    	decode.put("I", ".."); decode.put("J", ".---"); decode.put("K", "-.-"); decode.put("L", ".-..");
    	decode.put("M", "--"); decode.put("N", "-."); decode.put("O", "---"); decode.put("P", ".--.");
    	decode.put("Q", "--.-"); decode.put("R", ".-."); decode.put("S", "..."); decode.put("T", "-");
    	decode.put("U", "..-"); decode.put("V", "...-"); decode.put("W", ".--"); decode.put("X", "-..-");
    	decode.put("Y", "-.--"); decode.put("Z", "--..");
    	decode.put("1", ".----"); decode.put("2", "..---"); decode.put("3", "...--"); decode.put("4", "....-");
    	decode.put("5", "....."); decode.put("6", "-...."); decode.put("7", "--..."); decode.put("8", "---..");
    	decode.put("9", "----."); decode.put("0", "-----"); decode.put(" ", "/");
    	decode.put("!", "-.-.--"); decode.put(".", ".-.-.-"); decode.put(",", "--··--"); decode.put("?", "··--··");
    	decode.put("/", "-··-·"); decode.put("'", "·----·"); decode.put("(", "-·--·"); decode.put(")", "-·--·-");
    	decode.put("&", "·-···"); decode.put(":", "---···"); decode.put(";", "-·-·-·"); decode.put("=", "-···-");
    	decode.put("-", "-····-"); decode.put("_", "··--·-"); decode.put("\"", "·-··-·"); decode.put("$", "···-··-");
    	decode.put("@", "·--·-·"); decode.put("SOS", "...---..."); 
  
    	System.out.println("String original: " + morseCode);
    	morseCode = morseCode.trim();
    	System.out.println("Tratamento da String: " + morseCode);
    	String[] arr = morseCode.split("");
    	System.out.println("Transformado em array: " + Arrays.toString(arr));
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(decode.containsKey(arr[i])) {
    			arr[i] = decode.get(arr[i]);
    		}
    	}
    	
    	morseCode = Arrays.toString(arr).replace("[", "")
    									.replace("]", "")
    									.replace(", "," ");
    	
    	return morseCode;
    }

	public static void main(String[] args) {
		
		System.out.println("Código codificado: " + code("TENHA UM BOM DIA"));

	}

}
