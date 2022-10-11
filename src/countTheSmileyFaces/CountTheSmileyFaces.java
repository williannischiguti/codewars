package countTheSmileyFaces;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

	public static int countSmileys(List<String> arr) {

		int countSmiley = 0;

		for (int i = 0; i < arr.size(); i++) {
		      if (arr.get(i).matches("([:|;][-|~]?[)|D])")) { 
		    	  // Tradução regex [:|;][-|~]?[)|D]
		    	  // Que contenha : ou ; e pode ou não conter - ou ~
		    	  // e contenha ) ou D
	                countSmiley++;
	            }
		}

		System.out.println(countSmiley);
		return countSmiley;
	}

	public static void main(String args[]) {

		List<String> arr = new ArrayList<String>();

		arr.add(";D");
		arr.add(":-(");
		arr.add(":-)");
		arr.add(";~)"); // 3 smiley faces

		countSmileys(arr);
	}

}
