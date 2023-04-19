package 월급계산프로그램;

public class PartTimeEmployee extends Employee{
	
	private int workday;
	
	public PartTimeEmployee(String empno, String name, int pay, int workday) {
		super(empno, name, pay);
		this.workday = workday;
	}
	
	@Override
	public int getMoneyPay() {
		return (pay*workday);
	}
	
}
