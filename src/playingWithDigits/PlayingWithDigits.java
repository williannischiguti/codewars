package playingWithDigits;

public class PlayingWithDigits {

	public static long digPow(int n, int p) {
		
		String nString = String.valueOf(n);
		long number = 0;
			
		for (int i = 0; i < nString.length(); i++){
			number += Math.pow(Integer.parseInt(nString.charAt(i)+""), p);
			p++;
		}
		
		return (number % n == 0) ? number / n : -1;
	}

	public static void main(String args[]) {

		System.out.println(digPow(46288, 3));
	}

}
