package C_MM14;
import java.util.Scanner;
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in);    
            int time = sc.nextInt();            
            int days = time /(24*60*60);
            time = time % (24*60*60);
            int hours = time / (60*60);
            time = time % (60*60);
            int minutes = time / 60;
            time = time % 60;
            int seconds = time;
            System.out.println(days+" days"); 
            System.out.println(hours+" hours"); 
            System.out.println(minutes+" minutes");
            System.out.println(seconds+" seconds");
            sc.close();
  }    
}