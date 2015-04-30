package C_MM37;

import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            float x,y;
            x = sc.nextFloat();
            y = sc.nextFloat();
            if (x!=0 || y!=0)
	            if (x > 0)
	            	if (y > 0)
	            		System.out.println("1st Quadrant");   
	            	else
	            		if (y < 0)
	            		    System.out.println("4th Quadrant");
	            		else
	            			System.out.println("x-axis");
	            else
	            	if (x < 0)
		            	if (y > 0)
		            		System.out.println("2st Quadrant");   
		            	else
		            		if (y < 0)
		            		    System.out.println("3th Quadrant");
		            		else
		            			System.out.println("x-axis");
	            	else
	            		System.out.println("y-axis");
            sc.close();
  }    
}