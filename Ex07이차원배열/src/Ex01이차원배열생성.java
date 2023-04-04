
public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		// 이차원 배열 생성하기
		
		int[][] arr = new int[3][5]; //생성 시 크기 지정해야함
		//일차원 배열 3개 -> 각 배열의 길이 == 5;
		//레퍼런스 배열 1개 -> 길이 ==3;
		
		//int형 배열의 기본 값 == 0;(초기화하지 않을 시)
		
		arr[0][0] = 10;
		
		//arr[0] = 1; -> 레퍼런스 배열 초기화 불가능
		
		System.out.println(arr[0][0]);
		
		char[][] charArr = {{'c','c','a'},{'2','d','e'}};
		System.out.println(charArr.length); //레퍼런스배열 길이
		System.out.println(charArr[0].length); //일차원 배열 길이
		
		int[][] arr2 = new int[5][5];
		int num =1; 
		//값을 부여할 때 활용
		for (int i=0; i<arr2.length; i++) {
			for (int e=0; e<arr2[i].length; e++) {
				arr2[i][e] = num++;
			}
		}
		
		//값을 출력 할때 활용
		for (int i=0; i<arr2.length; i++) {
			for (int e=0; e<arr2[i].length; e++) {
				System.out.print(arr2[i][e]+" ");
			}
			System.out.println();
		}
		
		
	}

}
