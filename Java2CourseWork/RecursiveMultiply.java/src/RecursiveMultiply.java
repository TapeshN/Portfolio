
/** Read two integers from standard input,
 * print out product.
 */

import java.util.Scanner;

public class RecursiveMultiply {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    long start = System.currentTimeMillis();
    long z = mult(x,y);
    long end = System.currentTimeMillis();
    long t = end - start;
    System.out.println(z);
    // Use the following if you want to find run time.
    System.out.print(t);
    scan.close(); 
  }

  public static long mult(int a, int b) {
      if (b == 0) {
    	  	return (long) 0;
      }
      if (b == 1 ) {
    	  	return (long) a;
      }
      if ( b>1) {
    	  	return  (long)(mult(a,b-1) + a); 
      } else {  
    	  	System.out.println("Invalid input");
    	  	return (long)0;
      }
  }
}


