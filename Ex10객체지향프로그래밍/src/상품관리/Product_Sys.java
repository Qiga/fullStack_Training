package 상품관리;

import java.util.ArrayList;

public class Product_Sys {

	ArrayList<Product> pd = new ArrayList<>();

	
	public void addProduct(String name, int unitPrice, int amount) {
		pd.add(new Product(name, unitPrice, amount));
	}
	
	public void checkList() {
		int sum = 0;
		System.out.println("\n제품명\t\t단가\t\t수량");
		for(int i=0; i<pd.size(); i++) {
			Product temp = pd.get(i);
			sum += temp.getAmount()*temp.getUnitPrice();
			System.out.println(temp.getName()+"\t\t"+temp.getUnitPrice()+"\t\t"+temp.getAmount());
		}
		System.out.println("\t\t판매 시 매출 : " + sum +"원\n");
		
		
	}
}
