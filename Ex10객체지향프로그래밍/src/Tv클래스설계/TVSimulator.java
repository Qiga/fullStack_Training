package Tv클래스설계;

public class TVSimulator {

	public static void main(String[] args) {
		
		//tv 객체 (object) 생성
		
		// 데이터 타입 변수명 = 데이터 타입 ();
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		
		tv1.브랜드이름="Samsung";
		tv2.브랜드이름 = "LG";
		
		tv1.채널변경하기(30);
		tv1.채널내리기();
		
		
		System.out.println(tv1.채널);
	}
	
}
