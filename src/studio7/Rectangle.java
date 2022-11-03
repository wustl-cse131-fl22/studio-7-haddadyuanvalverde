package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int l, int w) {
		length =l;
		width = w;
	}
	
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*length+2*width;
	}
	
	public void setLength(int l) {
		length=l;
	}
	
	public int getLength() {
		return length;
	}
	public boolean isSquare() {
		return length==width;
	}
	public boolean isLarger(Rectangle other) {
		return this.area() > other.area();
	}
		
}
