import java.util.*;
public class openWorkSpace {
	
	static double rpow(double x, int n) {
	    if (n == 0)
	        return 1.0;
	    return x * rpow(x, n - 1);
	}	
	
		
		public static void main(String[] args) {
		System.out.println(rpow(2,0));
	
	}
}


