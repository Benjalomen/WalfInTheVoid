import java.util.Scanner;
public class Inept {
	public void welcome() {
		
		Scanner input = new Scanner(System.in);
		
		// Input name
		System.out.println("\nA man wanders in carelessly. He stares at the high ceilings in amazement, and then trips over the rug that is hugs the center of the lobby. Unable to catch his ballance he fumbles and flails his arms till the one of a kind end table breaks his fall and shatters into collectibles for a fireplace. I... I... I'm sorry Mr. Giraffe! Here let me.... No no no, its alright Mr.. Mr.. uh please forgive me Ive forgotten your name, can you remind me? \n");
		String name = input.next();
		
		// Response #1
		System.out.println("Thats right  " + name + "! How could I forget. \"Last time you were here you destroyed my drawing board and spent an hour talking about squirrels...\" What was that replied " + name + "?");
		
		System.out.println("\n\t1 I said you renewed my love for architecture and gave me hope for humanity");
		System.out.println("\t2 You heard me Bitch! You ruined my drawing board and spent an hour talkin about stupid squirrels");
		int aResponse = input.nextInt();
		System.out.print("\n");
		
		if (aResponse == 1){
			kind();
		} else if (aResponse == 2){
			mean(name);
		}
	}
			
		public void kind() {
          
 		Scanner input = new Scanner(System.in);
  	 
  	//reponse #2 Kind
  	System.out.println("Oh, why yes I did! Actually, can I show you something, I have a brand new idea for my squirrel farm. Here let me show you what I have in mind for my new squirrel penthouse... Oh but firts look how big Mr. Fun Nuts has gotten. -pulls out walleted pictures of way to many squirrels-.");
          
  	// FINISH MEJOASDFJASODGJAOPSDHGPOASDHGOPASHDOGHASODFGHOASDFJGPASKFDGPASFJDGOPHASOFDHGOASHDFGO 
 		System.out.println("\n\t1 I would absolutely love to see it!");
 		System.out.println("\t2 Can you please keep it down, I don't feel comfortable with you saying -looks around leans in close and whispers- Mr. Fun Nuts");
  	 
  	 int akResponse = input.nextInt();
  	 
  	 if (akResponse == 1){
  		 resolutionGoodA();
     } else if (akResponse == 2){
       resolutionBadA();
     }
   }
      
   public void mean(String name) {
 
  	 Scanner input = new Scanner(System.in);
       	
     //response #2 Mean
      System.out.println("Well, I've never been so insulted! Good day sir, and I'll think twice again before I show you Mr. Fun Nuts again! Good luck getting my business again");     
     
     System.out.println("\n\t1 Wait! Mr. " + name +", I.. I'm sorry, its just been a rough day, My wife left me whith the kids and that table that you smashed was a gift form her and the kids last Christmas. ");
     System.out.println("\t2 Ya get out of hear you piece of garbage before I headbut you till you can't see straight!");

  	 int amResponse = input.nextInt(); 


  	
  	 if (amResponse == 1)
       resolutionGoodB(name);
     else if (amResponse == 2)
    	 resolutionBadB();
   }
      
   //Good Resolution
   public void resolutionGoodA() {
  	 System.out.println("I would absolutely love to see it!");
   }
      
   public void resolutionGoodB(String name) {
  	System.out.print("GOOD B"); 
   }
   
   //Good Resolution
   public void resolutionBadA() {
  	 System.out.println("BAD A");
   }
      
   public void resolutionBadB() {
  	System.out.print("BAD B"); 
   }
 }