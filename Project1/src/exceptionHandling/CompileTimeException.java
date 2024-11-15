package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) {
		System.out.println("File Input Stream Class");
		try {
		new FileInputStream("abc.txt");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found");
		}
	}

}
