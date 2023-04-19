package 월급계산프로그램;

public class RegularEmployee extends Employee {

	private int bonus;
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	@Override
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
}
