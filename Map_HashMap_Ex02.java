// ���� �Է� �޾� �ִ�, �ּڰ� ���ϱ�
package collectionframework;

import java.util.HashMap;
import java.util.Scanner;

public class Map_HashMap_Ex02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		System.out.println(max_min(map));
	}

	static HashMap<String, Integer> max_min(HashMap<String, Integer> map) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		System.out.println("���� 5���� �Է��ϼ���>");
		for (int i = 0; i < num.length; i++) { // ���� ���� 5�� �Է�
			num[i] = sc.nextInt();
		}

		int max = num[0];
		int min = num[0];

		for (int i = 1; i < num.length; i++) {
			max = max > num[i] ? max : num[i];
			min = min < num[i] ? min : num[i];
		}

		map.put("max", max);
		map.put("min", min);

		sc.close();
		return map;
	}
}
