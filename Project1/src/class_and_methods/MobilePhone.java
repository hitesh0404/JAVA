package class_and_methods;

public class MobilePhone {

	private String brand;
	private String name;
	private float price;
	private float weight;
	
	public MobilePhone() {
		// TODO Auto-generated constructor stub
	}
	

	public MobilePhone(String brand, String name, float price, float weight) {
		super();
		this.brand = brand;
		this.name= name;
		this.price = price;
		this.weight = weight;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.brand + this.name+this.price;
	
	}
	

}
