package codechallenge;

import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		a=sc.nextInt();
		System.out.println("Enter your number:");
		b=sc.nextInt();
		System.out.println("Enter your number:");
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Largest No is:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest No is:"+b);
		}
		else
		{
			System.out.println("Largest No is:"+c);
		}
		sc.close();
	}

}
