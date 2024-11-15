package exceptionHandling;

import java.util.Scanner;

public class MainExample {

	public MainExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int a =0;
		try {
			a= sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("invalid input");
		}
		System.out.println(a);
		System.out.println("hello");
		
		
		
		String name = null;
		try {
			System.out.println(name.length());
			System.out.println(2/0);
			
			
		}
		catch (NullPointerException e) {
			System.out.println("String is null");
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		sc.close();
		
		
		
	}

}
