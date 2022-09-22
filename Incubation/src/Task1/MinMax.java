package Task1;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter N");
       int n = sc.nextInt();
       int array[] = new int[n];
       for(int i=0;i<n;i++)
       {
    	   array[i]=sc.nextInt();
       }
       int min=array[0];
       int max=array[0];
       for(int i=1;i<n;i++)
       {
    	   if(array[i]>max)
    		   max=array[i];
    	   if(array[i]<min)
    		   min=array[i];
       }
       System.out.println("Min-"+min);
       System.out.println("Max-"+max);
       
	}

}
