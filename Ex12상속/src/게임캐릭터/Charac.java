package 게임캐릭터;

public abstract class Charac {

	//전진
	public abstract void run();
	
	//점프
	public abstract void jump();
	
	//공격
	public abstract void atk();
	
	//추상메서드는 모든 캐리터가 가져야 하는 기능이기 떄문
	//부모를 물려받는 자식클래스에 구현을 강제화 시킬 수 있다는 장점
}
