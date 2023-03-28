package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {
		
		//이중 for문을 사용해서 2단~9단 출력
		
	    for (int j=2; j<=9; j++) {
	    	 System.out.print("\n"+ j+"단 : ");
	    	for (int k=1; k<=9; k++) {
	    		System.out.printf("%d * %d = %d   ", j, k, j*k);
	    	}
	    	System.out.println();
	    }
	    
	}
}
