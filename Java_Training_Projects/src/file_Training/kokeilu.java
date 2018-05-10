package file_Training;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kokeilu {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\petri.ryynanen\\eclipse-workspace\\PassingTime\\src\\dataFile.txt";
		String something;
		File file = new File(filename);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		something = sc.nextLine();
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(something);
			fw.close();
		} catch (IOException e) {
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		} finally {
			System.out.println("Writed "+something+" to file");
			System.out.println("Closing file!");
		}
		
		System.out.print(something);

	}

}
