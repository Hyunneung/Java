// �͸� Ŭ����

package multithread;

public class Multithread_Ex03 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				} // for ��
			} // run ��
		}); // �͸� Ŭ���� ��ü ����, ����

		th.start();

		char arr[] = { '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��' };

		for (char ch : arr) {
			System.out.print(ch);
		}
	}
}
