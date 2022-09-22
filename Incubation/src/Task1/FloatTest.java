package Task1;

import java.util.Scanner;

public class FloatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input value: ");
		        double val = in.nextDouble();

		        if (val>0)
		        {
		            if (val < 1)
		            {
		                System.out.println("Positive small");
		            }
		            else if (val > 1000000)
		            {
		                System.out.println("Positive large");
		            }
		            else
		            {
		                System.out.println("Positive");
		            }
		        }
		        else if (val < 0)
		        {
		            if (Math.abs(val) < 1)
		            {
		                System.out.println("Negative small");
		            }
		            else if (Math.abs(val) > 1000000)
		            {
		                System.out.println("Negative large");
		            }
		            else
		            {
		                System.out.println("Negative");
		            }
		        }
		        else
		        {
		            System.out.println("Zero");
		        }
		    }
		


	}


