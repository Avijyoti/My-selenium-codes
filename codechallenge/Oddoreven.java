package codechallenge;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is an even no.");
		}
		else
		{
			System.out.println(num+" is an odd no.");
		}
		sc.close();

	}

}
