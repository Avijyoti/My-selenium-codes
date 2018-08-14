package codechallenge;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		num=sc.nextInt();
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			System.out.println(rem);
		}
		sc.close();

	}

}
