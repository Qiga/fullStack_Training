package 메서드;

public class Ex03매o리x {

	public static void main(String[] args) {
	
		//sumPrint (1,2) -> "결과값은 3입니다." 출력
		sumPrint(1,2);
	}
	
	//메인 밖 //리턴 타입이 없으므로 void로 설정 *void를 활용하면 보통 기능 자체를 가지고 있는 경우가 많음
	public static void sumPrint(int a, int b) {
		System.out.printf("결과값은 %d입니다.\n", a+b);
	}
	//return필요 없음 -> 기능(호출기능 등)을 사용할 수 있음
}
