package javaFestival_3;

public class Ex04 {

	public static void main(String[] args) {

//		2개의 정수 base, n을 받아 base의 n제곱 만큼
//		값을 반환하는 powerN() 메소드를 작성하세요
		
		// Math.pow( , ) : 제곱해주는 기본 메서드 >> 사용하지 말 것
		
		System.out.println(powerN(2, 3));

	}
	
	public static long powerN(int a, int b) {
		int total = 1;
		for (int i=1; i<=b; i++) {
			total *= a;
		}
		return total;
	}

}
