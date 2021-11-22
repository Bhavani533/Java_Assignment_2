package java_assign;
import java.util.Scanner;
public class Prime {
	public static void main(String args[])
	{
		int s = 1,num = 3;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("First "+n+" prime numbers are:");
		System.out.println(2);
		for(int i=2;i<=100;)
		{
			for(int j =2;i<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{
					s = 0;
					break;
				}
			}
			if(s!=0)
			{
				System.out.println(num);
				i++;
			}
			s = 1;
			num++;
		}
		sc.close();
	}

}
