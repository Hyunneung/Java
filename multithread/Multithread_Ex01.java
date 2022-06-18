// 1�ʸ��� �ð� ����ϴ� ������
package multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Multithread_Ex01 {

	public static void main(String[] args) {
		TimeThread dt = new TimeThread();
		dt.start();

	}
}

// ������ Ŭ����
class TimeThread extends Thread {
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a h�� m�� s��");

		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		} // while ��
	} // run ��
} // class ��
