package animal;

public class Main {

	public static void main(String[] args) {
		
		//Animal a1= new Animal();
		
		//a1.eat();
		//a1.sleep();
		//a1.move();
		
//		Bird b1 = new Bird();
//		
//		b1.eat();
//		b1.sleep();
//		b1.move();
		
		
		Cham c1 = new Cham();
		
		c1.eat();
		c1.cry();
		
		Peng p1 = new Peng();
		
		p1.eat();
		p1.move();
		
		// - 형변환(Casting)
		// 기본 데이터 타입에 대한 형변환 : 데이터의 크기를 변환하는 기능
		// 객체타입에 대한 형변환 : 객체의 타입 변환
		// 객체 타입 형변환을 진행할때는 반드시 상속에 대한 개념이 포함되어 있어야함
		
		// 명시적 vs 묵시적
		// 업캐스팅 vs 다운캐스팅
		
		// 묵시적*자동형변환 : (업캐스팅) 
		// -> 자식 클래스가 부모 클래스의 타입으로 형태가 변형되는 것
		// (참새는 동물이다.)(펭귄은 동물이다.) 
		Animal a2 = new Peng();
		Animal a3 = new Cham();
		
		//다운캐스팅 : 부--> 자식
		Peng p3 = (Peng) a2;
	}
}
