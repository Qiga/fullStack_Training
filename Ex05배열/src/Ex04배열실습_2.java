import java.util.Arrays;
import java.util.Scanner;

public class Ex04배열실습_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
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
		System.out.println("평균 : " + (double)sum/5);
		
		sc.close();

	}

}
