
public class SortIdentifier {
	
	public static void main(String [] args ) {
	    MysterySorts srts = new MysterySorts();
	    int n=500000;
	    int k = 2; // experiment size
	    int REP = 10; // how many times to repeat experiment

	    long[] shuffleddata = new long[k]; // to store run times
	    long[] sorteddata = new long[k]; // to store run times
	    // case 0
	    for (int i = 0; i < k; ++i) { 
	      n = (i + 1) * 10000;
	      Integer[] A = new Integer[n];
	      for (int j = 0; j < n; ++j)
	        A[j] = j;
	      //shuffled array
	      long start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.shuffleArray(A);
	        srts.sort(0,A);
	      }
	      long now = System.currentTimeMillis();
	      long elapsed = now - start;
	      shuffleddata[i] = (int) elapsed;
	      //sorted array
	      start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.sort(0,A);
	      }
	      now = System.currentTimeMillis();
	      elapsed = now - start;
	      sorteddata[i] = (int) elapsed;
	    }
	    
	    float twiceShuffledFactor =  shuffleddata[1]/shuffleddata[0] ;
	    float twiceSortedFactor = 1;
	    if (sorteddata[0] != 0  ) {
	    	twiceSortedFactor = sorteddata[1]/sorteddata[0];
		    System.out.println(twiceShuffledFactor);
		    System.out.println(twiceSortedFactor);
		    if (twiceShuffledFactor > 3 && twiceSortedFactor > 3 ) System.out.println("selection");
		    else if ( twiceShuffledFactor <= 2 && twiceSortedFactor <= 2 ) System.out.println("heap");
		    else if ( twiceShuffledFactor >=2 && twiceShuffledFactor <= 4 && twiceSortedFactor >=2 && twiceSortedFactor <= 4 ) System.out.println("insertion");
		    else  System.out.println("quick");
	    } else {
	    	System.out.println("insertion");
	    }
		 
		//case 1
		 
	    for (int i = 0; i < k; ++i) { 
	      n = (i + 1) * 10000;
	      Integer[] A = new Integer[n];
	      for (int j = 0; j < n; ++j)
	        A[j] = j;
	      //shuffled array
	      long start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.shuffleArray(A);
	        srts.sort(1,A);
	      }
	      long now = System.currentTimeMillis();
	      long elapsed = now - start;
	      shuffleddata[i] = (int) elapsed;
	      //sorted array
	      start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.sort(1,A);
	      }
	      now = System.currentTimeMillis();
	      elapsed = now - start;
	      sorteddata[i] = (int) elapsed;
	    }

	    twiceShuffledFactor =  shuffleddata[1]/shuffleddata[0] ;
	    if (sorteddata[0] != 0  ) {
	    	twiceSortedFactor = sorteddata[1]/sorteddata[0];
		    System.out.println(twiceShuffledFactor);
		    System.out.println(twiceSortedFactor);
		    if (twiceShuffledFactor > 3 && twiceSortedFactor > 3 ) System.out.println("selection");
		    else if ( twiceShuffledFactor <= 2 && twiceSortedFactor <= 2 ) System.out.println("heap");
		    else if ( twiceShuffledFactor >=2 && twiceShuffledFactor <= 4 && twiceSortedFactor >=2 && twiceSortedFactor <= 4 ) System.out.println("insertion");
		    else  System.out.println("quick");
	    } else {
	    	System.out.println("insertion");
	    }

		 // case 2
	    for (int i = 0; i < k; ++i) { 
	      n = (i + 1) * 10000;
	      Integer[] A = new Integer[n];
	      for (int j = 0; j < n; ++j)
	        A[j] = j;
	      //shuffled array
	      long start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.shuffleArray(A);
	        srts.sort(2,A);
	      }
	      long now = System.currentTimeMillis();
	      long elapsed = now - start;
	      shuffleddata[i] = (int) elapsed;
	      //sorted array
	      start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.sort(2,A);
	      }
	      now = System.currentTimeMillis();
	      elapsed = now - start;
	      sorteddata[i] = (int) elapsed;
	    }
	    
	    twiceShuffledFactor =  shuffleddata[1]/shuffleddata[0] ;
	    if (sorteddata[0] != 0  ) {
	    	twiceSortedFactor = sorteddata[1]/sorteddata[0];
		    System.out.println(twiceShuffledFactor);
		    System.out.println(twiceSortedFactor);
		    if (twiceShuffledFactor > 3 && twiceSortedFactor > 3 ) System.out.println("selection");
		    else if ( twiceShuffledFactor <= 2 && twiceSortedFactor <= 2 ) System.out.println("heap");
		    else if ( twiceShuffledFactor >=2 && twiceShuffledFactor <= 4 && twiceSortedFactor >=2 && twiceSortedFactor <= 4 ) System.out.println("insertion");
		    else  System.out.println("quick");
	    } else {
	    	System.out.println("insertion");
	    }
		 //case 3
	    for (int i = 0; i < k; ++i) { 
	      n = (i + 1) * 10000;
	      Integer[] A = new Integer[n];
	      for (int j = 0; j < n; ++j)
	        A[j] = j;
	      //shuffled array
	      long start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.shuffleArray(A);
	        srts.sort(3,A);
	      }
	      long now = System.currentTimeMillis();
	      long elapsed = now - start;
	      shuffleddata[i] = (int) elapsed;
	      //sorted array
	      start = System.currentTimeMillis();
	      for (int rep = 0; rep < REP; ++rep) {
	        srts.sort(3,A);
	      }
	      now = System.currentTimeMillis();
	      elapsed = now - start;
	      sorteddata[i] = (int) elapsed;
	    }
	    
	    twiceShuffledFactor =  shuffleddata[1]/shuffleddata[0] ;
	    if (sorteddata[0] != 0  ) {
	    	twiceSortedFactor = sorteddata[1]/sorteddata[0];
		    System.out.println(twiceShuffledFactor);
		    System.out.println(twiceSortedFactor);
		    if (twiceShuffledFactor > 3 && twiceSortedFactor > 3 ) System.out.println("selection");
		    else if ( twiceShuffledFactor <= 2 && twiceSortedFactor <= 2 ) System.out.println("heap");
		    else if ( twiceShuffledFactor >=2 && twiceShuffledFactor <= 4 && twiceSortedFactor >=2 && twiceSortedFactor <= 4 ) System.out.println("insertion");
		    else  System.out.println("quick");
	    } else {
	    	System.out.println("insertion");
	    }

	}

}
