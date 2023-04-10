package 주소관리프로그램;

public class Address {

	private String name;
	private int age;
	private String phone;
	
	public Address(String name, int age, String phone) {
		this.name = name; 
		this.age = age;
		phone = phone.replace("-","");
		this.phone = String.format("%s - %s - %s", phone.substring(0, 3), phone.substring(3, 7), phone.substring(7, 11) );
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}
	
	
}
