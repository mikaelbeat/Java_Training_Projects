package array_List_Training;

import java.util.ArrayList;
import java.util.LinkedList;

public class testFunctions {
	
	private static ArrayList<String> names =  new ArrayList<String>();
	
	private static LinkedList<String> movies = new LinkedList<String>();
	
	testFunctions(ArrayList<String> names, LinkedList<String> movies){
		this.names = new ArrayList(names);
		this.movies = new LinkedList(movies);
	}
	
	public static void allNames(){
		for(String  i : names){
			System.out.println(i);
		}
	}
	
	public static void addNames(){
		names.add("Dog");
		names.add("Cat");
		names.add("Lizard");
	}
	
	public static ArrayList<String> getNames(){
		for(int i=0; i<names.size(); i++){
			System.out.println("Position: "+(1+i)+" is name: "+names.get(i));
		}
		return names;
	}
	
	public static void addName(String name){
		names.add(name);
		System.out.println("Name: "+name+" added." );
	}
	
	public static void removeName(String name){
		names.remove(name);
		System.out.println("Name: "+name+" removed.");
	}
	
	public void checkName(String name){
		
	}
	
	public static LinkedList<String> getMovies(){
		for(int i=0; i<movies.size(); i++){
			System.out.println("Position: "+(1+i)+" is movie: "+movies.get(i));
		}
		return movies;
	}
	
	public static void addMovies(){
		movies.add("Jaws");
		movies.add("Star Wars");
		movies.add("Alien");
	}
	
	public static void addNewMovie(String movie){
		movies.add(movie);
		System.out.println("Movie: "+movie+" added.");
	}
	
	public static void removeMovie(String movie){
		movies.remove(movie);
		System.out.println("Movie: "+movie+" removed.");
	}

}
