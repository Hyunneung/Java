// DeepCopy
package objectclass;

public class CloneEx03_DeepCopy {

	public static void main(String[] args) {
		Circle2 c1 = new Circle2(new Point(1, 1), 1);
		Circle2 c2 = c1.clone();

		System.out.println("[c1] " + c1);
		System.out.println("[c2] " + c2);

		c1.p.x = 5;
		c1.p.y = 5;
		c1.r = 5;

		System.out.println("== c1 ���� �� == ");
		System.out.println("[c1] " + c1);
		System.out.println("[c2] " + c2);
	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}

class Circle2 implements Cloneable {
	Point p;
	double r;

	Circle2(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "[p=" + this.p + ", r=" + this.r + "]";
	}

	@Override
	public Circle2 clone() {
		try {
			Circle2 c = (Circle2) super.clone(); // clone()���� �⺻�� �ʵ常 ������ Circle2 ��ü ����
			c.p = new Point(this.p.x, this.p.y); // ������ ��ü�� ������ �ʵ� ��ü ���� ����
			return c;

		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
