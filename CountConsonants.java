package java_assign;
import java.util.Scanner;
public class CountConsonants {
	public static void main(String args[])
	{
		int count = 0;
		int count1 = 0;
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				count1++;
			}
		}
		System.out.println("Number of vowels : "+count);
		System.out.println("Number of consonants : "+count1);
		sc.close();
	}
}
