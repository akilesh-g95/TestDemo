package cheating;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name which needs to be reversed");
		String normalstring = sc.nextLine();
		sc.close();
	char[] ch = normalstring.toCharArray();
System.out.println("hello word");
	String rev = "" ;
	
	for(int i = ch.length-1; i>=0; i--) {
		 rev = rev+ch[i];
	}
	System.out.println(rev);
	}

}
