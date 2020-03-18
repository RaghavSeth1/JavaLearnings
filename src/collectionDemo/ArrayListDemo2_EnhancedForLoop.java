package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2_EnhancedForLoop {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("Raghav");
		obj.add('M');
		obj.add(12341234);
		obj.add(12.123);
		//System.out.println(obj.size());
		//System.out.println(obj);
		
		for(Object obje:obj) {
			System.out.println(obje);
			
		}

	}

}
