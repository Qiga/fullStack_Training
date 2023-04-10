import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {	
		
		
		// 절차적 프로그래밍 : 절차에 따라 구조적인 프로그래밍이 가능
		// 각각의 코드가 순서에 민감함 -> 융지보수 코드 분석이 어려움
		
		// => 변화에 우연하고 재사용성이 높은 코드
		
		// 객체지향 프로그래밍 : 코드의 재사용이 용이함, 분석과 설계의 전환이 쉬움
		// 설계에 많은 시간이 소요됨
		
		// => 어떻게 할 것인지 보다 무엇을 할 지 집중하는 코드
		
		// 함수형 프로그래밍 : 높은 수준의 추상화, 불변성을 지향해 사이드 이펙트가 적음
		// 순수함수를 구현하기 위해 코드의 가독성이 떨어질 수 있음
		
		// object oriented programming (oop) : 객체지향프로그래밍

		// 하나의 파일에 묶는게 아닌 기능별로 저장함
		// 자바 = 객체 지향을 위한? 언어 
		// 파이썬 = 객체 지향도 가능하며 다양한 게 가능
		// 응집도는 높이고(관련된 것을 묶고) 결합도는 낮추라
		
		// 절차지향은 기본이며 그 위에 객체지향 사고를 얹는 것임
		
		
		// 영화 예매 => 영화, 고객, 극장 , 결제 등의 객체로 분리 
		// (각각의 객체를 살아있는 것으로 보고 설계함)
		
		// 고객 - > 영화 : 뭐가 언제 상영하는 지 알려줘
		// 고객 - > 극장 : 어디서 볼 수 있는지
		// 고객 - > 좌석 : 좌석은 어디에서 볼 수 있어?
		// 고객 - > 결제 : 
		//이를 메소드를 통해서 소통함
		
		
		//자판기 코드
	      Scanner sc = new Scanner(System.in);
	      System.out.println("====자판기 프로그램====");
	      System.out.print("돈을 입력하세요 >>");
	      int money = sc.nextInt();
	      
	      System.out.println("1.콜라(500) 2.물(800) 3.비타민워터(1500)");
	      System.out.print("메뉴를 선택하세요 >>");
	      int choice = sc.nextInt();
	      
	      if(choice == 1) money-=500;
	      else if(choice == 2) money-=800;
	      else if(choice == 3) money-=1500;
	      
	      if(money<0) { // 돈이 부족
	         System.out.println("잔돈이 부족합니다 ㅠㅠ");
	      }else { // 잔돈 계산
	         int won1000 = money/1000; // 천원
	         int won500 = money%1000/500; // 오백원
	         int won100 = money%1000%500/100; // 백원
	         System.out.println("천원 : "+won1000+"개, 오백원 : "+won500+"개, 백원 : "+won100+"개");
	      }
	      
	      
	      //class : 설계도와 같은 것
	      	// 속성 (attribute) = data : 이름 키 나이 성별 머리색 등  =>> field
	      	// 행동 (behavior) = logic : ~하다의 메소드  =>> method
	      
	      // object : 객체
	        // created from the class 
	   
	      
	      //객체지향 프로그래밍의 특징
	      
	}

}
