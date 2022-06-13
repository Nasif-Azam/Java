package ExceptionsPractice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Nasif.txt");
			System.out.println("File is: " + fr);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
