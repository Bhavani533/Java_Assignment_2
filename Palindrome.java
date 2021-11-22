package java_assign;
import java.util.Scanner;
public class Palindrome {
	static boolean palRec(String str,int s,int e)
	{
		if(s==e) {
			return true;
		}
		if((str.charAt(s))!=(str.charAt(e))) {
			return false;
		}
		if(s<e+1) {
			return palRec(str,s+1,e-1);
		}
		return true;
	}
	static boolean isPal(String str)
	{
		int n = str.length();
		if(n==0) {
			return true;
		}
		return palRec(str,0,n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		if(isPal(str))
		{
			System.out.println("The string is palindrome");
		}
		else{
			System.out.println("The string is not palindrome");
		}
		sc.close();
	}
}
