
public class Ex10치환 {
	public static void main(String[] args) {

		String left = "red";
		String right = "blue";

		String mid;

		mid = left;
		left = right;
		right = mid;

		System.out.println(left);
		System.out.println(right);
	}
}
