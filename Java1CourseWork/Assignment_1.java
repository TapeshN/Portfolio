/*
TAPESH NAGARWAL 
tn64
SECTION 004
*/


//QUESTION 1

//	Copy the	numbers input to the	output
-122.0
3.0
11.0
-4.0
6.0
888.0
0.0


//Imports java.util file
import java.util.* ;	 // scanner	class

//declares a class called Copy
public class Copy	{


//defines function "main" with parameters: array of Strings
//special function identified by Java which gets invoked when you run the class
//this function is public, that means any other class can access it
//static means this is shared by all the objects of the class
	 public static	void main( String[] args )	{

//"stdin" is a new object created of the Scanner class found in the java.until package
//Scanner class takes the arguement which is the property of system class this property represents system input
      Scanner stdin =	new Scanner( System.in ) ;
     
//this is a function to print on standard output on two lines
		System.out.println( "Ready to copy numbers!\n Enter	EOT when	done" ) ;

//this defines a variable of primitive type double 
	  double	num ;
     
     //problem 3 modification part A
     int count= 0;
     //problem 3 modification part B
     double total = 0.0;
     
     
//this is a while look that reads from standard imput and uses the function "hasNext()"
	  while(	stdin.hasNext() )	{
     
//num variable is set to the double value entered by user
			  num	= stdin.nextDouble()	;
           
           //problem 3 modification part A
           count = count + 1 ;
           //problem 3 modification part B
           total = total + num ; 
           
//The system prints the same value on standard output with the format below
					  System.out.format(	"%.2f\n", num ) ;

//end of while loop
			  }
           
           //problem 3 modification part A
           System.out.println("count of numbers read = "+ count) ; 
           //problem 3 modification part B
           System.out.println("total of numbers read = " + total) ;
           //problem 3 modification part C
           System.out.println("Average value of numbers read = " + (total/count));
           
           
//system will print "Goodbye" on standard output
			  System.out.println( "Goodbye" ) ;

//system exits with the exit status 0
			  System.exit(	0 ) ;
           
//closes the function ,end of function(main)
	  }
     
//End of the class
}



//QUESTION 2
/*
  ----jGRASP exec: java Copy
 Ready to copy numbers!
  Enter	EOT when	done
 -122.0
 -122.00
 3.0
 3.00
 11.0
 11.00
 -4.0
 -4.00
 6.0
 6.00
 888.0
 888.00
 0.0
 0.00
 EOT
 Exception in thread "main" java.util.InputMismatchException
 	at java.util.Scanner.throwFor(Scanner.java:864)
 	at java.util.Scanner.next(Scanner.java:1485)
 	at java.util.Scanner.nextDouble(Scanner.java:2413)
 	at Copy.main(Copy.java:33)
 
  ----jGRASP wedge: exit code for process is 1.
  ----jGRASP: operation complete.
 

*/

//QUESTION 3
/*
 ----jGRASP exec: java Copy
 Ready to copy numbers!
  Enter	EOT when	done
 -122.0
 -122.00
 3.0
 3.00
 11.0
 11.00
 -4.0
 -4.00
 6.0
 6.00
 888.0
 888.00
 0.0
 0.00
 <eof>
 count of numbers read = 7
 total of numbers read = 782.0
 Average value of numbers read = 111.71428571428571
 Goodbye
 
  ----jGRASP: operation complete.
 
 
 */





