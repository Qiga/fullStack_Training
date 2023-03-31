package javaFestival_2;


import java.util.Random;


public class Ex06_중복없는로또 {

	public static void main(String[] args) {
		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
		
		Random rd = new Random();

		int[] arr = new int[6];
		
		//6자리 수 랜덤으로 부여하기
		do {
			for(int i = 0; i<arr.length; i++) {
				arr[i] = rd.nextInt(45)+1;
			}
		}while(equa(arr)); //메서드로 중복확인하기 (중복일시 t/ 중복이 없으면 f)

		//출력하기
		for(int i = 0; i<arr.length; i++) {
			System.out.println("행운의 숫자는 >> "+arr[i]);
		}
	
	}
	//중복확인 메서드
	public static boolean equa(int[] a) {
		for(int i = 0; i<a.length; i++) {
			for(int e=i+1; e<a.length; e++) {
				if (a[i]==a[e]) {
					return true;					
				}else;
			}
		}return false;
	}
}
