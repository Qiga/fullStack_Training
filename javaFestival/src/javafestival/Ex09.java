package javafestival;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int one = num%10;
		
		if (one >= 5) {
			one = (10-one); 
		}else one = -one;
		
		System.out.print("반올림수 : "+ (num+one));
		
		sc.close();
	}
}
