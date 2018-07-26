/* 
Tapesh Nagarwal
tn64
CS113-004
*/
import java.util.Scanner;              //imports Scanner function in util Java package
class Assignment2{                     // class name "Assignment2"

   public static void main(String[] args){  
   /*
defines function "main" with parameter of an array of Strings
special function identified by Java which gets invoked when you run the class
this function is public, that means any other class can access it
static means this is shared by all the objects of the class
*/    
      System.out.println("Welcome to the Temperature Converter Enter 0 for F -> K, otherwise 1 for K -> F");      // prints out Welcome screen and instructs user for input
      Scanner stdin = new Scanner(System.in);      // stdin equals user input everytime
      int indicator = stdin.nextInt();    // indicator is an integer type about the stdin and only takes Int args
      if (indicator == 0){    // if-statement about indicator that if indicator equals '0', do the following:
         System.out.println("Please enter a Fahrenheit temperature to convert");          //print out the statemnt to prompt user ot enter a temperature to convert
         while (stdin.hasNext()){      //while loop that states that stdin has many inputs and to utilize next input
            float F2K = stdin.nextFloat();    //F2K is in float type that equals stdin input that is float type
            if (F2K ==  32){     // if-statement about F2K that if F2K equals 32 do the following:
               System.out.println("Freezing point!");    //print out "Freezing point!"
            }     //brace for concluding the if-statement
            if (F2K == 212){     //if-statment about F2K that if F2K equals 212, do the following:
               System.out.println("Boiling point!");     //print out "Boiling point!"
            }     //brace for concluding the if-statement
            System.out.printf("Fahrenheit: " + F2K+ " to Kelvin: %.2f" , (((-32.0 + F2K ) * 5.0) / 9.0 +273.0));     // compute and print the conversion statement while restating the input with format of integers to limit to 2 decimal places
            System.out.println();      //print statement to avoid complilation errors
          }          //brace to close while loop
      }        //brace to close if=statement about user input
      if ( indicator == 1) {        //if-statement if user input equals '1' do the following:
         System.out.println("Please enter a Kelvin temperature to convert");        //print out prompt statement to user 
         while (stdin.hasNext()){      //while-loop that takes the next integer type of stdin
            float K2F = stdin.nextFloat();    //takes float input of stdin and sets it equal to Float type K2F
             if (K2F == 273){    //if-statement that if K2F equals 273, do the following:
               System.out.println("Freezing point!");          //print out "Freezing point!"
             }        //brace to close if-statement 
            if (K2F == 373){        //if-statement that if K2F equals 373, do the following:
               System.out.println("Boiling point!");     //print out "Boiling point!"
            }     //brace to close if-statement
            System.out.printf("Kelvin: " + K2F + " to Fahrenheit: %.2f" , (( (-273.0+K2F) * 9.0) / 5.0) + 32.0);     // compute and print the conversion statement while restating the input with format of integers to limit to 2 decimal places
            System.out.println();      //print statement to avoid complilation errors
         }     //brace to close the while-loop
      }     //brace to close the if-statement
   System.out.println("GoodBye");      //print out "GoodBye" when <eof>
   }     //brace for end of function
}     //brace for end of class