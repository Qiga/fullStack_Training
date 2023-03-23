
public class Ex09Switch문 {

	public static void main(String[] args) {

		int num = 40;

		// num이 20이면 "20"출력 30이면 "30"출력
		// 나머지 값은 "다른수"출력

		// switch(식 또는 값)
		switch (num) {
		case 20:
			System.out.println("20");
			break; // switch문을 멈추고 다음 문장을 실행하도록 하는 명령어
		case 30:
			System.out.println("30");
			break;
		default:
			System.out.println("다른 수");
		}

	}

}
