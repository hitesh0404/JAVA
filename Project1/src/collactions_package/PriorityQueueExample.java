package collactions_package;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public PriorityQueueExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> priorityQueue= new PriorityQueue<Integer>();
		priorityQueue.add(12);
		priorityQueue.add(15);
		priorityQueue.add(10);
		priorityQueue.add(16);
		priorityQueue.add(9);
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		
		
		
		
		
		
		
		PriorityQueue<Product> pQProducts= new PriorityQueue<Product>(
				(p1,p2)->p2.getPrice()-p1.getPrice());
		pQProducts.add(new Product(101,"Samsung", 1234));
		pQProducts.add(new Product(101,"Oppo", 1124));
		pQProducts.add(new Product(102,"Vivo", 1412));
		System.out.println(pQProducts);
		System.out.println(pQProducts.peek());
		
		
		
	}

}
