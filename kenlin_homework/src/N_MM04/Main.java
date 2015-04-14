package N_MM04;
import java.util.Scanner;  
public class Main    
{    
	public static void main(String[] args)    
	{     
	    Scanner keyin = new Scanner(System.in);  
	        int a =keyin.nextInt();  
	        int b =keyin.nextInt();
	        if(a == 0 || b == 0){
	        	System.out.println("pause");
	        	}
	        else{	      
		        System.out.printf("%d+%d=%d\n",a,b,a+b);
		        System.out.printf("%d*%d=%d\n",a,b,a*b);
		        System.out.printf("%d-%d=%d\n",a,b,a-b);        
		        System.out.printf("%d/%d=%d...%d\n",a,b,a/b,a%b);	
	            }	  
	    keyin.close();  
	    }    
}  