package C_MM35;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            int years;
            years = sc.nextInt();
            if (years % 4 == 0){
            	if (years % 100 == 0){
            		if (years % 400 == 0)
            			System.out.println("Bissextile Year");
            		else
            			System.out.println("Common Year");
            	}            	
            	else
            		System.out.println("Bissextile Year");
            }            	
            else
            	System.out.println("Common Year");
            sc.close();
  }    
}