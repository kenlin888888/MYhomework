package C_MM19;
import java.math.BigDecimal;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in); 
            int keyin=0;
			double answer=0;
            keyin = sc.nextInt();           
            if (keyin >= 1500)
            	answer = keyin * 0.9 * 0.79;
            else
            	if (keyin > 800)
            		answer = keyin * 0.9 * 0.9;
            	else
            		answer = keyin * 0.9;
            double yes = new BigDecimal(answer).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(yes);        
            sc.close();
  }    
}