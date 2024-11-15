package collactions_package;

import java.util.LinkedList;

public class QueueExample2 {

	public QueueExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>  numbers  = new LinkedList<Integer>();
		for (int i = 0; i < 29; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		System.out.println(numbers);
		System.out.println(numbers.pollLast());
		System.out.println(numbers.peekFirst());
		System.out.println(numbers.peekLast());
		System.out.println(numbers.size());
		
		
		
	}

}
