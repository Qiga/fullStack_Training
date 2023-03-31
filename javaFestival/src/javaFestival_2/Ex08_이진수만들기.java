package javaFestival_2;

import java.util.Scanner;

public class Ex08_이진수만들기 {

	public static void main(String[] args) {
		
//		10진수 정수를 입력받아
//		2진수로 변환해서 출력하시오.
		
		//2진수 배열
		
		int[] two = new int[32];
		int twozins = 1;
		
		//2차원 배열 생성하기 (int 한계까지)
		for (int i=0; i<32; i++) {
			two[i] = twozins;
			twozins *= 2;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수 입력 >> ");
		int ten_num = sc.nextInt();
		int over_zins = 0;

		//2진수 최대 자리수 찾기
		for (int i=0; i<32; i++) {
			if (ten_num<two[i]) {
				over_zins = i;
				break;
			}
		}
		
		System.out.println(over_zins);
		//2진수 작성하기
		String sTwo = "";
		
		//입력한 수가 0인 경우 0으로 출력
		if (ten_num==0) {
			sTwo += "0";
		}
		//맨 앞자리부터 수 추가하기
		for (int i=over_zins-1; i>=0; i--) {
			if(ten_num/two[i]>=1) {
				ten_num -= two[i];
				sTwo = sTwo+ "1";
			}else {
				sTwo = sTwo+ "0";
			}
		}
		System.out.println(sTwo);

		//	System.out.println(Integer.toBinaryString(10진수 값)); 2진수로 변환해주는 메서드

		sc.close();
	}

}
