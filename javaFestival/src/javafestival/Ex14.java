package javafestival;

public class Ex14 {
	public static void main(String[] args) {
		
		/*
		 * 아래와 같이 출력하시오
		  
		  			*
		  		   **
		  		  ***
		  		 ****
		 		*****
		  
		 */
	
		/* 단순한 출력
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		*/
		
		for (int k = 1 ; k<=5; k++) {
			for (int i = 1; i<=5-k; i++) {
				System.out.print(" ");
			}
			for (int w = 1; w<=k; w++) {
				System.out.print("*");
			}
			System.out.println();
	}
	
		
	}
}
