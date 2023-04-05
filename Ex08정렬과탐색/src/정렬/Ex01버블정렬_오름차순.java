package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {
	
	public static void main(String[] args) {
		
		//기본 배열 설정

		int[] arr = {10,24,7,68,125,2,3,4};
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		int temp; //치환을 위한 임시공간
		int count =0;

		//회차반복 
		for (int j =1; j<arr.length; j++) {
			for (int i = 0; i < arr.length-j; i++) {
				if(arr[i]>arr[i+1]) {  
					//치환을 위한 일시적인 공간이 필요함
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					count++;
				}
			}
			System.out.println(j + "회차 : " + Arrays.toString(arr));
			if(count==0) {
				break;
			}else {
				count =0;
			}

		}
//		//1회차(최대 7회차)
//		//0-1, 1-2, 2-3 ~~ 6-7
//		for (int i = 0; i < arr.length-1; i++) {
//			if(arr[i]>arr[i+1]) {  
//				//치환을 위한 일시적인 공간이 필요함
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println("1" + "회차 : " + Arrays.toString(arr));
//		
//		//2회차
//		//0-1, 1~2 ~~ 5-6
//		for (int i = 0; i < arr.length-2; i++) {
//			if(arr[i]>arr[i+1]) {  
//				//치환을 위한 일시적인 공간이 필요함
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println("2" + "회차 : " + Arrays.toString(arr));
//
//		
//		
	}
}
