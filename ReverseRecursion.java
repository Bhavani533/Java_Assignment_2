package java_assign;
import java.util.Scanner;
public class ReverseRecursion {
	public static void revNum(int num)
	{
		if(num<10)
		{
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			revNum(num/10);
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("The reverse of the number is : ");
		revNum(a);
		sc.close();
	}

}
