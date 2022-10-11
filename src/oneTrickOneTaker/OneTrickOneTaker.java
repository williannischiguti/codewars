package oneTrickOneTaker;

import java.util.HashMap;
import java.util.Map;

public class OneTrickOneTaker {

	public static String winnerOfTrick(String[] cards, String[] players) {

		// A, K, Q, J, T (for 10), 9, 8, 7, 6, 5, 4, 3 or 2
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 14); map.put("K", 13); map.put("Q", 12); map.put("J", 11);
		map.put("T", 10); map.put("9", 9);  map.put("8", 8);  map.put("7", 7);
		map.put("6", 6);  map.put("5", 5);	map.put("4", 4);  map.put("3", 3);
		map.put("2", 2);

		// "2H","8H","KD","KH"

		int rank = 0;
		int greaterRank = 0;
		char suit = cards[0].charAt(1);
		char key = ' ';

		String winner = "";

		for (int i = 0; i < cards.length; i++) {

			rank = map.get(cards[i].charAt(0) + "");
		
			if (cards[i].charAt(1) == suit && rank > greaterRank) {
				greaterRank = rank;
				winner = players[i];
				key = cards[i].charAt(0);
			}
		}
		
		System.out.printf("Winner Card: %s%s%n", Map.entry(key, greaterRank).getKey() , suit);

		return winner.concat(" wins");
	}

	public static void main(String args[]) {

		String[] players = { "Algichh", "Bdobd", "Chharmolg", "Dbang", "Erming", "fRangk", "gRachh" };

		System.out.println("Winner: " + winnerOfTrick(new String[] {"2H","KH","3H"}, players));

	}

}
