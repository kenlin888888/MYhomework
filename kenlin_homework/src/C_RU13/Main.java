package C_RU13;
import java.util.Scanner;
public class Main { 
  public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int end;
        do{
	        int num = keyin.nextInt();
	        if(num != -1){
	        	if(0<num && num<46){
	        		long total = 1;
	        		for(int i=1;i<num;i++)
	        			total += fib(i);
	            	System.out.println(total);
	        	}
	        	else
	        		System.out.println("Please input number 1 to 45");
	        	    break;
	        }
	        end = num;
	        System.out.println("num is "+end);
        } while(end != -1);
  }
  public static long fib(int n){
	     if (n==1 || n==2)
	      return 1;
	     else
	      return fib(n-1)+fib(n-2);
	    } 
}