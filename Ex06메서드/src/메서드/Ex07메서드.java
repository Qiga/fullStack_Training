package 메서드;

public class Ex07메서드 {
	public static void main(String[] args) {
		//2개의 양수를 받아 2개의 수 중에서 큰 수를 출력하고 동일하다면 0을 출력하시오.
		
		//main 함수 변경 금지
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1,num2);
		System.out.println("큰 수 확인 :" + result);
	}
	
	public static int largerNumber(int a, int b) {
		if (a>b) {
			return a;
		}else if (b>a) {
			return b;
		}else return 0;
	}
}
