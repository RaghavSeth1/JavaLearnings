package pack1;

public class pack_class {
	
	private String college= "CollegeMy";
	public static void display() {
		System.out.println("display from class1 package1");
	}

	public static void main(String[] args) {
		
		pack_class pc=new pack_class();
		System.out.println(pc.getCollege());
		

	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

}
