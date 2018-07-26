

// Tapesh Nagarwal tn64 section-004
class Assignment_3{
   public static void main(String[] args){
/*Excercise 1
A)
i. while(expression)statement
 a while loop is a language contruct that allows certain code to excute while a particular condition is true and can only be ended if the condition is false */ 
      int x = 1;                 // sets a variable 'x' = 1
      while (x < 10){            // executes while loop with a condition that "x <10"
        System.out.println(x);     // Prints out value of x
        x ++;                      // increments x value by 1 and continues loop
      }

/*ii.
for (initialization; loop continuation expression; increment/update) statement 
a for loop is a language contruct that allows one variable at a time from a list to go through code set by the for loop */
      for (int i = 1; i < args.length  ; i= i*2) { 
         System.out.println(args[i]);
      }
      
/* iii.) if(expression = true){code}
an if statement executes code if the expression is true */
// print result of looking for integer x in database 
   if (found){
      System.out.printf("\t>>%d is in database\n", x);
   }
   
/*iv. variable = type[int]
A one-dimensional array is a sequence of elements that are accessed by specifying their position.
An n-dimensional array type is a sequence of (n-1)-dimensional arrays*/
 year = new int[12];

// v. Boolean is a true or false
user = true;
if (user==true){
            System.out.println("user is true");
}
else {
System.out.prtinln("it’s false");
}
  }
}

/*
B) A break statement discontinues a loop that can reiterate infintely. This code can terminate code.
C)Strings are immutable, meaning they cannot be changed. An example of the method can be toLowerCase(): that creates a completely separate String that is lower cased. 
*/

//Exercise 2 DIRECTORY LOOK UP APPLICATION;
import java.util.*;                                //imports all functions of util class
import java.io.*;                                  //imports all functions of IO class
class Assignment_3{                                //declares the class of "Assignment_3"
   public static void main(String[] filename) throws IOException {         
   /*
defines function "main" with parameter of an array of Strings
special function identified by Java which gets invoked when you run the class
this function is public, that means any other class can access it
static means this is shared by all the objects of the class

throws IOExeption means that IOExceptions are not read as compliation errors
*/ 
      File text = new File(filename[0]);        // sets a File type variable "text" to  the first argument in filename
      Scanner input = new Scanner(text);        // uses Scanner class to set variable "input" equal to the items in the "text" above
      int size = input.nextInt();               // declares "size" is an int and checks "input" for the next Int
      String[] nameDB = new String[size];       // creates an array called "nameDB" that has the size of "size"
      for (int i = 0; i < size; i++){           // for loop that has the preset condition that i = 0 and the condition that i < size, then the for loop should continue and increment i by +1
         nameDB[i] = input.next();              // the for loop condition that nameDB[i] = the next input. The value of the array fills with the next input
      }                                         // close for loop
      System.out.println("Database Server is Ready for String Lookups!");     // After forming the array in memory, print out "Database Server is ready for string lookup!"
      Scanner userInput = new Scanner(System.in);                             // user the Scanner class function to get input from the user 
      int count = 0;                                                          // counter set to 0 to count amount of input
      while (userInput.hasNext()){                                            // while loop that continues while there is more input by the user
         String userEntry = userInput.next();                                 // assigns the String userEntry as the next input by the user
         System.out.println("String to lookup: " + userEntry);                // prints out "String to lookup:" and prints out the user entry
         boolean found = false;                                               // boolean variable called 'found' is preset to false
         for (int i = 0; i < size; i++){                                      // for loop that initilizates i as 0 and has the condition that i < size and if true, perform for loop code and increment i by 1
            if(userEntry.equalsIgnoreCase (nameDB[i])){                       // if condtion that should make userEntry not case sensitive and uses the parameter of nameDB[i]
            found = true;                                                     // if the if condition is true, make found variable true as well
            System.out.println(userEntry + " is in the database!");           // print out statement that states that the userEntry "is in the database!"
            }                                                                 // close the if condition
         }                                                                    // close the for loop
         if(found == false){                                                  // if condition if found == false
            System.out.println(userEntry + " is not in the database!");       // print out statement that states the the userEntry "is not in the database!"
         }                                                                    // closes the if condition
         count ++;                                                            // adds to the count
      }                                                                       // closes the while loop                  
      System.out.println("Number of Searches: " + count);                     // prints the "Number of Searches" + count value
      System.out.println("Goodbye!");                                         // prints out "Goodbye!"
   }                                                                          // closes the function
}                                                                             // closes the class

