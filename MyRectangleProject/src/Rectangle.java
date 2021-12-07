
public class Rectangle {
	private int length;
	private int width;
	private int countNum;
	// default constructor
	private static int count = 1000 ;
	public Rectangle() {
		count--;
		this.length = 0;
		this.width = 0;
		this.countNum = count;
	}
	//overloaded constructor that length and width
	
	public Rectangle(int length, int width) {
		count--;
		this.length = length;
		this.width = width;
		this.countNum = count;
	}
	
	public static void displayDealer() {
		System.out.println("count is: " + count);
	}
	//Accessor
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	
	// Mutator
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		int area = length * width;
		return area;
	}
	
	public int getPerimeter() {
		int per = (length + width) * 2;
		return per;
	}
	
	public void printDimensions() {
		System.out.println("The length is: " + length);
		System.out.println("The Width is: " + width);
		System.out.println("Count number is: " + countNum);
	}
	
}
