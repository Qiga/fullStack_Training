package 검색;

import java.util.Arrays;

public class Ex02이진탐색 {
	
	public static void main(String[] args) {
		
	// 이진탐색
	// 변수 3개를 사용하여 데이터를 탐색하게 됨
	// lowIndex, HighIndex, middleIndex
		
		//장점 : 시간복잡도가 1/2로 빠른 탐색 속도를 가지고 있음
		//단점 : 알고리즘 상 정렬된 리스트만 사용가능

	int[] arr = {1,7,16,25,30,33,41,66,78,90};
	
	//lowIndex : 최소 Index값
	int lowIndex = 0;
	//highIndex : 배열이 가지는 최대 Index 값
	int highIndex = arr.length-1;
	
	//찾고싶은 숫자 
	int num = 66;
	
	while(true){
		int middleIndex = (lowIndex+highIndex)/2;
		if (arr[middleIndex]==num) {
			System.out.println(middleIndex);
			break;
		}else if(arr[middleIndex]>num){
			highIndex = middleIndex-1;
		}else {
			lowIndex = middleIndex+1;
		}
	}
	
	System.out.println(Arrays.toString(arr));
	}
}
