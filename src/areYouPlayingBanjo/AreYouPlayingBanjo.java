package areYouPlayingBanjo;

public class AreYouPlayingBanjo {

	public static String areYouPlayingBanjo(String name) {
		
		System.out.println(name.startsWith("r") || name.startsWith("R") ? 
						   name.concat(" plays banjo") : 
						   name.concat(" does not play banjo"));
		
		return name.startsWith("r") || name.startsWith("R") ? 
			   name.concat(" plays Banjo") : 
			   name.concat(" does not play Banjo");
	}

	public static void main(String args[]) {
		
		areYouPlayingBanjo("Rob");
	}

}
