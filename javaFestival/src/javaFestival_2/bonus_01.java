package javaFestival_2;

public class bonus_01 {

	public static void main(String[] args) {
		// 마름모 찍기

		int line = 27;
		int num = 1;

		
		//중간까지
		for(int i = 1; i<=line/2+1; i++) {
			
			for(int j =1; j<=line/2+1-i; j++) {
				System.out.print("\t");
			}
			for(int k =1; k<=i*2-1; k++) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}
		
		//중간아래
		for (int i =1 ; i<=line/2; i++) {
			//t1, n5 // t2, n3 // t3, n1
			for(int j = i; j>=1; j--) {
				System.out.print("\t");
			}
			for(int k = line-2*i; k>=1; k--) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}
		
	
	}

}
