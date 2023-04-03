package javaFestival_2;

import java.util.Scanner;

public class Ex14_곱셈순서 {

	public static void main(String[] args) {
		// (세 자리 수) * (세 자리 수)는 다음과 같이 계산된다.
//		<결과화면>
//		(1), (2)번을 입력 받아 결과 화면처럼 (3), (4), (5), (6)번을 출
//		력하는 프로그램을 작성하시오
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int first =sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int second = sc.nextInt();
		
		System.out.println(first*(second%10));
		System.out.println(first*(second/10%10));
		System.out.println(first*(second/100));
		System.out.println(first*second);
		
		sc.close();
	}

}
