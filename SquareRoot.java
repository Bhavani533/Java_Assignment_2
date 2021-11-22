package java_assign;
import java.util.Scanner;
public class SquareRoot {
	public static double sqrt(int num)
	{
		double temp;
		double sqrtroot = num/2;
		do {
			temp = sqrtroot;
			sqrtroot = (temp+(num/temp))/2;
		}
		while((temp-sqrtroot)!=0);
		return sqrtroot;
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The Square root of the number is : "+sqrt(num));
		sc.close();
	}

}
