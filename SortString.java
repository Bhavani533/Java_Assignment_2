package java_assign;
import java.util.Arrays;
import java.util.Scanner;
public class SortString {
	public static void main(String args[])
	{
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
		sc.close();
	}

}
