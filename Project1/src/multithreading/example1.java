package multithreading;

class T1 extends Thread{
	public void run() {
		
		for (int i =1; i <10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class T2 extends Thread{
	public void run() {
		System.out.println("hello");
		for (int i = 1; i <10; i++) {
			System.out.println("Hello"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class example1 {

	public example1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1  t1= new T1();
		t1.start();
		T2  t2= new T2();
		t2.start();
		
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main");
		
	}

}
