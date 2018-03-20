import java.util.Scanner;

public class LackadaisicalBadger {
	public void greetings() {
		
		Scanner input = new Scanner(System.in);
		
		//Badger Entrance Text
		System.out.println("You hear the bells affixed to the handle of the door a-janglin' signifying the arrival of a customer. \n\t\"Welcome!\"\nYou croon as you observe a scruffy looking badger enter the shop, leaned backwards more than you feel the laws of physics should allow.\n");
		
		//print action choices
		System.out.println("\t1 Allow the customer to browse in silence");
		System.out.println("\t2 \"Is there anything in particular I can assist you with?\"\n");
		
		//get input aResponse
		int aResponse = input.nextInt();
		System.out.println("\n");
		
		if (aResponse == 1) {
			System.out.println("The customer meanders leisurely throughout the shop with drooping eyelids, yawning periodically.\nYou make eye contact two or three times, each time the badger's sleepy eyes lingering for a moment, \nthen moving on as if you were another peice of furniture.\nAt last your customer addresses you,");
		}	else if (aResponse == 2) {
			System.out.println("The customer appears startled for a moment as if they had thought they were alone, then resumes their ultra-relaxed posture and casually replies,");
			}
		
		System.out.println("\n\t\"Heeeeeeey, what's crackin, lambchop. I have a thing need done and it looks like you probably have all the stuff to do it\"");
		
		System.out.println("\nYour left eyebrow raises involuntarily as you feel your patience being depleted.\nYou can't help but feel your time is being wasted with this one\n");
		
		System.out.println("\t\"1 Lambchop...?\"");
		System.out.println("\t\"2 I'd love to help but you'll need to be more specific. What kind of work is it that you need to have done?\"\n");
		
		//get input bResponse
		//int bResponse = input.nextInt();		
		
		System.out.println("\nYou grit your herbivorous teeth as the badger is overcome by a particularly intense yawn, Throwing their arms back and leaning so far back their back is parallel to the fine hardwood floor,\n");
		System.out.println("\t\"YEEEEEEEEEEEEEEEEEeeeggedewannabowdegeduhhhhh a cabinet or a table or somefin...\"");
		
		}
			
	}