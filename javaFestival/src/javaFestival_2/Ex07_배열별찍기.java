package javaFestival_2;

import java.util.Scanner;

public class Ex07_배열별찍기 {

	public static void main(String[] args) {
		
		//입력한 배열 수 만큼 별찍기
		Scanner sc= new Scanner(System.in);
		int[] star = new int[5];
		
		//문구 출력+ 배열 값 입력 받기
		for (int i = 0; i<star.length; i++) {
			System.out.print(i+"번째 별의 수 : ");
			star[i]=sc.nextInt();
		}
		
		//메서드 사용하여 반복출력하기
		for (int i = 0; i<star.length; i++) {
			System.out.println(star[i] + ":" + countingStar(star[i]) );
		}
		
		sc.close();
	}
	
	//별찍어주는 메서드 
	public static String countingStar(int a) {
		String set = "";
		for (int i=1; i<=a; i++) {
			set += "*";
		}
		return set;
	}
}
