package collactions_package;

import java.util.ArrayList;

public class ListExample {

	public ListExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<>();
		al.add("hello world");
		al.add(12);
		al.add(12.3);
//		System.out.println(al);
		System.out.println(al.size());
		
		
		
		al.add(al);
		
		
		
//		System.out.println(al);
		
		for(Object i:al) {
			System.out.println(i);
		}
	}
}
