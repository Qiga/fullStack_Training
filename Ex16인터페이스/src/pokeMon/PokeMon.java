package pokeMon;

public interface PokeMon {

	//PokeMon : 게임 캐릭터가 꼭 가져야할 기능들을 설계
	
	//인터페이스
	// 반드시 바디가 없는 메서드만 가지고 있어야 함. (추상메스드만 가지고 있음)
	// --> 진짜 설계도, 작업 명세서, 프로젝트 설계도와 같은 역할 
	
	// 필드는 상수형태의 필드만 존재할 수 있음
	// => 절대로 변하지 않을 값들만 필드로 넣어주자
	
	// 추상 클래스 : 개발자가 원하는대로 메서드를 만들고 구현하세요
	// 인터페이스 -> 개발자는 우리가 제공한대로 만드세요
	
	
	//atk() -> 공격
	public abstract void atk();
	
	//specialatk() -> 특수공격
	public abstract void specialAtk();
	
	
}
