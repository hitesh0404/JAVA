class Emp{
	
	private int id;
	private String name;

	public Emp(int id,String name){
		this.id = id;
		this.name = name;
	
	}
	public String getEmpData(){
		return "id:"+id + " name:" +name;
	}
}
class First{
	public static void main(String[] args) {
        	
        	Emp e1 = new Emp(1,"Raj");
		System.out.println(e1.getEmpData());
    }

}