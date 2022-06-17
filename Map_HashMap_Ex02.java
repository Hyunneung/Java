// 정수 입력 받아 최댓값, 최솟값 구하기
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

		System.out.println("정수 5개를 입력하세요>");
		for (int i = 0; i < num.length; i++) { // 비교할 숫자 5번 입력
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
