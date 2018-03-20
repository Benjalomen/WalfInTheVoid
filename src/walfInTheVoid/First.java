package walfInTheVoid;

import java.util.Scanner;

//TO DO:
//    - Explain experience from 3rd person limited POV
//		- if health <= 0 --> return to ship with Ship()
//		- if pluck <= 0 --->  ???????
//		- if focus <= 0 --> ??????
public class First {
	// Name your alien planet!
	static String planetName = "Il Mondo";

	// Your adventure should be written below
	public static void adventure(Hero myHero) {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\t--------------------------------- CHAPTER 9 ----------------------------------------");
		
		System.out.println("\nAdmiral Robotson sings gaily in the background as he steadies the " + Hero.getShipTitle() + " over the world below.");
		System.out.println("\n\t\"Do not be fooled, there is never just one");
		System.out.println("\tThese damn waves are temp'ry, no fear need we shun");
		System.out.println("\tWhat course ought we set?  What flag do we run?\"");
		
		// Choose thine own flag, Captain
		System.out.println("\nObserving the foggy, alien landscape below, " + Hero.getName() + " absent-mindedly finishes the verse... ");
		System.out.println("\n\t1 - \"Love all.  Trust few.  Do wrong to none.\"");
		System.out.println("\t2 - \"Me and mine own.  I need no redemption\"");
		int flag = input.nextInt();
		
		if (flag == 1) {
			myHero.pluck++;
			System.out.println("\nYou swell with a rich appreciation for life ---> Pluck increases");
			System.out.println("                                            ---> Focus decreases");
		} else if (flag == 2) {
			myHero.focus++;
			System.out.println("\nYou surge with ambition for the hunt ---> Focus increases");
			System.out.println("                                     ---> Pluck decreases");
		}
		
		System.out.println("\nYou give yourself to the planet's heavy pull");
		
		System.out.println("\nCaptain " + Hero.getName() + " embarks on a truly memorable adventure");
	}
}
