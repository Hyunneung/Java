// 로또 번호 6개 구하시오 (로또 번호의 범위는 1~45)
package collectionframework;

import java.util.HashSet;

public class Set_HashSet_Ex02 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() != 6) {
			set.add((int) (Math.random() * 45 + 1));
		}

		System.out.println("이번 주 로또번호는 " + set + " 입니다.");

	}

}
