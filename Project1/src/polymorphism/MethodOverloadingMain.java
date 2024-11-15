package polymorphism;

public class MethodOverloadingMain {

	public MethodOverloadingMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(2,2));
		System.out.println(calculator.add(2,2,4));
		//System.out.println(calculator.add(2,2,4.f));
	}

}
