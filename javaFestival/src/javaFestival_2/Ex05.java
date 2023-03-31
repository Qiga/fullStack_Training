package javaFestival_2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 숫자 10개를 입력 받아 3의 배수인 숫자를
		// 출력하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		//길이 설정, 출력문 초기화
		int len = 10;
		String output = "";
		
		//반복 입력 받기
		for (int i=1; i<=len; i++) {
			System.out.print(i + "번 째 정수 입력>> ");
			int a = sc.nextInt();
			//3의 배수 확인하고 true일시 출력문에 추가하기
			if(a>=3 && a%3==0) {
				output += a +" ";
			}
		}
		
		//출력문 출력하기
		System.out.print("3의 배수 : " + output);
		
		sc.close();
		
	}

}
