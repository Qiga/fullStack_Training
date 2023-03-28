package 이중for문;

public class Ex02이중for문 {
	
	public static void main(String[] args) {
		
		//2부터 30까지의 약수를 구하세요
		
		for (int w = 2; w<=30; w++) {
			System.out.printf("%d의 약수 : ",w);
			for (int k = 1; k<=w; k++) {
				if (w%k==0) {
					System.out.print(k + " ");
				}
			}
			
			System.out.println();
			
		}
	}
}
