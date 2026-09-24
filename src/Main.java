import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("  The Dazzle!  \n\n");
		System.out.println("=====  restrauant menu =====");
		System.out.println("how many pasteries would you like");
		int pastries = in.nextInt();
		String[] pasteries = { "cream puffs", "sausage rolls" };
		System.out.println("/n/  cinnamon rolls  ++tota l$8    /n/");
		System.out.println("/n/ cream puffs ++total     $12    /n/");
		System.out.println("/n/ sausage ++total        $10    /n/");
		int total = in.nextInt();
		int discount = in.nextInt();
		System.out.println("Enter your choice");
		int choice = in.nextInt();
		if (choice >= 1 && choice <= 5) {
			System.out.println("enter quantity");
			int quantity = in.nextInt();
			switch (choice) {
			case 1:
				total = total + (8 * quantity);
				break;
			case 2:
				total = total + (12 * quantity);
				break;
			case 3:
				total = total + (10 * quantity);
				System.out.println("the item is added!");
				if (total > 30) {
					discount = total * 10 / 100;
				} else if (total < 50) {
					discount = total * 20 / 100;
				} else {
					discount = 0;
					double finalbill = total - discount;
					System.out.println("=====  the bill =====");
					System.out.println("total:$" + total);
					System.out.println("discount: $" + discount);
					System.out.println("Amount to pay: $" + finalbill);

				}
			}

		}

	}

}
