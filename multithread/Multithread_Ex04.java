// �͸� Ŭ����
// ���� �ð����� 1�ʾ� ����ϴ� ���α׷� 

package multithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Multithread_Ex04 {

	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
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
		}); // �͸� Ŭ���� ��ü ���� �� ���� ��
		
		th.start();
	}
}
