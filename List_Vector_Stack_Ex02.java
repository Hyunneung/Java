// ���� �˻� ���α׷�
package collectionframework;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class List_Vector_Stack_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���> ");
		String expression = sc.nextLine();
		Stack<String> check = new Stack<String>();

		try {
			for (int i = 0; i < expression.length(); i++) {
				if (expression.charAt(i) == '(') {
					check.push("");
				} else if (expression.charAt(i) == ')') {
					check.pop();
				}
			}

			if (check.isEmpty()) {
				System.out.println("�ùٸ� �����Դϴ�.");
			} else {
				System.out.println("�ùٸ� ������ �ƴմϴ�.");
			}

		} catch (EmptyStackException e) {
			System.err.println(e.getMessage());
		}

		sc.close();
	}
}
