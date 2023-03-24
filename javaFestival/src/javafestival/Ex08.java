package javafestival;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		do {
		System.out.print("A 입력 >> ");
		a = sc.nextInt();
		
		System.out.print("B 입력 >> ");
		b = sc.nextInt();
		
		System.out.println("결과 >> "+ (a-b));
		}while ((a!=0 || b!=0)); 
		
		sc.close();
	}
}
