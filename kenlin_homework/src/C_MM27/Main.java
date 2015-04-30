package C_MM27;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            int x=0,y=0,min,xmod,ymod,answer=0;
            x = sc.nextInt();
            y = sc.nextInt();
            int sum = 0;
            if( x > y)
               sum = (x + y) * (x - y + 1) / 2;
            else
               sum = (x + y) * (y - x + 1) / 2;
            System.out.println(sum);        
            sc.close();
  }    
}