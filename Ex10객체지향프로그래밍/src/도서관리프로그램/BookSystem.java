package 도서관리프로그램;

import java.util.ArrayList;

//책을 관리하는 클래스(등록, 책정보 확인, 수정 등)
public class BookSystem {
	
	private ArrayList<BookData> list = new ArrayList<>();
	
	public void addBook(String title, int price, String writer) {
		BookData Book = new BookData(title, price, writer);
		list.add(Book);
	}
	
	public String getBookTitleList() {
		String msg = "";
		for (int i = 0; i<list.size(); i++) {
			BookData temp = list.get(i);  //이게 뭐임? temp ?
			msg += temp.getTitle();
			msg += "\n";
			
		}
		
		return msg;
	}
	
}
