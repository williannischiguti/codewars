package findTheNextPerfectSquare;

import java.util.Scanner;

public class NumberFun {
	
	  public static long findNextSquare(long sq) {
	      
		  if (sq % Math.sqrt(sq) == 0 && sq > 0) {
			  double number = (Math.sqrt(sq)) + 1 ;
			  long nextSquare =  (long) (number * number);
			  System.out.println(nextSquare);
			  
			  return nextSquare;
			  
		  } else {
			  return -1;
		  }
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		findNextSquare(sc.nextInt());
		
		sc.close();
	}

}
