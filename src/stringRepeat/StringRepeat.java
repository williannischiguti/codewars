package stringRepeat;

public class StringRepeat {
	
    public static String repeatStr(final int repeat, final String string) {
        
    	System.out.println(string.repeat(repeat));
    	
    	return string.repeat(repeat);
    }
	
	public static void main (String args []) {
	
		repeatStr(6, "hello");
	}

}
