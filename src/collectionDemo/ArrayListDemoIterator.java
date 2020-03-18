package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoIterator {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("Raghav");
		obj.add('M');
		obj.add(12341234);
		obj.add(12.123);
		//System.out.println(obj.size());
		//System.out.println(obj);
		
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			Object val=itr.next();
			System.out.println(val);
		}

	}

}
