package highestScoringWord;

import java.util.HashMap;
import java.util.Map;

public class HighestScoringWord {

	public static String high(String s) {
		
		Map<String, Integer> map = new HashMap <String, Integer>();
		map.put("a", 1); map.put("b", 2); map.put("c", 3); map.put("d", 4); map.put("e", 5);
		map.put("f", 6); map.put("g", 7); map.put("h", 8); map.put("i", 9); map.put("j", 10);
		map.put("k", 11); map.put("l", 12); map.put("m", 13); map.put("n", 14); map.put("o", 15);
		map.put("p", 16); map.put("q", 17); map.put("r", 18); map.put("s", 19); map.put("t", 20);
		map.put("u", 21); map.put("v", 22); map.put("w", 23); map.put("x", 24); map.put("y", 25);
		map.put("z", 26);
		
		String[] words = s.split(" ");
		String srt = "";
		String highest = "";
		int score = 0;
		int highestScore = 0;
		int count  = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i)+"")) {
				srt += s.charAt(i);
				score += map.get(s.charAt(i)+"");
			}
			if (words[count].length() == srt.length()) {
				count += 1;
			
				if (score > highestScore) {
					highestScore = score;
					score = 0;
					highest = srt;
					srt = "";
				} else {
					score = 0;
					srt = "";
				}
			}
		}	
		
		System.out.printf("Highest score: %d / Word: %s%n", highestScore, highest);
		
		return highest;
	}

	public static void main(String args[]) {
		
		System.out.println(high("man i need a taxi up to ubud"));
		
	}
}
