// 익명 클래스

package multithread;

public class Multithread_Ex03 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				} // for 끝
			} // run 끝
		}); // 익명 클래스 객체 생성, 구현

		th.start();

		char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };

		for (char ch : arr) {
			System.out.print(ch);
		}
	}
}
