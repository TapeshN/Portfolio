import java.util.*;
public class MaxPrefixAverage {

	public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in); 
			    int sum = 0;
			    int maxPrefixAve = 0;
			    int count = sc.nextInt();
			    for (int i=0; i < count; i++) {
			    		if(sc.hasNextInt()) {
			    			sum = sum+sc.nextInt();	
			    		}
			    		int preFixAve;
			    		preFixAve = sum/(i+1);
			    		
			    		if(preFixAve > maxPrefixAve) {
			    			maxPrefixAve = preFixAve;
			    		}
			    }	      
			     System.out.println(maxPrefixAve);  
	}
	
}