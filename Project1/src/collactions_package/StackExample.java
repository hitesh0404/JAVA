package collactions_package;

import java.util.Stack;

public class StackExample {

	public StackExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Stack<Product> products = new Stack<Product>();
		
		products.push(new Product(101,"Samsung", 1234));
		products.push(new Product(101,"Oppo", 1124));
		products.push(new Product(102,"Vivo", 1012));
		System.out.println((products.pop());
		System.out.println(products.empty());
		
		
		
		
	}
}
