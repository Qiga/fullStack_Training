package javafestival;

public class ex1 {
	public static void main(String[] args) {
		
	  String a = "....#..";
	  
	  char s1 = a.charAt(0);
	  char s2 = a.charAt(1);
	  
	  int is2 = (int)s2;
	  
	  System.out.println(s1);
	  System.out.println(is2);

	  int l_a = a.length();
	  
	  System.out.println(l_a);
	  
	  for (int i=1; i<=l_a; i++) {
		  int s_ch = (int)a.charAt(i);
		  if (s_ch == 46) {
			  ;
		  }else ;
	  }
	  
	}
}
