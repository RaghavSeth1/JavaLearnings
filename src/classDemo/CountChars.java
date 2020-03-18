package classDemo;

import java.util.HashMap;

public class CountChars {
	
	public void countCharHavingMaxCount() {
		String demo="raghav";
		char[] demoChar=demo.toCharArray();
		HashMap<Character, Integer> charCountHash=new HashMap<Character, Integer>();
		int count=1;
		
		for(int i=0;i<demoChar.length;i++) {
		if(charCountHash.containsKey(demo.charAt(i))) {
			charCountHash.put(demoChar[i], charCountHash.get(demoChar[i])+1);			
			
		}
		else {
			charCountHash.put(demoChar[i], 1);
		}
		}	
		System.out.println(charCountHash);
		
	}
	public void firstRepeatingChar() {
		
	}
	

	public static void main(String[] args) {
		CountChars cChar=new CountChars();
		cChar.countCharHavingMaxCount();
		

	}

}
