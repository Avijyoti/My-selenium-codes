package codechallenge;

import java.util.Scanner;

public class Monthfinder {

	public static void main(String[] args) {
		int m;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter a no 1-12 for getting the month and date:");
		m=sc.nextInt();
		if(m>12)
			System.out.println("Incorrect Month");
		}while(m>12);
		String []months= {"january","feb","march","april","may","june","july","Aug","September","october","november","December"};
		String []days= {"31","28","31","30","31","30","31","31","30","31","30","31"};
		m=m-1;
		System.out.println(months[m]+" have"+" "+days[m]+" days");
		sc.close();
	} 

}
