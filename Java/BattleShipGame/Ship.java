import java.util.*;
public class Ship {
	//Ship's instance variables: an ArrayList of cell locations && the Ship's name
	private ArrayList<String> locationCells;	
	private String name;


	//setter method that updates the Ships's location 
	//Random number provided by the GameHelper.placeShip() method
	public void setLocationCells(ArrayList<String> loc){	
		locationCells = loc;
	}

	//basic setter method
	public void setName(String n){
		name = n;
	}
	

	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0){
			locationCells.remove(index);

			if(locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! you sunk " + name+ " :( ");
			} else {
				result = "hit";
			}
		}
		return result;
	}

}
