package writeNumberInExpandedForm;

public class WriteNumberInExpandedForm {
	
    public static String expandedForm(int num) {
      
    	if(num == 0) return "0";
    	
    	String sNum = String.valueOf(num);
    	System.out.printf("Tamanho do número: %s dígitos%n", sNum.length());
    	String string = "";
    	
    	for (int i = 0; i < sNum.length(); i++) {
    		if (sNum.charAt(i) != '0') {
    			string += sNum.charAt(i) + "0".repeat(sNum.length()-1-i).concat(" + ");
    		}
    	}
    	
    	return string.substring(0, string.length()-3);
    }
	
	public static void main (String args[]) {
		
		System.out.println(expandedForm(70304));
		
	}
}
