package classDemo;

public class StaticKeyword {
	
	String Name;
	int emp_id;
	static String organization="IHS";

	public static void main(String[] args) {
		
		StaticKeyword stkey=new StaticKeyword();
		stkey.Name="Seth";
		stkey.emp_id=123;
		System.out.println(stkey.Name);
		System.out.println(stkey.emp_id);
		System.out.println(organization);
		

	}

}
