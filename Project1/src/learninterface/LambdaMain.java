package learninterface;

public class LambdaMain {

	public LambdaMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq =(num)->num*num;
		System.out.println(sq.square(2));

		nameLength l =(str)->str.length();
		System.out.println(l.length_of_str("hello world"));
		
		Add add=(a,b)->a+b;
		System.out.println(add.addition(1,2));
	}

	
	
	
}
