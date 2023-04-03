package javaFestival_2;

import java.util.Scanner;

public class Ex13_대시문자 {

	public static void main(String[] args) {
//		그림과 같이 대시(‘_’)문자로 구성된 형태의 숫자를
//		주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
//		대시의 개수를 출력하는 프로그램을 작성하라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 수를 입력해주세요 >> ");
		String in = sc.next();
		
		char[] arr = new char[in.length()];
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=in.charAt(i);
			switch(arr[i]) {
			case '0': sum += 6; break;
			case '1': sum += 2; break;
			case '2': sum += 5; break;
			case '3': sum += 5; break;
			case '4': sum += 4; break;
			case '5': sum += 5; break;
			case '6': sum += 6; break;
			case '7': sum += 3; break;
			case '8': sum += 7; break;
			case '9': sum += 6; break;			
			}
		}
		
		System.out.print("대시의 총합 : " + sum);
		
		sc.close();

	}

}
