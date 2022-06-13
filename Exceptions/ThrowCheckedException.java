package ExceptionsPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {

	static void file() throws FileNotFoundException {
		FileReader FR = new FileReader("TextFile.txt");
		BufferedReader BR = new BufferedReader(FR);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			file();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e);
		}
	}

}
