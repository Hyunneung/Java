package objectclass;

public class ToStringEx01 {

	public static void main(String[] args) {
		GoodStock gs = new GoodStock("73527", 200);
		System.out.println("===== toStirng() 생략 =====\n" + gs);
		System.out.println("\n===== toStirng() 호출 =====\n" + gs.toString());
	}

}

class GoodStock {
	String goodsCode;  // 상품코드
	int stockNum;  // 재고수량

	GoodStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	@Override
	public String toString() {
		return "상품코드: " + this.goodsCode + ", 재고수량: " + this.stockNum;
	}
}
