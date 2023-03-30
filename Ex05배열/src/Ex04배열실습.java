
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		
		//배열을 랜덤값 초기화
		
		Random rd = new Random();
		
//		int[] arr = new int[10];
//		
//		arr[0] = rd.nextInt(20)+1;
//		System.out.println(arr[0]);
		
		// 크기가 10인 정수형 배열선언, 랜덤값으로 초기화
		// 배열 중 가장 큰 값, 작은 값 출력
		
		int[] arr = new int[10];
		int max = 0;
		int min = 21;
		
		for (int i=0; i<arr.length; i++){
			arr[i] = rd.nextInt(20)+1;
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			
		}

		System.out.printf("가장 큰 값 : %d", max);
		System.out.println();
		System.out.printf("가장 작은 값 : %d", min);
	
	}
}
