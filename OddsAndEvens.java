import java.util.*;




public class OddsAndEvens {

	public static void main(String[] args) {
		System.out.println("Let's play a game called Odds and Evens");
		Scanner input = new Scanner(System.in);
		String odd = "O";
		String even = "E";
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		String answer = "";
		while (!answer.equalsIgnoreCase(odd) && !answer.equalsIgnoreCase(even)) {
		System.out.println("Hey " + name + "!  Type O or E to choose between odds and evens");
		answer = input.nextLine();
		System.out.println("You must enter an O or E");
		}
		if(answer.equalsIgnoreCase(odd)) {
			System.out.println(name + " has chosen odd.  Let the games begin!");
			
		}else if (answer.equalsIgnoreCase(even)){
			System.out.println(name + " has chosen evens.  Let the games begin");
		}else {
			System.out.println("Yo "+ name + " that's not an O or E");	
			}
		
		
		System.out.println("---------------------------------------------------------");
		int finger = 0;
		//int [] a = new int[]{1,2,3,4,5}; trying to search for the number in array here
		
		
		System.out.println("Put a number 1-5 for how many fingers you're playing");
		finger = input.nextInt();
		Random rand = new Random();
		int computer = rand.nextInt(6);
		System.out.println("The computer plays " + computer + "!");
		
		System.out.println("---------------------------------------------------------");
		int sum = finger + computer;
		System.out.println("The total is " + sum + "!");
		
		boolean oddEven = sum % 2 == 0;
		if(oddEven == true) {
			System.out.println(sum + " is even!");
			if (answer.equals(even)) {
				System.out.println("You are the winner...");
			}
			if(answer.equals(odd)) {
				System.out.println("THE COMPUTER REIGNS SUPREME");
			}
		}else if(oddEven == false){
			System.out.println(sum + " is odd!");
			if(answer.equalsIgnoreCase(odd)){
				System.out.println("You are the winner...");
			}
			if (answer.equalsIgnoreCase(even)) {
				System.out.println("THE COMPUTER REIGNS SUPREME");
			}
		}
		
		
	}

}
