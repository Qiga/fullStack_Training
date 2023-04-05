package javaFestival_2;

public class Ex16_십진수만들기 {

	public static void main(String[] args) {
		//문자열 형태의 2진수를 입력받아
//		10진수로 바꾸는 프로그램을 작성하시오
		
		String in = "10101010";
		int sum = 0;
		int be =1;
		
		for (int i=in.length()-1; i>=0; i--) {
				if(in.charAt(i) == '1') {
					sum += be;
			}else;
			be *= 2;
		}

		System.out.println(sum);
		
	}

}
