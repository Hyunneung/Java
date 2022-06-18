// Runnable �������̽��� ���
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

// Runnable �������̽��� ����ϴ� ������ Ŭ����
class SmallLetters implements Runnable {
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
}
