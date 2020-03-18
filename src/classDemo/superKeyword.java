package classDemo;

public class superKeyword {
	int x=30;
	
	public superKeyword() {
		System.out.println("super class constructor");
	}
	
	public void display() {
		System.out.println("display from parent");
	}

	public static void main(String[] args) {	
		Mychild mchild= new Mychild();
		mchild.display();

	}
}

class Mychild extends superKeyword{	
	int x=20;
	
	public Mychild() {
		//super();
	}
	public void display() {
		
		System.out.println("display from Child");
		super.display();
		System.out.println(super.x);
		
	}
}
