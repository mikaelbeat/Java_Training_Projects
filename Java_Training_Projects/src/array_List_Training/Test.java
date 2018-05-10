package array_List_Training;

import java.util.Scanner;

public class Test {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		testFunctions.addMovies();
		testFunctions.addNames();
		menu();
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("\nShutting down...");
				quit = true;
				break;
			case 1:
				menu();
				break;
			case 2:
				addNames();
				break;
			case 3:
				testFunctions.getNames();
				break;
			case 4:
				removeName();
				break;
			case 5:
				testFunctions.getMovies();
				break;
			case 6:
				addMovie();
				break;
			case 7:
				removeMovie();
				break;
			case 8:
				testFunctions.allNames();
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("Actions:\n" 
				+ "0 - quit\n" 
				+ "1 - menu\n" 
				+ "2 - add name\n"
				+ "3 - list of names\n"
				+ "4 - remove name\n"
				+ "===== Linked list actions =====\n"
				+ "5 - list of movies to watch\n"
				+ "6 - add movie to list\n"
				+ "7 - remove movie\n"
				+ "8 - all names using method without for loop.");
	}

	public static void addNames() {
		System.out.print("Enter name to add: ");
		String name = scanner.nextLine();
		testFunctions.addName(name);
	}
	
	public static void removeName(){
		System.out.print("Enter name to be removed: ");
		String name = scanner.nextLine();
		testFunctions.removeName(name);
	}
	
	public static void addMovie(){
		System.out.println("Enter movie to add: ");
		String movie = scanner.nextLine();
		testFunctions.addNewMovie(movie);
	}
	
	public static void removeMovie(){
		System.out.println("Enter movie to be removed: ");
		String movie = scanner.nextLine();
		testFunctions.removeMovie(movie);
	}

}
