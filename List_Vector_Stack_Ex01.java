package collectionframework;

import java.util.Stack;

public class List_Vector_Stack_Ex01 {

	public static void main(String[] args) {
		Stack<String> bp = new Stack<String>();

		System.out.println("비었나요? " + bp.empty() + "\n");

		bp.push("제니");
		bp.push("지수");
		bp.push("로제");
		bp.push("리사");

		while (!(bp.empty())) {

			System.out.println("▶ 현재 데이터의 수 : " + bp.size() + "");
			System.out.println("▶ 마지막 데이터는 <" + bp.pop() + "> 입니다");
			System.out.println("▶ 남은 데이터의 수 : " + bp.size());
			System.out.println("비었나요? " + bp.empty() + "\n");
		}
	}
}
