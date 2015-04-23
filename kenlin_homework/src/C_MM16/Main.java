package C_MM16;
import java.util.Scanner;    
public class Main {    
public static void main(String[] args) {    
       Scanner sc = new Scanner(System.in);    
       int x= sc.nextInt();    
       int y= sc.nextInt();    
       if( x>=0 && x<=100 && 0<=y && y<=100){    
       System.out.println( "inside");    
       }    
       else{    
         System.out.println("outside");    
       }    
       sc.close();
    }    
 
}  
