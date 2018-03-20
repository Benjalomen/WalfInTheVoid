package walfInTheVoid;

import java.util.Scanner;

public class Ship {
	public void beginning(Hero myHero) {
		// Welcome message --> consider adding getCurrentTime() like a proper ship log
		System.out.println("\nYou awake on the " + Hero.getShipTitle());
	
		System.out.println("\n\"Welcome back, Captain " + Hero.getName() +".  Which planet should we chart course for?\"\n");
		
		// Take hero to planet according to user input from map()
		int planetNum = map();
		switch (planetNum) {
			case 1:	 First.adventure(myHero);
							 break;
			case 2:	 Second.adventure(myHero);	
							 break;
			case 3:	 Third.adventure(myHero);
							 break;
			default: beginning(myHero);
		}

	}
	
	// Displays map and destination options
	public int map(){
		Scanner input = new Scanner(System.in);
		
		//Display options
		System.out.println("\t1 - " + First.planetName);
		System.out.println("\t2 - " + Second.planetName);
		System.out.println("\t3 - " + Third.planetName);
		System.out.print("\nEnter planet number:  ");
		
		//Let user decide which planet they want to go to
		int destination = input.nextInt();
		return destination;
	}
}