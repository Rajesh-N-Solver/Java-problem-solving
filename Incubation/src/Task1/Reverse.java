package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String1:");
		String str1 = sc.nextLine();
		char array[] = str1.toCharArray();
		int start=0;
		int end;
		for(int i=0;i<str1.length();i++)
		{if(array[i]=='.')
					{
						reverse(array,start,i-1);
						start=i+1;
					}
			}
		reverse(array,start,str1.length()-1);
		reverse(array,0,str1.length()-1);
		System.out.println(Arrays.toString(array));
	}
	static void reverse(char[] ch,int start,int end)
	{
		while(start<=end)
		{
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		
	}

}
