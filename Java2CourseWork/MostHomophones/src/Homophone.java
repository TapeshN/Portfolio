package hw6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Homophone {

	public static void main(String[] args) {
		UALDictionary<String, Pronunciation> PDict = new UALDictionary<String, Pronunciation>();
		File file = new File("/Users/Tapesh/Documents/Junior S2/CS114/hw6/hw6/src/hw6/cmudict.0.7a.txt");
	    
		final int len = 5;  // we start with words of length 5 characters

		long start = System.currentTimeMillis();

		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.substring(0, 3).equals(";;;"))
					continue; // skip comment lines
				Pronunciation p = new Pronunciation(line);
			
					PDict.insert(p.getWord(), p);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		long middle = System.currentTimeMillis();

		System.out.println("Loaded dictionary.");

		for (Pronunciation p : PDict.values()) {
			String w = p.getWord();
			if (w.length() == len) {
					
                        /* Fill in code to determine if this word
                           is pronounced the same if we remove the
                           first letter or if we remove the second.
                         */

			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Run times: load dictionary= " + (middle - start)
				+ " process= " + (end - middle) + " total= " + (end - start));
	}
}
