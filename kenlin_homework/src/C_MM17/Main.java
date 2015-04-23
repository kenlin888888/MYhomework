package C_MM17;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            int x=0,y=0,min,xmod,ymod,answer=0;
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (x > y)
            	min = y;
            else 
            	min = x;
            for (int i=1;i<=min;i++)
            {
            	xmod = x % i;
            	ymod = y % i;
            	if (xmod==0 && ymod==0)
            		answer = i;
            }
            System.out.println(answer);        
            sc.close();
  }    
}