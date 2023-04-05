package 검색;

public class Ex01순차검색 {
	
	public static void main(String[] args) {
		
		int[] arr = {13,35,15,11,26,72,78,13,61,90};
		
		int num = 78; //찾고 싶은 숫자 
		
		for (int i = 0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.println(num + "은 "+ i +"번 인덱스에 있습니다.");
				break;
			}
		}
		//78은 6번 인덱스에 있습니다 출력
	}
}
