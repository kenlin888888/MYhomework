package C_MM28;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            int x,i;
            x = sc.nextInt();
            for (i=1;i<=x;i++)          	
            	if (i % 5 == 0 && i % 7 == 0)
            		System.out.print(i+" ");
            sc.close();
  }    
}