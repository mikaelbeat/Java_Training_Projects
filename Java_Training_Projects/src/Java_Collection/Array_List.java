package Java_Collection;

import java.util.ArrayList;

public class Array_List {
	
	public static void main(String[] args) {
		
		// ArrayList fast for retrieval but slow for manipulation
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("World");
		words.remove(0);
		
		String item1 = words.get(0);
		String item2 = words.get(1);
		
	}

}