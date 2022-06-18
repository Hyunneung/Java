// Runnable 인터페이스를 상속
package multithread;

public class Multithread_Ex02 {

	public static void main(String[] args) {
		SmallLetters sl = new SmallLetters();
		Thread th = new Thread(sl);
		th.start();

		for (int i = 1; i <= 8; i++) {
			System.out.println(i);
		}
	}
}

// Runnable 인터페이스를 상속하는 스레드 클래스
class SmallLetters implements Runnable {
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
}
