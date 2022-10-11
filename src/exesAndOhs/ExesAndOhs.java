package exesAndOhs;

public class ExesAndOhs {

	public static boolean getXO(String str) {

		int getX = 0;
		int getO = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'x') {
				getX += 1;
			}
			if (str.toLowerCase().charAt(i) == 'o') {
				getO += 1;
			}
		}

		if (getX == getO || getX == 0 && getO == 0) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

	public static void main(String args[]) {

		getXO("zzoo");
	}

}
