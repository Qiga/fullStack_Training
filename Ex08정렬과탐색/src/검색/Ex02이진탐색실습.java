package 검색;

import java.util.Arrays;

public class Ex02이진탐색실습 {

	public static void main(String[] args) {
		
		int[] arr = {10,24,7,68,42,82,3,43,22,84};
		int temp;
		
//		Arrays.sort(arr);
		for(int i = 1; i<arr.length; i++) {
			for( int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		int start = 0;
		int end = arr.length-1;
		
		int num = 68;
		
		while(true) {
			int mid = (start+end)/2;
			if(arr[mid] == num) {
				System.out.println(mid);
				break;
			}else if(arr[mid] > num) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
