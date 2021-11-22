package java_assign;
import java.util.Scanner;
public class ReverseFor {
	public static void main(String args[])
	{
		int rev =0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(;num!=0;num=num/10)
		{
			rem = num%10;
			rev = rev*10+rem;
		}
		System.out.println("The reverse of the number is : "+rev);
		sc.close();
	}

}
