
import java.util.Scanner;

public class Ex02비정방형배열생성 {

	public static void main(String[] args) {
		
		// 비정방형배열생성
		//1. 이차원 배열 레퍼런스 배열과 변수 생성 및 선언
		int[][] arr = new int[4][];
		// 각 일차원배열의 길이가 다르기 때문에 레퍼런스 배열 생성시
		// 길이 지정 불가 -> 공백으로 둠
		
		Scanner sc = new Scanner(System.in);
		arr[0] = new int[3];  //각 배열의 길이 지정
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];
		
		int sum=0;
		
//		arr[0][0] = 10; //값 지정해주기
		
		for (int k = 0; k<arr.length; k++) {
			System.out.println(k+1+"반 점수 입력");
			for(int i=0; i<arr[k].length; i++) {
				System.out.print(k+1+"반" + (i+1)+"번째 학생 점수 입력 >>");
				arr[k][i] = sc.nextInt();
			
			}
	
		}
		//점수 출력
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1 +"반 >> ");
				sum=0;
				for (int k = 0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]+ " ");
				sum += arr[i][k];
				}
			System.out.println();
			System.out.println("총점 : " + sum + " 평균 : "+ (sum/arr[i].length));
		}
		
		sc.close();
		
	}
}
