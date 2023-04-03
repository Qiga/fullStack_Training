package javaFestival_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17_알파벳빈도 {

	public static void main(String[] args) {
		// 입력된 문장에 포함된 알파벳의 빈도를
//		대소문자 구별없이 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String in = sc.nextLine();
		
		String small = in.toLowerCase();
		small = small.replace(" ", "");
		int[] count = new int[26];
		
		char[] alpha = small.toCharArray();
		
		System.out.println(Arrays.toString(alpha));
		for(int i = 0; i<alpha.length; i++) {
			for(int j = 97; j<=122; j++) {
				if((int)alpha[i]==j) {
					count[j-97]++;
				}
			}
		}
		//a :97 ~ z:122
		for(int i = 97; i<=122; i++) {
			System.out.println((char)i + ": " + count[i-97]+ "개");
		}
		sc.close();
	}

}
