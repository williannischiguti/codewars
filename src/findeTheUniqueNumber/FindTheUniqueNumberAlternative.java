package findeTheUniqueNumber;
import java.util.Arrays;

public class FindTheUniqueNumberAlternative {
	
    public static double findUniq(double[] arr) {
    	
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
        
      }
	
	public static void main (String args []) {
		
		System.out.println(findUniq(new double[]{ 1, 1, 2, 1, 1, 1}));
	}
}
