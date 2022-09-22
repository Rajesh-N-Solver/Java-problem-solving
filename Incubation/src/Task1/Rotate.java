package Task1;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String1:");
		String str1 = sc.nextLine();
		System.out.println("String2:");
		String str2 = sc.nextLine();
		if(str1.length()!=str2.length())
			System.out.println("0");
		else
		{
			boolean check = true;
			if(str1.charAt(0)!=str2.charAt(str1.length()-2))
				check = false;
			if(str1.charAt(1)!=str2.charAt(str1.length()-1))
				check = false;
		for(int i=2;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i-2))
			{
				check = false;
			}
		}
		
	
	if(check)
		System.out.println("1");
	else
	System.out.println("0");
		}
	}
	

}
