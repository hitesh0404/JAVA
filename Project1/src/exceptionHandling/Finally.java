package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		System.out.println("Hello");
		try {
			System.out.println(a[12]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handling");
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Code After Exception");
	}
}
