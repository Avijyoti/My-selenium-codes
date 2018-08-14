package codechallenge;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String userGiven = sc.next();
		StringBuffer sb = new StringBuffer(userGiven);
		System.out.println("String after Reverse: "+sb.reverse());
		
		sc.close();
	}

}
