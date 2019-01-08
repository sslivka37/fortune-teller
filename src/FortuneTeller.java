import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// first and last name
		System.out.println("Enter your first name");
		String firstName = input.nextLine();

		System.out.println("Enter your last name:");
		String lastName = input.nextLine();

		// age
		System.out.println("Enter your age in years:");
		int age = Integer.parseInt(input.nextLine());

		// birth month
		System.out.println("Enter your birth month number:");
		int month = Integer.parseInt(input.nextLine());

		// Favorite color, going to have to loop this
		String colorInput;
		do {
			System.out.println("Enter your favorite ROYGBIV color");
			System.out.println("Type \"help\" to list the ROYGBIV colors.");
			colorInput = input.nextLine();
			if (colorInput.equalsIgnoreCase("help")) {
				System.out.println("The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			}
		} while (colorInput.equalsIgnoreCase("help"));

		// number of siblings
		System.out.println("Enter your number of siblings:");
		int siblings = Integer.parseInt(input.nextLine());
		
		input.close();

		// declaring a variable to use later when going from int to string
		String vacationSiblings;
		String carColor = " ";
		int retirementYears;
		int bankBalance;

		// now conditionals for age odd/even retirement years> seems to work okay
		if (age % 2 == 1) {
			retirementYears = 30;
		} else {
			retirementYears = 100;
		}

		// now conditionals for birth month and bank balance >works okay
		switch (month) {
		case 1:
			bankBalance = 100;
			break;
		case 2:
			bankBalance = 100;
			break;
		case 3:
			bankBalance = 100;
			break;
		case 4:
			bankBalance = 100;
			break;
		case 5:
			bankBalance = 1337;
			break;
		case 6:
			bankBalance = 1337;
			break;
		case 7:
			bankBalance = 1337;
			break;
		case 8:
			bankBalance = 1337;
			break;
		case 9:
			bankBalance = 1000000;
			break;
		case 10:
			bankBalance = 1000000;
			break;
		case 11:
			bankBalance = 1000000;
			break;
		case 12:
			bankBalance = 1000000;
			break;
		default:
			bankBalance = 0;
			break;
		}

		// conditionals for siblings and vacation spot
		if (siblings < 0) {
			vacationSiblings = "Antarctica";
		} else if (siblings == 0) {
			vacationSiblings = "Hawaii";
		} else if (siblings == 1) {
			vacationSiblings = "Malibu";
		} else if (siblings == 2) {
			vacationSiblings = "London";
		} else if (siblings == 3) {
			vacationSiblings = "New Zealand";
		} else {
			vacationSiblings = "Denver";
		}
		
		//conditionals for favorite color and car driven
		if (colorInput.equalsIgnoreCase("red")) {
			carColor = "Mustang";
		} else if(colorInput.equalsIgnoreCase("orange"))	 {
			carColor = "Mercedez";
		} else if(colorInput.equalsIgnoreCase("yellow")) {
			carColor = "Subaru";
		} else if(colorInput.equalsIgnoreCase("green")) {
			carColor = "Honda";
		} else if(colorInput.equalsIgnoreCase("blue")) {
			carColor = "Toyota";
		} else if(colorInput.equalsIgnoreCase("indigo")) {
			carColor = "scooter";
		} else if(colorInput.equalsIgnoreCase("violet")) {
			carColor = "Tesla"; 	
}
		input.close();
System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years, with $" + bankBalance
				+ " in their bank account, and will have a vacation home in " + vacationSiblings + ", and will drive a " + carColor + ".");	
	}
}
