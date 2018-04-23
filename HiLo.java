import java.util.Scanner; //imported ability to scan numbers out of strings/input

public class HiLo { //created application in a class called HiLo

	public static void main(String[] args) {//setups a main method
		
		//get ready for the user to use the keyboard
		Scanner scan = new Scanner(System.in);//setting up a scanner to scan from system input to allow scanning in terminal 
		//play again string
		String playAgain="";
		
		
		//game loop
		do { //making a do while loop which will allow user to play again
		//create a new random number from 1-100
		 	int theNumber=(int)(Math.random()*100 + 1);//this allows the computer to randomize a number between 1-100
			//We specified to go to 100 by *100, by adding 1, it allows range to 100.9999
			//We specified as an int data type because we wanted whole numbers
			//Math.random pulls from the standard Math library in java
			int guess=0;//we set guess to 0 first as they haven't guessed yet
			int counter = 0;
			while (guess != theNumber)//while guess is not equal, keep guessing
				{System.out.println("Guess a number between 1-100");
				// get the user's guess	
				
				guess=scan.nextInt();//w be assigned guess to the next user inputted integer
				counter++;	
				if (guess < theNumber)//if guess was less than the number the computer picked by random, they received a printed line
					
					System.out.println(guess+ " is too low.  Try again");
				
				else if(guess>theNumber)
					
					System.out.println(guess + " is too high.  Try again.");
				
				else
					System.out.println(guess + " is correct! You are the winner");
					
			}  
			System.out.println("It took you " + counter + " tries, you're not very good");
			//end of while loop for guessing
			//ask user to play again, ask for 'y' to play again
			System.out.println("Would you like to play again? y/n");
			playAgain=scan.next();
			
		}while(playAgain.equalsIgnoreCase("y"));//equalsIgnoreCase ignores case sensitive so can be capitalized
		//thank user for playing
		System.out.println("Thanks for playing");
		
	}

}




