package C_MM08;
import java.util.Scanner;    
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in);    
            int side1 = sc.nextInt();        
            int side2 = sc.nextInt();        
            int sum = side1 + side2;   
            int answer=(int)Math.pow(sum,2);   
            System.out.println(answer);        
  }    
}