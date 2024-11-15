package learninterface;



interface Mobile{
	void details();
	void warranty();
	void capturePicture();
}

class OPPO implements Mobile{
	public void details() {
	System.out.println("OPPO details");	
	}
	public void warranty() {
		System.out.println("OPPO warrenty");
	}
	public void capturePicture() {
		System.out.println("OPPO Taking Picture");
	}
	
}

class Moto implements Mobile{
	public void details() {
		System.out.println("Moto details");	
		}
		public void warranty() {
			System.out.println("Moto warrenty");
		}
		public void capturePicture() {
			System.out.println("Moto Taking Picture");
		}
}

public class Example {

	
	public Example() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OPPO oppo = new OPPO();
		oppo.details();
		oppo.warranty();
		
		
		Moto moto = new Moto();
		moto.details();
		moto.warranty();
		
		
		Mobile mobile = new OPPO();//Moto();
		mobile.details();
		mobile.warranty();
		mobile.capturePicture();
		
		
	}

}
