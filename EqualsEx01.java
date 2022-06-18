package objectclass;

public class EqualsEx01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);

		System.out.println(c1.equals(c2));
	}
}

class Circle {
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "radius = " + this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Circle) {
			Circle c = (Circle) obj;
			return c.radius == this.radius;
		} else
			return false;
	}
}
