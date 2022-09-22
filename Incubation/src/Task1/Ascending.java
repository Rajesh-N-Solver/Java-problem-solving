package Task1;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter N");
	       int n = sc.nextInt();
	       int array[] = new int[n];
	       boolean check=true;
	       for(int i=0;i<n;i++)
	       {
	    	   array[i]=sc.nextInt();
	    	   if(array[i]>3 || array[i]<0)
	    	   {
	    		   check=false;
	    	   }
	       }
	       if(!check)
	       {
	    	   System.out.println("Wrong Input"); 
	       }
	       else
	       {
	    	   for(int i=0;i<n-1;i++)
	    	   {
	    		   for(int j=0;j<n-i-1;j++)
	    		   {
	    			   if(array[j]>array[j+1])
	    				   {
	    				   int temp = array[j];
		    			   array[j]=array[j+1];
		    			   array[j+1]=temp;
		    		   }
	    				   }
	    		   
	    	   }
	    	   for(int i=0;i<n;i++)
		       {
	    		   System.out.println(array[i]);
		       }
	       }
	}

}
