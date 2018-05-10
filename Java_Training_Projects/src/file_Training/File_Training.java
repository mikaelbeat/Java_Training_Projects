package file_Training;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Training {
	
	static boolean quit = false;
	
	static String filename = "C:\\Users\\petri.ryynanen\\git\\Java_Training_Projects\\Java_Training_Projects\\src\\file_Training\\dataFile.txt";
	static String something;
	static File file = new File(filename);
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
	
		int choice = 0;
		menu();
		
		while(!quit) {
			choice = reader.nextInt();
			System.out.println();
			reader.nextLine();
			System.out.println("");
			
			switch(choice) {
			case 0:
//				menu();
				break;
			case 1:
				writeToFile();
				break;
			case 2:
//				printFileContent();
				break;
			case 3:
//				deleteFileContent();
				break;
			case 4:
//				quit();
				quit = true;
			}
		}
		

	}
	
	public static void writeToFile() {
		System.out.print("Enter something to write to file: ");
		something = reader.nextLine();
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(something+"\n");
			bw.close();
		} catch (IOException e) {
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		} finally {
			System.out.println("Writed "+something+" to file");
			System.out.println("Closing file!");
		}
	}
	
	public static  void menu() {
		System.out.println
				("1 - Write password to file.\n"+
				 "2 - Check passwords valitidy in file.\n"+
				 "3 - Show password file content.\n"+
				   "4 - Quit");
	}

}
