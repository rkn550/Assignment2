import java.util.*;

public class MiddleCharOfString {
	
	public static String middleElement(String s) { 							
		
		int len = s.length();					
		int index = len/2;													
		if(len%2==0) {							
			return s.substring(index-1,index+1);
		}
		return String.valueOf(index);		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);						
		System.out.println("Enter a String");					
		String str = sc.nextLine();							
		String middle = middleElement(str); 							
		
		System.out.println("Middle character : " + middle);
		sc.close();

	}

}
