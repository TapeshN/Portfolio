
import java.util.*;	//import java.util


/*
This class 
*/

public class WaterJugs {		//WaterJug class with 3 jugs below
	
	Jug jar1;
	Jug jar2;
	Jug jar3;
	
	public WaterJugs(int a,int aMax, int b, int bMax, int c, int cMax) {	//takes parameters of Initial water level and max capacity of the 3 jugs
		 jar1 = new Jug(a, aMax);
		 jar2 = new Jug(b, bMax);
		 jar3 = new Jug(c, cMax);
	}
	public static void main(String[] args) {				//read the 4 input parameters from user of Int Type a
		Scanner userIn = new Scanner(System.in);
		int j1max = userIn.nextInt();
		int j2max = userIn.nextInt();
		int j3max = userIn.nextInt();
		int goal = userIn.nextInt();
		
		WaterJugs initJugs = new WaterJugs(j1max, j1max, 0, j2max, 0, j3max);		//initJugs records the initial capacities of the jugs
		State top = initJugs.outputState(null);						
		State finalState = null;										
		Queue<State> queue = new LinkedList<State>(); 				//implement Queue using LinkedList of State Type Objects
		queue.add(top);												
		ArrayList<State> visited = new ArrayList<State>();			//Implement ArrayList that shows visited states to avoid visiting same state again
		visited.add(top);
		boolean found = false;
		while(!found) {
			State givenState = queue.peek();												// use peek function to retrieve current state
			ArrayList<State> moves = initJugs.calculateNextMoves( givenState, visited);	//Calculate all next possible moves
			if(moves.isEmpty() && queue.isEmpty()) {										//If there are no moves, then break while loop	
				break;
			}
			for (State curMove: moves) {													// Iterate over the moves
				//printState(curMove);
				  if(isFinal(curMove,goal)) {											//check if curMove meets goal else add to Visited Arraylist and Queue
					  found = true;
					  finalState = curMove;
					  break;
				  } 	
				  visited.add(curMove);
				  queue.add(curMove);
			}
			queue.remove();																//remove current state from Queue
		}
		//repeat
		if(found) {																		//if found == true then print queue with solution on top 
			System.out.println("--Solution---");
			State curState = finalState;
			do {
				System.out.println(curState.jar1 + " " + curState.jar2 + " " + curState.jar3);
				curState = curState.parent;
			} while(curState != null);
		}
		
	}
	
	 ArrayList<State> calculateNextMoves(State givenState, ArrayList visited){			//calculates next moves by using givenState and Visited list
		
		ArrayList<State> aList = new ArrayList<State>();
		//first move 
		readState(givenState);			//read giveState
																		//Check to see if jars are emptyOrFill-ed
		if(emptyOrFill(jar1,jar2)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		//
		readState(givenState);
		if(emptyOrFill(jar1,jar3)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		//
		readState(givenState);
		if(emptyOrFill(jar2,jar1)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		//
		readState(givenState);
		if(emptyOrFill(jar2,jar3)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		//
		readState(givenState);
		if(emptyOrFill(jar3,jar1)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		//
		readState(givenState);
		if(emptyOrFill(jar3,jar2)) {
			State s = outputState(givenState);
			if(!visited.contains(s) && !aList.contains(s)) {
				aList.add(s);
			}
		}
		
		return aList;
	}
	
	public boolean emptyOrFill(Jug j1,Jug j2){				//boolean method to check if jugs are emptyOrFill-ed 
		int amountToBeTransfered;							//makes sure max capacity of jugs are consistent and consistent amount of water is being transfered
		int jug2Intake = j2.maxCap - j2.current;				
		if (jug2Intake == 0) {
			return false;
		}
		if (j1.current == 0) {
			return false;
		}
		if (jug2Intake <= j1.current) {
			amountToBeTransfered= jug2Intake;
		}else {
			amountToBeTransfered = j1.current;
		}
		j1.current = j1.current - amountToBeTransfered;
		j2.current = j2.current + amountToBeTransfered;
		return true;
		
	}
	
	State outputState(State parent) {											//outputs State
		return new State(jar1.current,jar2.current,jar3.current,parent);			//creates a new state object that represent from the current state
	}
	
	void readState (State s) {
		jar1.current = s.jar1;
		jar2.current = s.jar2;
		jar3.current = s.jar3;
		
	}
	
	static boolean isFinal(State f, int goal) {					//double all jugs if the jug level == goal we want to reach
		if(f.jar1 == goal) {
			return true;
		}
		if(f.jar2 == goal) {
			return true;
		}
		if(f.jar3 == goal) {
			return true;
		}
		return false;
	}
	
	static void printState(State s) {										//print State method
		System.out.println(s.jar1 + " " + s.jar2 + " " + s.jar3);
		
	}
}