import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {
		
		//1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 선언
		
		int[] array;
		
		//2. 크기가 10인 배열 생성, 참조값을 저장
		
		array = new int[10];

		//3. 0~9 인덱스에 값 초기화(할당)

		array[0] = 1;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		array[4] = 14;
		array[5] = 15;
		array[6] = 16;
		array[7] = 17;
		array[8] = 18;
		array[9] = 19;
		
		//4. 배열의 모든 값 출력
		
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Arrays : 어떤 배열이든 활용가능한 객체
		//toString : (어떤 객체든 공통) 객체가 가지고 있는 값을 문자열로 바꿔줌
		System.out.println(Arrays.toString(array));
		
		
		//5. 1번 인덱스에 저장된 값과 4번 값의 합을 출력
		
		System.out.println(array[1]+array[4]);
		
		//6. 배열의 모든 값 더하여 출력
		
//		System.out.println(iArr[0]+iArr[1]+iArr[2]+iArr[3]..);
		//누적합
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		//7. 배열안의 수의 평균

		System.out.println(sum/(double)array.length);
		
		//8. 정수배열 선언 기본값 : 선언되지 않은 정수형 배열은 0이다.
	}

}
