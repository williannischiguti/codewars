package sumOfIntervals;

public class SumOfIntervals {
	
    public static int sumIntervals(int[][] intervals) {
        
    	for (int i = 0; i < intervals.length; i++) {
    		for (int j = 0; j < 2; j++) {
    			System.out.printf("%d ",intervals[i][j]);
    			if (j == 1) {
    				System.out.println();
    			}
    		}
    	}
    	
        return -1;
    }
	
	public static void main (String args []) {
		
		int[][] intervals = {{1,4}, {7,10}, {3,5}};
		sumIntervals(intervals);
		
	}
	
}
