package codechallenge;
import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		int a;
		int b;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		a=sc.nextInt();
		System.out.println("Enter number 2:");
		b=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			result=a*i;
			System.out.println(a+"*"+i+"="+result);
		}
		sc.close();

	}

}
