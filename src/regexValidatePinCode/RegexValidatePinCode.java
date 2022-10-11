package regexValidatePinCode;

import java.util.regex.Pattern;

public class RegexValidatePinCode {
	
	  public static boolean validatePin(String pin) {
		    
		  	System.out.println(Pattern.matches("[0-9]*", pin) && pin.length() == 4 || pin.length() == 6);
		  
		    return Pattern.matches("[0-9]*", pin) && pin.length() == 4 || 
		    	   Pattern.matches("[0-9]*", pin) && pin.length() == 6;
		  }

	public static void main(String[] args) {
		
		validatePin("a481");

	}

}
