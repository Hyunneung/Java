package objectclass;

public class ToStringEx01 {

	public static void main(String[] args) {
		GoodStock gs = new GoodStock("73527", 200);
		System.out.println("===== toStirng() ���� =====\n" + gs);
		System.out.println("\n===== toStirng() ȣ�� =====\n" + gs.toString());
	}

}

class GoodStock {
	String goodsCode;  // ��ǰ�ڵ�
	int stockNum;  // ������

	GoodStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	@Override
	public String toString() {
		return "��ǰ�ڵ�: " + this.goodsCode + ", ������: " + this.stockNum;
	}
}
