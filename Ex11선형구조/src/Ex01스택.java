import java.util.Stack;

public class Ex01스택 {
	
	public static void main(String[] args) {
		
		
		// 1. 스택 생성 
		Stack<String> st = new Stack<String>();
		
		
		//2. 요소 삽입 (push)
		
		// collection -> vector -> stack (상속관계)
		st.push("Hello");
		st.push("Hi");
		String a = st.push("Java");
	
		//3. 가장 마지막 요소 확인 (top에서 제일 가까운 값)
		st.peek();  //스택의 맨 위의 값을 확인만 해줌
		System.out.println(st.peek());
		
		//4. 특정 요소의 위치 확인 
		
		System.out.println(st.search("Hello"));
		System.out.println(st.search("Hi"));
		System.out.println(st.search("Java"));
		System.out.println(st.search("rrr")); //값이 없는 경우 -1 반환
		
		//5. 요소 삭제 pop (삭제와 함께 반환을 해줌), 맨 위에 있는 요소만 삭제 가능함.
	
		String e = st.pop();
		System.out.println(e);
		
		//6. Stack이 비어있는지 확인 (boolean타입)
		// 비어있으면 -> true, 요소가 하나라도 있으면 -> false
		System.out.println(st.empty());
		
		//스택의 활용
		// 방문기록, ctrl+z, 후위 표기법(컴퓨터가 계산하기 쉬운 괄호가 없고 연산자가 뒤에 있는 형식),
		//재귀(내가 자신을 다시 부르는것)적 알고리즘
	}
}
