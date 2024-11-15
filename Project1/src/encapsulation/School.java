package encapsulation;

public class School {
	
	private int schoolId;
	private String schoolName;
	
	
	public void setId(int schoolId) {
		if (schoolId>0) {
			this.schoolId = schoolId;
		}
		else {
			System.out.println("Negative Value is not Allowed");
		}
		
	}
	public int getId() {
		return this.schoolId;
	}

	
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public School() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
