import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MostAnagrams {

  public static void main(String[] args) {
	  
	  HashMap anagramCount = new HashMap();
	  File file = new File("/Users/Tapesh/Documents/Junior S2/CS114/hw4/hw4/src/words.txt"); 
    //File file = new File("../resource/asnlib/publicdata/words.txt"); 

    Scanner input = new Scanner(System.in);
    int maxWords = input.nextInt(); // the maximum number of lines to read
    int n=0; // for counting the number of words read
 
    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNext()) {
        String word = scanner.next(); // read in the next word
        ++n;
        if(n >= maxWords)
            break;
        
        findAnagramAndIncrementCount(anagramCount, word);
        
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // compute max, the maximum number of anagrams for any word
    int max = 0;
    Iterator it = anagramCount.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        if((int)pair.getValue() > max) {
        		max = (int) pair.getValue();
        }
    }


    System.out.println(max);

  }
  
  static void findAnagramAndIncrementCount(HashMap anagramCount, String word){
	  boolean matchFound = false;
	  Iterator it = anagramCount.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        if(validAnagram((String)pair.getKey(), word)) {
	        	int count = (int)pair.getValue();
	        	count ++;
	        	pair.setValue(count);
	        	matchFound = true;
	        	break;
	        }
	        
	    }
	    if(matchFound == false) {
	    		anagramCount.put(word, 1);
	    }
  }
  
  private static boolean validAnagram(String str, String pair) {
	  if(str.length() != pair.length()){
	      return false;
	  }

	  char[] strArr = str.toLowerCase().toCharArray();
	  char[] pairArr = pair.toLowerCase().toCharArray();

	  Arrays.sort(strArr);
	  String newStr = new String(strArr);

	  Arrays.sort(pairArr);
	  String newPair = new String(pairArr);

	  if(newStr.equals(newPair)) {
		  return true;
	  }else {
	  return false;
	  }
  
}
  
  
  
}