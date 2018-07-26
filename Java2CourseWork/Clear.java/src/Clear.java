
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Clear {
	public static void main(String[] args) throws IOException {
	    int pics = 17;
	    File[] file = new File[pics];
	    String prefix = "/Users/Tapesh/Documents/Junior S2/CS114/HWs/Clear.java/src/Birds-20180402/";
	    for (int p = 1; p <= pics; ++p) {
	      String suff = String.valueOf(p);
	      String filename = prefix + "birds" + suff + ".ppm";
	      System.out.println("Opening "+filename);
	      file[p-1] = new File(filename);
	    }
	
	    long start = System.currentTimeMillis();
	
	    // create a scanner for each of the pictures
	    //
	    Scanner[] scan = new Scanner[pics];
	
	    int rows = 0, cols = 0, mx = 0;
	    for (int i = 0; i < pics; ++i) {
	      try {
	        scan[i] = new Scanner(file[i]);
	        String line = scan[i].nextLine();
	        cols = Integer.parseInt(scan[i].next());
	        rows = Integer.parseInt(scan[i].next());
	        mx = Integer.parseInt(scan[i].next());
	      } catch (FileNotFoundException e) {
	        e.printStackTrace();
	      }
	    }
	
	    // open output file and print out header
	
	    BufferedWriter output = new BufferedWriter(new FileWriter("/Users/Tapesh/Documents/Junior S2/CS114/HWs/Clear.java/src/Birds-20180402/" + ".ppm"));
	    output.write(String.format("%s\n", "P3"));
	    output.write(String.format("%d  %d\n", cols, rows));
	    output.write(String.format("%d\n", mx));
	    System.out.println(rows + ", " + cols + ", " + mx);
	
	    
	    Integer [] colors = new Integer[pics];
	    
	    for (int i = 0; i < cols; ++i) {
	      for (int j = 0; j < rows; ++j) {
	        //read in red, green, blue
	    	//The noise is mostly black , so just take the highest value of the color. This will ignore the noise.
	    	  
	        for (int c = 0; c < 3; ++c) {
	          for (int k = 0; k < pics; ++k){
	        	colors[k]= Integer.valueOf(scan[k].next());
	          }
	          //take the median of colors distribution 
	          List<Integer> colorList = Arrays.asList(colors);
	          Integer max = Collections.max(colorList);
	          output.write(String.format("%d ", max.intValue()));
	        }
	      }
	      output.write(String.format("\n"));
	    }
	
	    for (int i = 0; i < pics; ++i) {
	      scan[i].close();
	    }
	    output.close();
  }

}
