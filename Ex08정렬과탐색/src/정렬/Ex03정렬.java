package 정렬;

import java.util.Arrays;

public class Ex03정렬 {

	public static void main(String[] args) {
		
		int[] arr = {10,24,7,68,125,2,3,4};
		
		//Arrays : 배열을 다룰 수 있는 속성, 메서드 모음(클래스, 객체 , 도구)
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
