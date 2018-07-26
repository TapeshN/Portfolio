package hw6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MostHomophones {

	public static void main(String[] args) {
		UALDictionary<String, String> dict1 = new UALDictionary<String, String>();
		UALDictionary<String, String> PDict = new UALDictionary<String, String>();
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
			
					PDict.insert(p.getPhonemes(), p.getWord());
					dict1.insert(p.getWord(),p.getPhonemes());
					
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		long middle = System.currentTimeMillis();

		System.out.println("Loaded dictionary.");
		int maxWords = 0;
		String maxWordsPhonemes = null;
		for (String phonemes : dict1.values()) {
			System.out.println(phonemes);
			Iterable words = PDict.findAll(phonemes);
			int num = ((Collection<?>)words).size();
			if(num > maxWords) {
				maxWords = num;
				maxWordsPhonemes = phonemes;
			}
		}
		
		String answer =  "The max words with phonemes is: "+ maxWordsPhonemes;
		System.out.println(answer);
		Iterable words = PDict.findAll(maxWordsPhonemes);
		for(Object word: words) {
			System.out.println((String)word);
		}
		long end = System.currentTimeMillis();
		System.out.println("Run times: load dictionary= " + (middle - start)
				+ " process= " + (end - middle) + " total= " + (end - start));		
	}
}


