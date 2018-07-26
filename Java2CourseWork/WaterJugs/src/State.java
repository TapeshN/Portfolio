public class State{		//describes the state of the 3 jugs
		
		int jar1;			
		int jar2;
		int jar3;
		State parent = null;			// State variable that defines the previous state 
		
		public State(int a, int b,  int c,  State pstate) {			//State constructor
			 jar1 = a;		//State variables
			 jar2 = b;
			 jar3 = c;
			
			parent = pstate;
		}
		
		public boolean equals(Object s2) {		//Checks if two State Objects are equal
			State st = (State)s2;
			if (jar1 == st.jar1 && jar2 == st.jar2 && jar3 == st.jar3) {
				return true;
			}
			return false;
		}
		
	}