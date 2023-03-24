package javafestival;

public class Ex06 {
	public static void main(String[] args) {

		int sum = 0;
		int first = 77;
		int snd = 1;

		while (first >= 1) {
			sum = sum + (first * snd);
			first--;
			snd++;
		}
		System.out.println(sum);
	}
}
