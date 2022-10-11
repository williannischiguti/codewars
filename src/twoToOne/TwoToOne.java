package twoToOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoToOne {
	
    public static String longest (String s1, String s2) {
    	
    	Set <String> set = new HashSet<String>();
    	List <String> list = new ArrayList<String>();
    	String concatenedString = s1 + s2;
    	String[] split = concatenedString.split("");
    	String newString = "";
  
    	for (int i = 0; i < split.length; i++) {
    		set.add(split[i]);
    	}
    	
    	System.out.println(set);
    	
    	for (String s : set) {
    		list.add(s);
    	}
    	
    	Collections.sort(list);
    	
    	for (String s : list) {
    		newString += s;
    	}
    	System.out.println(newString);
    	
    	return newString;
    }
	
	public static void main (String[] args) {
		
		String a = "inmanylanguages";
		String b = "theresapairoffunctions";
		
		longest(a, b);
	}
	
}
