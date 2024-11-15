package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void demo () throws FileNotFoundException {
		new FileInputStream("abc.txt");
		
	}
	
	
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
