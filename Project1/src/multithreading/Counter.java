package multithreading;

public class Counter {

	public int count =0;
	
 synchronized void increment() {
		this.count++;
	}

}
