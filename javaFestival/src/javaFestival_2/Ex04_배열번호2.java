package javaFestival_2;

import java.util.Scanner;

public class Ex04_배열번호2 {
	public static void main(String[] args) {
		
	//정수 N을 입력받아
	//N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
	
//	1 2 3 4 5
//	10 9 8 7 6
//	11 12 13 14 15
//	20 19 18 17 16
//	21 22 23 24 25
	
	Scanner sc = new Scanner(System.in);
	System.out.print("n값 입력 : ");
	int n = sc.nextInt();
	
	int[][] array = new int[n][n];
	
	//홀수줄 값 부여
	for (int i=0; i<array.length; i+=2) {
		for (int e=0; e<array[i].length; e++) {
			array[i][e] = (i*n)+(e+1);
		}
	}
	//짝수줄 값 부여
	for (int i=1; i<array.length; i+=2) {
		for (int e=0; e<array[i].length; e++) {
			array[i][n-1-e] = (i*n)+(e+1);
		}
	}
	//출력결과 확인해보기
	for (int i=0; i<array.length; i++) {
		for (int e=0; e<array[i].length; e++) {
			System.out.print(array[i][e] + " ");
		}
		System.out.println("");
	}
	
	sc.close();
}
}
