
public class BattleShipGame {

	//declare and initialize the variables we'll need
	private GameHelper helper = new GameHelper();
	private ArrayList<Ship> shipList = new ArrayList<Shop>();
	private int numOfGuesses = 0;

	//make the game board with 3 ships
	private void setUpGame(){
		Ship one = new Ship();
		one.setName("Mayflower");
		Ship two = new Ship();
		two.setName("RMS Lusitania");
		Ship three = new Ship();
		three.setName("USS Arizona");
		
		//add ships to shipList
		shipList.add(one);
		shipList.add(two);
		shipList.add(three);

		//print brief instructions for user
		System.out.println("Your goal is to sink three battleships");
		System.out.println("The Mayflower, RMS Lusitania, and the USS Arizona");
		System.out.println("Try to sink them all in the fewest number of guesses");
		

		//make locations for all three ships
		for (Ship currShip : shipList){
			ArrayList<String> newLocation = helper.placeShip(3);
			currShip.setLocationCells(newLocation);
		}
	}

	//initialize game and keep asking for user guesses until shipList is all sunk
	private void startPlaying(){
		while(!shipList.isEmpty()){	
			String userGuess = helper.getUserInput("Enter a Guess: ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	//method to check user guesses
	private void checkUserGuess(String userGuess){
		numOfGuesses++;					//increment the number of guesses the user has made
		String result = "miss";				//assume it is a 'miss' unless told otherwise
		for(int x = 0; x<shipList.size(); x++){		//for all Ships in shipList
			result = shipList.get(x).checkYourself(userGuess);	//ask the Ship to check the user guess while looking for hit
			if (result.equals("hit"){
				shipList.remove(x);				//if userGuess hit's ship, remove the ship
				break;
			}
		}
		System.out.println(result);				//print result for user
	
	}

	//method to end and return user feedback
	private void finishGame(){
		System.out.println("You've sunk all the ships!");
		if(numOfGuesses <= 18){
			System.out.println("It only took you + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else{
			System.out.println("Took you long enough. " numOfGuesses + " guesses.);
		}


	public static void main(String[] args) {
		BattleShipGame game = new BattleShipGame();
		game.setUpGame();
		game.startPlaying();
	}

}
