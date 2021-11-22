package java_assign;
import java.util.Scanner;
public class ReverseStr {
	void revStr(String str) {
		if((str==null)||(str.length()<=1))
		{
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			revStr(str.substring(0,str.length()-1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		ReverseStr obj = new ReverseStr();
		obj.revStr(str);
		sc.close();
	}

}
