package 메서드;

public class Ex01메서드 {

	//메서드 작성은 main 밖에서 이루어진다. 
	//기능을 만들어 두고 필요할 때마다 가져다가 사용하려는 것
	//static : 저장소 개념, 공간을 먹기때문에 남발하지 않아야 한다.
	//(매개변수) : 매서드 안에서 사용될 수 있는 변수로 선언만 한다.
	// return : 자료형이 명시된 경우 반드시 있어야 하며, 모든 경우에 대해 존재해야한다.
	public static int sum(int a, int b, int c){
		return a+b+c+365;
	}
	public static void main(String[] args) {
		
		//매개변수와 전달인자의 갯수/데이터 타입은 항상 일치해야한다.
		System.out.println(sum(10,20,500));

	}

}
