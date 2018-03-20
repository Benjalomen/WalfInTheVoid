import java.util.Scanner;

public class Raucous {
	public void customer () {
		
		Scanner input = new Scanner(System.in);
		
		int hp = 3;
		
		System.out.println("HP: " + hp + " ----> You start the day rested and full of energy.");

		System.out.println("\nCRASH!!!");
		System.out.println("A stout, messy-looking ferret booms through your door");
		
		System.out.println("\n\"Morning there to ya, big man!  I gotta job for you that ah' know you will NOT want tah' pass up!\"");

		// Response #1
		System.out.println("\n\t1 \"PEST!  Leave me now!  We open in 15 minutes!\"");
		System.out.println("\t2 \"Why, of course, sir!  To whom, my dear ferret, do I owe the pleasure?\"");
		
		int aResponse = input.nextInt();
		System.out.print("\n");
		
		if (aResponse == 1){
			System.out.println("\"A fight!?  Ya, lanky bastard! \"");
			System.out.println("A brawl ensues and you lose");
			hp--;
			hp--;
			System.out.println("HP: " + hp + " ----> Weakly, you splutter out a final curse before collapsing onto the newly remodled countertop");
		} else if (aResponse == 2){
			System.out.println("Spineless cuss!  I'll fight ya right now, ya lanky bastard!!!");
			System.out.println("A brawl ensues and you lose");
			hp++;
			hp++;
			hp++;
			System.out.println("HP: " + hp + " ----> The blood of your enemy coats your fierce hooves.  You are filled with strength fopr the day ahead");
		}
		
		//System.out.println("\"Howdy, friend!  I been waiting since dawn to get your thoughts on my new home.\"");
		
		
	}
}
