package javafestival;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int count = sc.nextInt();
		String star = "*";
		
		while (count>0) {
			for(int i=count; i>0; i--) {
				System.out.print(star);
			}
			System.out.println("");
			count--;
		}
		
		sc.close();
			
	}
}
