package collectionframework;

import java.util.Stack;

public class List_Vector_Stack_Ex01 {

	public static void main(String[] args) {
		Stack<String> bp = new Stack<String>();

		System.out.println("�������? " + bp.empty() + "\n");

		bp.push("����");
		bp.push("����");
		bp.push("����");
		bp.push("����");

		while (!(bp.empty())) {

			System.out.println("�� ���� �������� �� : " + bp.size() + "");
			System.out.println("�� ������ �����ʹ� <" + bp.pop() + "> �Դϴ�");
			System.out.println("�� ���� �������� �� : " + bp.size());
			System.out.println("�������? " + bp.empty() + "\n");
		}
	}
}
