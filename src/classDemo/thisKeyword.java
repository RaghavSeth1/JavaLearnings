package classDemo;

public class thisKeyword {
	
	private int height;
	private int width;
	
	/*
	 * public thisKeyword(int height,int width) { this.height=height;
	 * this.width=width;
	 * 
	 * }
	 */
	public int area(int height, int width) {
		height=height;
		width=width;
		return height*width;
	}
	
	public static void main(String args[]) {
		
		thisKeyword thisk = new thisKeyword();
		int area=thisk.area(10, 30);
		System.out.println(area);
		
		
	}

}
