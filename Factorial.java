package java_assign;
import java.util.Scanner;
public class Factorial {
	static int fact1(int n)
	{
		int fact=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			fact = (n*(fact1(n-1)));
			return fact;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The factorial of a number is:"+fact1(n));
		sc.close();
	}

}
