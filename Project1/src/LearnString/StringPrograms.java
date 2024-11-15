package LearnString;

import java.util.Scanner;
import java.util.UUID;

public class StringPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		
		int dot = fileName.indexOf('.');
		System.out.println("file Type: "+fileName.substring(dot+1));
		System.out.println("file Name: "+fileName.substring(0,dot));
		
		String st = UUID.randomUUID().toString();
		System.out.println(st+fileName.substring(dot));
		
	}
}
