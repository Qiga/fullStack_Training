package javaFestival_2;

import java.util.Scanner;

public class Ex12_입력과비교 {

	public static void main(String[] args) {
		// N과 X를 입력 받는다.
//		• N개의 정수를 입력 받는다.
//		• N개의 숫자 중 X보다 작은 수만 출력
//		한다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N입력 >> ");
		int n = sc.nextInt();

		System.out.print("X입력 >> ");
		int x = sc.nextInt();
		String result = "";
		
		int[] in = new int[n];
		
		for (int i=0; i<in.length; i++) {
			System.out.print(i+1+"번째 정수 입력 >> ");
			in[i] = sc.nextInt();
			if(in[i]<x) {
				result += in[i] + " ";
			}
		}
		
		System.out.print("결과 >> " + result);
		
		sc.close();
	}

}
