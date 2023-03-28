package 이중for문;

public class Ex03별찍기 {

	public static void main(String[] args) {
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
		for (int i = 1 ; i<=5 ; i++) {
			for (int k = 1; k<=5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i = 1; i <=5; i++) {
			for (int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// *****
		// ****
		// ***
		// **
		// *
		
		for (int i = 1; i<=5; i++) {
			for (int k = 5; k>=i; k--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		
		//    *
		//   **
		//  ***
		// ****
		//*****
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
