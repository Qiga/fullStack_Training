import java.util.Arrays;
import java.util.Scanner;

public class Ex04배열실습_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		
		int max = 0;
		int min = 1999999999;
		int sum = 0;
		
		for (int i=0; i<5; i++) {
		System.out.printf("%d번째 입력 : ", i+1);
		arr[i] = sc.nextInt();
		max = Math.max(max, arr[i]);
		min = Math.min(min, arr[i]);
		sum += arr[i];
		}
		
		System.out.println("입력된 정수 : " + Arrays.toString(arr));
		
		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum/arr.length);
		
		sc.close();
		
		//확장 for문 (for~ each문)
		//배열, list구조에서 쓰일 수 있는 반복문 
		
//		for(;배열이름) {
//			
//		}
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
