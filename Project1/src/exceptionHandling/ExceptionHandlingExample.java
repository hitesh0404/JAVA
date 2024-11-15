package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
