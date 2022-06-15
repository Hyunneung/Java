// 수식 검사 프로그램
package collectionframework;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class List_Vector_Stack_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수식을 입력헤주세요> ");
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
				System.out.println("올바른 수식입니다.");
			} else {
				System.out.println("올바른 수식이 아닙니다.");
			}

		} catch (EmptyStackException e) {
			System.err.println(e.getMessage());
		}

		sc.close();
	}
}
