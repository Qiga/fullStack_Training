package Mouse;

public class WheelMouse extends Mouse {

	// extends
	// public class 자식클래스 extends 부모클래스
	//1.좌클릭
	//2.우클릭
	//3.드래그 
	//>> 마우스로 부터 상속받는 메서드
	
	//+
	
	//4. 스크롤하기 
	public void scroll() {
		System.out.println("드르륵");
	}
	
	public void drag() {
		System.out.println("?");
	}
}
