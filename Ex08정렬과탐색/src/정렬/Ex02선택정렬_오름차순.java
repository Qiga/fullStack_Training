package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,7,13,98,70,24};
		int index;
		int temp;
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		
		
		for(int j=0; j<arr.length-1; j++) {
			
			index = j;
			for(int i = index+1; i<arr.length; i++) {
				if(arr[index]>arr[i]) {
					index = i;
					
				} //배열안에서 가장 작은 값이 존재하는 인덱스 번호를 갖게됨
			
			}
			temp = arr[j];
			arr[j] = arr[index]; //가장 작은 숫자 ->0
			arr[index] = temp; //원래 0번에 있던 값을 index로 옮기기
		
			System.out.println(j+1+"회 정렬 : "+ Arrays.toString(arr));
		}
		
	}
}
