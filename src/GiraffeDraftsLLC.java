
import java.util.Scanner;

public class GiraffeDraftsLLC {
	public static void main(String[] args) {
		//System.out.println("You open the shop");
		//System.out.println("\"The dawn of yet another day at GiraffeDraftsLLC\"");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which client would you like to meet first?");
		
		int whichOne = input.nextInt();
		
		if (whichOne == 1) {
			Raucous client1 = new Raucous();
			client1.customer();
		}
		
		if (whichOne == 2) {
			LackadaisicalBadger client2	= new LackadaisicalBadger();
			client2.greetings();
		}
		
		if (whichOne == 3) {
			Inept client3 = new Inept();
			client3.welcome();
		}
		//System.out.println("Another dismal day here at GiraffeDraftsLLC.");
		//System.out.println("What will tomorrow bring?");
		
	}	
}
