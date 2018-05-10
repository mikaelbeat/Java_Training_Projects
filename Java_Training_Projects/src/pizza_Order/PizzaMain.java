package pizza_Order;

import java.util.Scanner;

public class PizzaMain {
	
	static Scanner reader = new Scanner(System.in);
	
	static boolean quit = false;

	public static void main(String[] args) {
		System.out.println("*** Pizza order ***");
		System.out.println("Order includes base pizza which can also be upgraded with extra toppings.");
		System.out.println("For sending order at least pizza size is needed to be chosen.");
		int choice = 0;
		viewPizzaMenu();
		
		while(!quit) {
			choice = reader.nextInt();
			System.out.println();
			reader.nextLine();
			System.out.println("");
			
			switch(choice) {
			case 0:
				viewPizzaMenu();
				break;
			case 1:
				choosePizzaSize();
				break;
			case 2:
				extraCheese();
				break;
			case 3:
				addSalami();
				break;
			case 4:
				addSpecial();
				break;
			case 5:
				chooseOregano();
				break;
			case 6:
				sendOrder();
				break;
			case 7:
				quit = true;
			}
		}
	}
	
	public static void viewPizzaMenu() {
		System.out.println("");
		System.out.println("1 - Choose pizza size.\n"+
						   "2 - Add extra cheese to pizza.\n"+
						   "3 - Add salami as second extra topping.\n"+
						   "4 - Add special as third extra topping.\n"+
						   "5 - Choose oregano.\n"+
						   "6 - Send order.\n");
		System.out.print("Enter selection number: ");
	}
	
	public static void choosePizzaSize() {
		PizzaOrder.selectPizzaSize();
		System.out.println("");
		viewPizzaMenu();
	}
	
	public static void extraCheese() {
		PizzaOrder.extraCheese();
		viewPizzaMenu();
	}
	
	public static void addSalami() {
		PizzaOrder.addSalami();
		viewPizzaMenu();
	}
	
	public static void addSpecial() {
		PizzaOrder.addSpecial();
		viewPizzaMenu();
	}
	
	public static void chooseOregano() {
		PizzaOrder.selectOregano();
		viewPizzaMenu();
	}
	
	public static void sendOrder() {
		PizzaOrder.orderPizza();
	}
	
	public static void quit() {
		quit = true;
	}
}