package boxing;

import java.util.function.Consumer;
import java.util.function.Predicate;


class Student{
	private String name;
	private int roll_num;
	public String collage="My_cl";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	
	
}

public class Box2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> checkLenght=(name)->name.length()>5;
		Product p1 = new Product("Samsung",100.10f);
		Consumer<Product> discountPrice =(p)->System.out.println(p.getPrice()*.8);
		
		discountPrice.accept(p1);
		
		Consumer<Product> printDetails =(p)->{System.out.println(p.getName());System.out.println(p.getPrice());};
		printDetails.accept(p1);
		
		
		Student s1 = new Student();
		s1.setName("hello");
		System.out.println(s1.getName());
		
		
	}
	
	
	

	
	

}
