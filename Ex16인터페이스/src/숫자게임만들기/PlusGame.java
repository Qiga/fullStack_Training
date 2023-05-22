
	package 숫자게임만들기;

	import java.util.Random;

	public class PlusGame implements OperatorGame {
		//개발자 1
		//인터페이스를 사용해서 구현하기
		
	    private int num1;
	    private int num2;
	    private String op1;
	   @Override
	   public int random() {
	      Random rd = new Random();
	      int answer = rd.nextInt(10)+1;
	      return answer;
	   }

	   @Override
	   public String getQuizMsg() {
	      this.num1 = random();
	      this.num2 = random();      
	      
	      String[] op = new String[4];
	      op[0] = "+";
	      op[1] = "-";
	      op[2] = "*";
	      op[3] = "/";
	   
	      
	      Random rd = new Random();
	      int ranNum = rd.nextInt(4); 
	      
	      this.op1 = op[ranNum];
	      
	      return num1+op1+num2;
	   }

	   
	   @Override
	   public boolean checkAnswer(int ans) {
	      if(op1.equals("+") && ans == num1 +num2) {               
	            return true;         
	      }
	      else if(op1.equals("-") && ans == num1 - num2) {    
	            return true;
	         
	      }
	      else if(op1.equals("*")&& ans == num1 * num2){
	            return true;
	         
	      }
	      else if(op1.equals("/")&& ans == num1 / num2){
	         return true;
	         
	      }
	      return false;
	      
	      
	   }


	   // 랜덤수+랜덤수 또는 랜덤수-랜덤수를 계산한 값이 int ans와 같은지 확인
	   // -> boolean형태로 참 또는 거짓을 답해주면됨.

	   // 개발자1
	   // 자연쌤이 주신 인터페이스를 사용해서 구현하기
	   // 기능을 완성하기
	   
	}

