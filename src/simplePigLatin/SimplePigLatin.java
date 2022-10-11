package simplePigLatin;

import java.util.Arrays;

public class SimplePigLatin {
	
    public static String pigIt(String str) {
    	
    	String[] words = str.split(" ");
    	
    	System.out.println(Arrays.toString(words));
    	
    	for (int i = 0; i < words.length; i++) {
    		if(words[i].matches("[a-zA-Z].*")) {
    			words[i] = words[i].substring(1).concat(words[i].charAt(0)+"").concat("ay");
    		}
    	}
    	
    	return Arrays.toString(words).replace("[","").replace("]", "").replace(",", "");
    }
	
	public static void main (String args []) {
		
		System.out.println(pigIt("Hello world !"));
	}

}
