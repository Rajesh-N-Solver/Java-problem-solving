package Task1;

import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(i+" x "+number+" = "+(i*number));
}
	
	sc.close();}

}
