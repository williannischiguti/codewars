package removeFirstAndLastCharacter;

public class RemoveFirstAndLastCharacter {
	
    public static String remove(String str) {
 	
        return str.substring(1, str.length()-1);
        
    }
	
	public static void main (String args[]) {
		
		System.out.println(remove("Paralelep�pedo"));
	}

}
