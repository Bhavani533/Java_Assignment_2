package java_assign;
import java.util.Scanner;
public class Duplicate {
	public static void main(String args[])
	{
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count;
		char ch[] = s.toCharArray();
		System.out.println("Duplicate characters in the string are : ");
		for(int i =0;i<ch.length;i++) {
			count = 1;
			for(int j =i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i] != '0') {
				System.out.println(ch[i]);
			}
		}
		sc.close();
	}
}
