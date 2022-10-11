package makeTheDeadFishSwim;

import java.util.Arrays;

public class MakeTheDeadFishSwim {
	
    public static int[] parse(String data) {
        
    	int length = 0;
    	
    	for (int i = 0; i < data.length(); i++) {
    		if(data.charAt(i) == 'o') {
    			length += 1;
    		}
    	}
    	
    	int[] result = new int[length];
    	int calc = 0;
    	int out = 0;
    	
    	for (int i = 0; i < data.length(); i++) {
    		if (data.charAt(i) == 'i') {
    			calc ++;
    		}
    		if (data.charAt(i) == 'd') {
    			calc --;
    		}
    		if (data.charAt(i) == 's') {
    			calc = (int) Math.pow(calc, 2);
    		}
    		if(data.charAt(i) == 'o') {
    			result[out] = calc;
    			out ++;
    		}
    	}
    	
    	return result;
    }
	
	public static void main (String args[]) {
		
		System.out.println(Arrays.toString(parse("iiisdosodddddiso")));
	}

}
