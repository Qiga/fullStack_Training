
public class Ex01이차원배열실습 {

	public static void main(String[] args) {
		// 4행6열 크기의 2차원 배열을 다음과 같이 선언 및 초기화 후 
		// 출력하시오
		
		int[][] arr = new int[4][6];
		
		//i,j,k순서대로 반복문에서 활용을 많이함
		int num = 21;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++; //값 부여
				System.out.print(arr[i][j] + " "); //출력
			}
			System.out.println();
		}
		
		// 5행 5열 2차원 배열 생성하고 
		// 54321
		// 109876
		// 1514131211 ~ 형태로 출력하시오.
		
		int[][] arr2 = new int[5][5];
		
		int num2 = 1;
		//값 부여하기
		for (int i = 0; i<arr2.length; i++) {
			for(int j =arr2.length-1; j>=0; j--) {
				arr2[i][j] = num2++;
			}
		}

			
		
		//값 출력하기
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t"); 
			}
			System.out.println();
		}
	}
}
