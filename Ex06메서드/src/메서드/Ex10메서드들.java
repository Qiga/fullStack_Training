package 메서드;

public class Ex10메서드들 {

	public static void main(String[] args) {
		// String Method 모음
		String data = "여러분 안녕?";
		
		
		//indexOf() : 특정 문자열/ 특정 문자의 위치를 반환
		// "안" // 포함하지 않으면 -1 반환
		System.out.println(data.indexOf("안"));
		
		
		//contains(String s)
		//매개변수로 받은 문자열의 포함 여부를 boolean으로 반환
		if (data.contains("안녕?")==true) {
			System.out.println("포함하고 있습니다.");
		}else;
		
		// charAt(int i)
		// String data에서 i번째 문자 반환
		System.out.println(data.charAt(1));
		
		// split (String s)
		// : String 변수를 s 변수를 기준으로 잘라 배열로 반환
		String data2 = "010-6666-6116";
		String[] arr = data2.split("-");
		// 0 : 010
		// 1 : 2764
		// 2 : 0296
		System.out.println(arr[1]);
				
		

	}

}
