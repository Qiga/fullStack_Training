package javaFestival_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_정렬하기 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아
//		오름차순 정렬하여 출력하는 프로그램을 구현하시오.

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("정렬 후\n"+Arrays.toString(arr));
		
		sc.close();
	}

}
