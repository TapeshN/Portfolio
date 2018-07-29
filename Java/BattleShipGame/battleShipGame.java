
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

	//initialize game
	private void startPlaying(){
	}
	
	//method to check user guesses
	private void checkUserGuess(String userGuess){
	}

	//method to end and return user feedback
	private void finishGame(){
	}


	public static void main(String[] args) {
		BattleShipGame game = new BattleShipGame();
		game.setUpGame();
		game.startPlaying();
	
	}

}
