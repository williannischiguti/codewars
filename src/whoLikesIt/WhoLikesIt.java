package whoLikesIt;

public class WhoLikesIt {
	
    public static String whoLikesIt(String... names) {
        //Do your magic here

    	if (names.length == 0) {
    		System.out.println("no one likes this");
    		return "no one likes this";
    	} else if (names.length == 1) {
    		System.out.printf("%s likes this",names[0]);
    		return String.format("%s likes this", names[0]);
    	} else if (names.length == 2) {
    		System.out.printf("%s and %s like this", names[0], names[1]);
    		return String.format("%s and %s like this", names[0], names[1]);
    	} else if (names.length == 3) {
    		System.out.printf("%s, %s and %s like this", names[0], names[1], names[2]);
    		return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
    	} else {
    		System.out.printf("%s, %s and %d others like this", names[0], names[1], names.length-2);
    		return String.format("%s, %s and %d others like this", names[0], names[1], names.length-2);
    	}
    }
	
	public static void main (String[] args) {
		
		String [] names = {"Jacob", "Alex", "Mark", "Adriana", "Joana", "Aline"};
		
		whoLikesIt(names);
	}

}
