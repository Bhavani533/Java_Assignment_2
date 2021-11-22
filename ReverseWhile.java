package java_assign;
import java.util.Scanner;
public class ReverseWhile {
	public static void main(String args[])
	{
		int rev =0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		sc.close();
		System.out.println("The reverse of the number is : "+rev);
	}

}
