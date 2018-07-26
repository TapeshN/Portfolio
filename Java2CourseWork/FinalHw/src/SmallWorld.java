import java.util.*;
public class SmallWorld {

	public static ArrayList<String> actorsName = new ArrayList<String>();
	static 	int [] distance ;

	public static void main(String[] args) throws Exception{
			
		//RetrieveActors getActors = new RetrieveActors("/Users/glbairwa/git2/riddles/src/dfs/shortestActors.list.gz");
		int count = 0;
		//ArrayList<String> actorsName = new ArrayList<String>();
		UALDictionary<String, String> dictFilms = new UALDictionary<String, String>();
		UALDictionary<String, String> dictActors = new UALDictionary<String, String>();
		UALDictionary<String, Integer> dictIndex = new UALDictionary<String, Integer>();
		//
		RetrieveActors getActors = new RetrieveActors("/Users/Tapesh/Documents/Junior S2/CS114/HWs/FinalHw/src/actors.list.gz");
		String a = getActors.getNext();
		//System.out.println(a);
		while(a != null){
			String[] data = a.split("@@@");
			String actor = data[0];
			actorsName.add(actor);
			dictIndex.insert(actor, count);
			for(int i=1; i < data.length; i++) {
				if(data[i].startsWith("FM")) {
					String film = data[i].substring(2);
					dictFilms.insert(film, actor);
					dictActors.insert(actor, film);
				}
			}
			count ++;
			a = getActors.getNext();
			//System.out.println(a);
		} 
		//
		getActors = new RetrieveActors("/Users/Tapesh/Documents/Junior S2/CS114/HWs/FinalHw/src/actresses.list.gz");
		a = getActors.getNext();
		//System.out.println(a);
		while(a != null){
			String[] data = a.split("@@@");
			String actor = data[0];
			actorsName.add(actor);
			dictIndex.insert(actor, count);
			for(int i=1; i < data.length; i++)
			if(data[i].startsWith("FM")) {
				String film = data[i].substring(2);
				dictFilms.insert(film, actor);
				dictActors.insert(actor, film);
			}
			count ++;
			a = getActors.getNext();
			//System.out.println(a);
		} 
		//create a graph of count vertices . count is equal to number of actors
		Graphl matrixGraph = new Graphl(count);
		//matrixGraph.Init(count);
		for(String film : dictActors.values()) {
			System.out.println("film="+film);
			//for every film find all the actors
			Iterable actors = dictFilms.findAll(film);
			//count number of actors in the film
			int numActors = 0;
			for(Object actor : actors) {
				numActors ++;	
			}
			//create an array of actors in the movie
			String[] actorsInMovie = new String[numActors];
			int i = 0;
			for(Object actor : actors) {
				actorsInMovie[i++] =  (String)actor;				
			}
			//create an edge between 
			for(int x = 0; x < actorsInMovie.length; x++) {
				for(int y = x+1; y <actorsInMovie.length; y++) {
					//System.out.println("x="+x);
					//System.out.println("actorsInMovie[x]="+actorsInMovie[x]);
					Integer indexOfActorAtX = dictIndex.find(actorsInMovie[x]);
					//System.out.println("indexOfActorAtX="+indexOfActorAtX);
					//System.out.println("actorsInMovie[y]="+actorsInMovie[y]);
					Integer indexOfActorAtY = dictIndex.find(actorsInMovie[y]);
					//System.out.println("indexOfActorAtY="+indexOfActorAtY);
					matrixGraph.setEdge(indexOfActorAtX.intValue(), indexOfActorAtY.intValue(), 1);					
				}
			}			
		}
		distance = new int[count];
		dictFilms = null;
		dictActors = null;
		System.gc();
		//create a distance array of integers
		for(int i=0; i < count;i++) {
			distance[i]=0;
		}
		//
        initSearch(matrixGraph);
        Integer indexOfFavoriteActor = dictIndex.find("Cronin, Doug");
        BFS(matrixGraph,indexOfFavoriteActor.intValue());
        //
        int atInfinity = 0;
	    for (int v = 0; v < matrixGraph.n(); v++) {
		      if (matrixGraph.getMark(v) == 0) atInfinity++;	    	
		}
	    //
		for(int i=0; i < count;i++) {
			if ( distance[i] > 0 ) {
				System.out.println( i +" = "+distance[i]);
			}
		}
	    
	    System.out.println("At Inifinite Distance = "+atInfinity);
	}

	
	  /*
	   * Perform topological sort of directed acyclic graph.
	   */
	  
	  static void initSearch(Graph G ) {
	    for (int v = 0; v < G.n(); v++)
	      G.setMark(v, 0); // Initialize //
	  }

	  /** Depth first search */
	  static void DFS(Graph G, int v, int dist) {
	    PreVisit(G, v); // Take appropriate action
	    G.setMark(v, 1);
	    dist++;
	    for (int w = G.first(v); w < G.n(); w = G.next(v, w)) {	  
	      distance[dist]++;
	      if (G.getMark(w) == 0) {
	    	System.out.println(actorsName.get(w) + " is at distance " + dist);
	        DFS(G, w, dist);
	      }
	    }
	    PostVisit(G, v); // Take appropriate action
	  }

	  /** Breadth first (queue-based) search */
	  static void BFS(Graph G, int start) {
	    LinkedList<Integer> Q = new LinkedList<Integer>();
	    Q.addLast(start);
	    G.setMark(start, 1);
	    int d = 0;
	    while (Q.size() > 0) { // Process each vertex on Q
	      ++d;
	      if(d > 10) {
	    	  break;
	      }
	      System.out.println("Distance = " + d);
	      int v = Q.removeFirst();
	      PreVisit(G, v); // Take appropriate action
	      for (int w = G.first(v); w < G.n(); w = G.next(v, w)) {
	    	
	        if (G.getMark(w) == 0) { // Put neighbors on Q
	          distance[d]++;
	          G.setMark(w, G.getMark(v) + 1);
	          Q.addLast(w);
	        }
	      }
	      PostVisit(G, v); // Take appropriate action
	    }
	  }
	  
	  static void PreVisit(Graph G, int v) {
		    //System.out.println("encountered vertex " + actorsName.get(v));
	  }

	  static void PostVisit(Graph G, int v) {
		    //System.out.println("leaving vertex " + actorsName.get(v));
	  }
	
}
