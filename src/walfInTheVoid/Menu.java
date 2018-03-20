package walfInTheVoid;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		//Spawn hero
		//	- set hero's name
		Hero myHero = new Hero();
		System.out.print("Enter hero's name:  ");
		myHero.setName(input.next());
		
		//	- set ship's title
		System.out.print("Enter ship's name:  ");
		myHero.setShipTitle(input.next());
		
		//Ship
		Ship myShip = new Ship();
		myShip.beginning(myHero);
		//myShip.beginning(myHero);
		
		//Run appropriate planet arc
		//    - Explain experience from 3rd person limited POV
		//		- if health <= 0 --> return to ship with Ship()
		//		- if pluck <= 0 --->  ???????
				
	}

}
