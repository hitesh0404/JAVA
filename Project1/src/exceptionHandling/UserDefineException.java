package exceptionHandling;

public class UserDefineException {

	public static void checkAge(int age) {
		if( age<18 ){
			throw new RuntimeException("Invalid Age");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=8;
		if (n<0) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("athmatic Exception Number is Negative");
			
		}
		try {
			checkAge(12);
		}
		catch(RuntimeException e) {
			System.out.println("Exception catched"+e);
		}
		finally {
			System.out.println("End");
		}
	}

}
