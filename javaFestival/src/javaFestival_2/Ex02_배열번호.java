package javaFestival_2;

import java.util.Scanner;

public class Ex02_배열번호 {
	public static void main(String[] args) {
		
//		정수 N을 입력받아 N * N 배열에
//		다음과 같이 숫자를 저장하고 출력하시오. (이중 배열)
		
//		1 6 11 16 21
//		2 7 12 17 22
//		3 8 13 18 23
//		4 9 14 19 24
//		5 10 15 20 25
		
		
		//n값 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("n값 입력 : ");
		int n = sc.nextInt();
		
		int[][] array = new int[n][n];
		
		int num = 1; //num++을 활용해서 숫자 찍을 수 있음
		
		//값 부여
		for (int i=0; i<array.length; i++) {
			for (int e=0; e<array[i].length; e++) {
				array[e][i] = num++;
			}
		}
		//출력결과 확인해보기
		for (int i=0; i<array.length; i++) {
			for (int e=0; e<array[i].length; e++) {
				System.out.printf("%4s",array[i][e] + " ");
			}
			System.out.println("");
		}
		
		sc.close();
		
	}

}
