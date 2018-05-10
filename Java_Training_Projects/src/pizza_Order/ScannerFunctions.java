package pizza_Order;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerFunctions {
	
	private static ArrayList<String> textArray = new ArrayList<String>();
	
	public static void stringTyper(String something){
		System.out.println("You typed: " + something);
	}
	
	public static void stringToArray(String text) {
		textArray.add(text);
		System.out.println(text+" added to array.");
		
	}
	
	public static void  showTextArrayContent() {
		for(int i=0; i<textArray.size(); i++) {
			System.out.println("In position "+(1+i)+" is "+textArray.get(i));
		}
		System.out.println("");
	}
	
	public static void removeStringFromArray(String text) {
		textArray.remove(text);
		System.out.println(text+" removed from array.");

	}
	
	public static void addBasedataToArray() {
		textArray.add("Cat");
		textArray.add("Monkey");
	}

}


