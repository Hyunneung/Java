package objectclass;

public class EqualsEx02 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(6,7);
		Rectangle r2 = new Rectangle(6,7);
		
		System.out.println(r1.equals(r2));
	}
}

class Rectangle {
	int width, height;

	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "width = " + this.width + ", height = " + this.height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle && obj != null) {
			return ((Rectangle) obj).width == this.width && ((Rectangle) obj).height == this.height;
		} else
			return false;
	}

}