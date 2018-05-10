package scanner_Training;

import java.util.Scanner;

import pizza_Order.ScannerFunctions;

public class ScannerSmall {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			boolean quit = false;
			int choice = 0;
			viewMenu();
			ScannerFunctions.addBasedataToArray();
			while(!quit){
				System.out.println("");
				System.out.print("Choose option: ");
				choice = reader.nextInt();
				reader.nextLine();
				System.out.println("");
				
				switch(choice){
				case 0:
					viewMenu();
					break;
				case 1:
					askToTypeSomething();
					break;
				case 2:
					addStringToArray();
					break;
				case 3:
					ScannerFunctions.showTextArrayContent();
					break;
				case 4:
					removeStringFromArray();
					break;
				case 5:
					System.out.println("Quitting application.");
					quit = true;
					break;
				}
			}
	}
	
	public static void viewMenu(){
		System.out.println("0 - to view options menu.\n"+
				 		 "1 - to try type something.\n"+
				 		 "2 - to add string to table.\n"+
				 		 "3 - show text array content.\n"+
				 		 "4 - remove string from text array.\n"+
				 		 "5 - to quit application"
				);
	}
	
	public static void askToTypeSomething(){
		System.out.print("Type something: ");
		String something = reader.nextLine();
		System.out.println("");
		ScannerFunctions.stringTyper(something);
	}
	
	public static void addStringToArray() {
		System.out.print("Add text to array: ");
		String text = reader.nextLine();
		System.out.println("");
		ScannerFunctions.stringToArray(text);
		
	}
	
	public static void removeStringFromArray() {
		System.out.println("Entries in array");
		ScannerFunctions.showTextArrayContent();
		System.out.print("Remove entry from array: ");
		String text = reader.nextLine();
		System.out.println("");
		ScannerFunctions.removeStringFromArray(text);
	}


}
