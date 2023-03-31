package javaFestival_2;

import java.util.Arrays;
import java.util.Random;

public class Ex01_랜덤과최대최소 {

	public static void main(String[] args) {
		//8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		//가장 큰 수와 작은 수를 각각 출력하시오.

		Random rd = new Random();
		int max = 0;
		int min = 101;
		
		
		int[] arr = new int[8];
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = rd.nextInt(100)+1;
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("배열에 있는 모든 값 : "+ Arrays.toString(arr));
		System.out.println("가장 큰 값 : " + max );
		System.out.println("가장 작은 값 : " + min );
		
	}

}
