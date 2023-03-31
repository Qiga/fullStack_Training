package javaFestival_3;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println(getMiddle("qweqr"));
	}
	
	public static String getMiddle(String a) {
		
		int b = a.length();
		
		if (b%2 == 0) {
			return a.substring(b/2-1, b/2+1);
		}
		return a.substring(b/2, b/2+1);
	}
}
