
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;

/* Starter code for PS8.
 */

public class RankMovies {

	public static void main(String[] args) {
				File file = new File("/Users/Tapesh/Documents/Junior S2/CS114/HWs/MaxHeap/src/ratings-utf8.txt");
		ArrayList<MovieRating> rl = new ArrayList<MovieRating>();

		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
                                /* Read in lines, using fact that the
                                 * title starts in column 32, and the
                                 * other information is separated by
                                 * 1 or more blanks.
                                 */
				String line = scanner.nextLine();
				String pre = line.substring(0, 31);
				String post = line.substring(32);
				String[] tkns = pre.split("\\s+");

				MovieRating nr = new MovieRating(tkns[2], tkns[3], post);
				rl.add(nr);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		int minVotes = 1;
		int numRecords = 1;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter minimum vote threshold and number of records:");
			minVotes = input.nextInt();
			numRecords = input.nextInt();
			int recordPrinted = 0;
			if (minVotes * numRecords == 0) {
				break;}
			
			long startTime = System.currentTimeMillis();
			/*
			MovieRating [] mr = new MovieRating[rl.size()];
			MaxHeap<MovieRating> mh = new MaxHeap<MovieRating>(rl.toArray(mr));

			while(recordPrinted < numRecords ) {
				
				MovieRating curr = mh.removemax();
				if ( curr.getVotes() > minVotes ) {
					System.out.println(curr.toString());
					recordPrinted++;
				} 
				
			}
			*/
			
			MinHeap<MovieRating> mh = new MinHeap<MovieRating>();
			for( int i=0; i< rl.size(); i++) {
				MovieRating curr = rl.get(i);
				
				if ( curr.getVotes() > minVotes ) {
					if ( mh.heapsize() < numRecords )
						mh.insert(curr);
					else {
						MovieRating heapMin = mh.removemin();
						if ( curr.getRating() > heapMin.getRating()) {
							mh.insert(curr);
						} else {
							mh.insert(heapMin);
						}
					}
				} 
			}
			
			while ( !mh.isEmpty()) {
				MovieRating curr = mh.removemin();
				System.out.println(curr);				
			}
				
			System.out.println();;
			long readTime = System.currentTimeMillis();
			System.out.println("Time: "+(System.currentTimeMillis()-startTime)+" ms");
		}
		
	}

}