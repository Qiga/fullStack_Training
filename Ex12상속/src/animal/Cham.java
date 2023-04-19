package animal;

public class Cham extends Bird {
	
	//추상메서드 /클래스의 특징
	// 설계되어있는 추상메서드의 구현을 강제화
	

	public void eat() {
		System.out.println("먹다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}

	public void cry(){
		System.out.println("짹");
	}
}
