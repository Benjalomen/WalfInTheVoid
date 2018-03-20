package walfInTheVoid;

public class Hero {
	
	int health;
	int pluck;
	int focus;
	int item;
	private static String name;
	private static String shipTitle;

	// Default constructor of hero that initializes data
	public Hero() {
		health = 10;
		pluck = 10;
		focus = 10;
		item = 0;
	}
	
	// Health setter
	public void setHealth(int amountOfHealth) {
		health = amountOfHealth;
	}
	
	// Health getter
	public int getHealth() {
		return health;
	}
	
	// Pluck setter
	public void setPluck(int amountOfPluck) {
		pluck = amountOfPluck;
	}
	
	// Pluck getter
	public int getPluck() {
		return pluck;
	}
	
	// Item setter
	public void setItem(int itemNumber) {
		item = itemNumber; 
	}
	
	// Item getter
	public int getItem() {
		return item; 
	}
	
	// Hero's Name setter
	public void setName(String userInput){
		name = userInput;
	}
	
	// Hero's Name getter
	public static String getName() {
		return name;
	}
	
	// Ship Title setter
	public void setShipTitle(String nameOfShip) {
		shipTitle = nameOfShip;
	}
	
	// Ship Title getter
	public static String getShipTitle() {
		return shipTitle;
	}
	
	// List stats
	public void getStats() {
		System.out.println("Health: " + getHealth());
		System.out.println("Pluck: " + getPluck());		
	}
}
