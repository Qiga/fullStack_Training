
public class Ex01배열생성과선언 {

	public static void main(String[] args) {
	
		//1. 배열 생성 + 배열의 크기
//		new int[5]; -> 사용이 불가능함
		//레퍼런스 변수 선언해야 배열에 접근 가능
		int[] arra = new int[5]; 
		int arr2[] = new int[3];
		System.out.println(arr2);
		
		//2. 배열에 값 저장하기
		
		arra[0] = 10; //arr배열 인덱스 0에 값 할당
		arra[1] = 20;
		arra[2] = 30;
		arra[3] = 40;
		arra[4] = 50;
	    //arr[5] = 60; //컴파일에러가 발생 x 이유 : 프로그램을 실행하기 전까지 arr의 크기를 알수 없음 => 동적로딩의 특징
		
		//3. 배열에 저장된 값 출력
		System.out.println(arra[2]);
		
		//4. 0~4 모든 값 출력
		System.out.println(arra); //배열의 참조값이 나옴 (heap영역에 저장된 배열을 찾을때쓰임) arr==레퍼런스 변수
		System.out.println(arra[0]);
		System.out.println(arra[1]);
		System.out.println(arra[2]);
		System.out.println(arra[3]);
		System.out.println(arra[4]);
		
		//배열의 길이 확인 (length라는 속성(필드)에 저장함)
			System.out.println(arra.length);
		
		for (int i = 0 ; i<=4; i++) {
			System.out.println(arra[i]);
		}
		
		//5. 배열에 저장되야하는 값을 알고 있는 경우 (선언)
		
		int[] arr3 = {1,2,3,4,5}; //5칸짜리 정수형 배열 생성 후 초기화
		System.out.println(arr3);
	}
	
}
