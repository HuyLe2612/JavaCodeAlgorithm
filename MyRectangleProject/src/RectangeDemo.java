public class RectangeDemo {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle();
		Rectangle box2 = new Rectangle(10, 20);
		
		box1.setLength(10);
		box1.setWidth(20);
		int area = box1.getLength() * box1.getWidth();
		box1.printDimensions();
		box2.printDimensions();
		System.out.println("the area1 is: " + area);
		System.out.println("the area2 is: " + box1.getArea());
		System.out.println("the perimeter is: " + box2.getPerimeter());
		Rectangle.displayDealer();
		

	}

}
