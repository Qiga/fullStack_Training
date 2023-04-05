import java.util.Arrays;
import java.util.Scanner;

public class test {

	//미로 찾기는 무슨 
//	public static void main(String[] args) {
//		
//		String maps[] = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
//		
//		String[][] arr = new String[maps.length][maps[0].length()];
//		String[] a;
//		
//		int sx = 0;
//		int sy = 0;
//		int lx = 0;
//		int ly = 0;
//		int ex = 0;
//		int ey = 0;
//		
//		for(int i = 0 ; i<maps.length; i++) {
//			a = maps[i].split("");
//			for(int j=0; j<a.length; j++) {
//				arr[i][j] = a[j];
//			}
//		}
//		 for(int i = 0 ;  i<arr.length; i++){
//		System.out.println(Arrays.toString(arr[i]));
//		 }
//		 for(int i =0 ; i<arr[0].length; i++) {
//			 int s= Arrays.asList(arr[i]).indexOf("S");
//			 if(s!=-1) {
//				 sx =i;
//				 sy =s;
//				 System.out.println(i+""+s);
//			 }
//			 int l= Arrays.asList(arr[i]).indexOf("L");
//			 if(l!=-1) {
//				 lx = i;
//				 ly = l;
//				 System.out.println(i+""+l);
//			 }
//			 int e= Arrays.asList(arr[i]).indexOf("E");
//			 if(e!=-1) {
//				 ex = i;
//				 ey = e;
//				 System.out.println(i+""+e);
//			 }
//		 }
//		 
//		 int sl_x = Math.abs(sx-lx);
//		 int sl_y = Math.abs(sy-ly);
//		 
//		 System.out.println(sl_y);
//
//        
//	}
//}
        
	//키순대로 줄세우기
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
//		32
//		13
//		23
		
		int mn = sc.nextInt();
		int pare; // 비교값을 받는 변수
		int[] man = new int[mn/10];
		int temp; //치환을 위한 임의 변수
		int[] a=new int[mn%10]; int[] b=new int[mn%10];
		
		//배열에 학생들 추가 
		for(int i=0; i<man.length; i++) {
			man[i] = i+1;
		}
		for(int i = 1; i<=mn%10; i++) {
			pare =sc.nextInt();
			for(int j=0; j<man.length; j++) {
				if (pare/10==man[j]) {
					a[i-1] = pare%10;
				}
			}
			for(int j=0; j<man.length; j++) {
				if (pare%10==man[j]) {
					b[i-1] = pare%10;
				}
			}
		
		}
		Arrays.sort(a);
		Arrays.stream(b).distinct();
		System.out.println(Arrays.toString(b));
		for(int i =0; i<man.length; i++) {
			System.out.print(man[i]);
		}
	}
}
	

