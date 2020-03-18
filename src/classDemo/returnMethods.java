package classDemo;

public class returnMethods {
	
	public int sum(int x , int y) {
		int j=x+y;
		return j;
	}

	public static void main(String[] args) {
		returnMethods rtm=new returnMethods();
		int m=rtm.sum(10, 20);
		System.out.println(m);
		

	}

}
