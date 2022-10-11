package printerErrors;

public class Printer {
	
    public static String printerError(String s) {
        
    	String strings = "";
    	int printerErros = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		strings = String.valueOf(s.charAt(i));
    		if (!(strings.matches("[a-m]*"))) {
    			printerErros += 1;
    		}
    	}
    	
    	System.out.printf("%s/%s", Integer.toString(printerErros), Integer.toString(s.length()));
    	
    	return Integer.toString(printerErros) + "/" + Integer.toString(s.length());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "aaabbbbhaijjjm";
		String s2 = "aaaxbbbbyyhwawiwjjjwwm";
		
		printerError(s2);
	}

}
