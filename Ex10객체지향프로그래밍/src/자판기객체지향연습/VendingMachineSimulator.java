package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		
	     // 자판기 프로그램을 만들어보자.
		
		// 프로그램을 구동시키는 객체 / 자판기 객체

	    VendingMachine vm = new VendingMachine(); //변수의 선언 
	    
	    vm.inputMoney();
	    
	    vm.menuChoice();
	    
	    vm.changeMoney();
	    //앞(VendingMachine) 자료형
	      
	}
}
