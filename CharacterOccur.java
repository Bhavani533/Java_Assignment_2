package java_assign;
import java.util.Scanner;
public class CharacterOccur {
	public static void main(String args[])
	{
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Enter the character to search : ");
		char se = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==se)
			{
				count++;
			}
		}
		System.out.println("The character "+se+" appears "+count+" times");
		sc.close();
	}
}
