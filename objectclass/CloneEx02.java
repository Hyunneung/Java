package objectclass;

public class CloneEx02 {

	public static void main(String[] args) {
		Rectangle2 r1 = new Rectangle2(12, 21);
		Rectangle2 r2 = r1.clone();

		System.out.println("[r1] " + r1);
		System.out.println("[r2] " + r2);

		r1.width = 55;
		r1.height = 44;

		System.out.println("== r1 변경 후 == ");
		System.out.println("[r1] " + r1);
		System.out.println("[r2] " + r2); // r2는 r1 객체가 별개로 복제된 것이므로 r1 값 변경과 무관하다.
	}

}

class Rectangle2 implements Cloneable {
	int width, height;

	Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "width = " + this.width + ", height = " + this.height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle2 && obj != null) {
			return ((Rectangle2) obj).width == this.width && ((Rectangle2) obj).height == this.height;
		} else
			return false;
	}

	public Rectangle2 clone() {
		try {
			return (Rectangle2) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
