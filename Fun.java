import java.util.*;

public class Fun {

	
	public static void main(String[] args) {		
		greeting();
		travel();
		timeDif();
		distance();
		
		}
	public static void greeting() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Vacation Planner");
		System.out.print("What's your name?");
		String name = input.nextLine();
		System.out.print("Whattup " + name + ", where are you going?");
		String place = input.nextLine();
		System.out.print(place + " sounds cool.");
	}
	
	public static void travel() {	
		
		Scanner input = new Scanner(System.in);
		System.out.print(" How many days are you going to be traveling?");
		int time = input.nextInt();
		System.out.print("How much money do you plan to spend?");
		double money = input.nextDouble();
		System.out.print("What's the three letter currency for your destination?");
		input.nextLine();
		String currency = input.nextLine();
		System.out.print("How many " + currency + " are in 1 US dollar?");
		double convert = input.nextDouble();
		
		int hours = time * 24;
		int minutes = hours * 60;
		double moneyDay = (money / time) *100;
		int x = (int) moneyDay;
		double moneyDay2 = x/100;
		double newCurrency = (money * convert)*100;
		int y = (int) newCurrency;
		double newCurrency2 = y/100;
		double currencyDay = (newCurrency2 / time)*100;
		int z = (int) currencyDay;
		double currencyDay2 = z/100;
		String newLine = System.getProperty("line.separator");
		
		System.out.println("So if your traveling for " + time + " days, then that's the same as " + hours + " hours, and " + minutes + " minutes."
				+ newLine + " If you're spending $" + money + " then you can spend $" + moneyDay2 + " a day."
				+ newLine + " Your total budget in " + currency + " is " + newCurrency2 + " which is " + currencyDay2 + " a day in " + currency);
	}
		
	public static void timeDif() {
		System.out.println("*********************************************************************************************");
		String newLine = System.getProperty("line.separator");
		Scanner input = new Scanner(System.in);
		System.out.print("What is the time difference, in hours, between your home and your destination?");
		int difference = input.nextInt();
		if (difference > 0){
			System.out.println("That means when it's midnight, it will be " + (difference % 24) + ":00, and when"
					+ newLine + " it's noon at home, it'll be " + (difference %24 +12) + ":00 at your vacation spot");
		}else {
			System.out.println("That means when it's midnight, it will be " + (24 + difference) + ":00, and when"
					+ newLine + " it's noon at home, it'll be " + (12 + difference) + ":00 at your vacation spot");
		}
		
	}
	public static void distance() {
		System.out.println("*********************************************************************************************");
		Scanner input = new Scanner(System.in);
		System.out.print("What is the square area of your destination country in km2?");
		double km = input.nextDouble();
		double miles = (km * 0.621371192)*100;
		int y = (int) miles;
		double miles2 = y/100;
		System.out.print("In miles2 that is " + miles2);
		
		//KM to miles 0.621371192
	}
	}
		
	
