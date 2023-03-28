
public class Ex08for문 {

	public static void main(String[] args) {
		
		//for문을 사용해서 21에서 57까지 출력
		
		for(int i = 21; i <=57; i++) {
			System.out.print(i+" ");
		}

		System.out.println("");

		//for문을 활용해 96에서 53까지 출력하기
		
		for(int e = 96; e>=53; e--) {
			System.out.print(e + " ");
		}
		
		System.out.println("");
		
		// for문을 사용하여 21에서 57까지의 수 중 홀수만 출력하시오
		
		for(int h = 21; h<=57; h++) {
			if(h%2!=0) {
				System.out.print(h + " ");
			}
		}
		
		System.out.println("");
		for(int t = 21; t<=57; t+=2) {
			System.out.print(t + " ");
		}
	}

}
