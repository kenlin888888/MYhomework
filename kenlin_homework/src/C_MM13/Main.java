package C_MM13;

import java.util.Scanner;    
public class Main    
{    
  public static void main(String[] args)    
  {    
    Scanner sc = new Scanner(System.in);    
            int starthour = sc.nextInt();        
            int startmin = sc.nextInt(); 
            int endhour = sc.nextInt();        
            int endmin = sc.nextInt();
            int usehour,usemin,tothalfhour = 0;
            int halfmin = 0,amount = 0;
			if(endmin >= startmin){
            	usehour = endhour - starthour;
            	usemin = endmin - startmin;
            	}
            else{
            	usehour = endhour - starthour - 1;
            	usemin = endmin + 60 - startmin; 
            }
            if (usemin > 30){
            	tothalfhour = (usehour *2) + 2;}
            else{
            	if (usemin == 0)
            		tothalfhour = (usehour *2); 
            	else
            	    tothalfhour = (usehour *2) + 1;}                   	
            if (usehour >= 4)
            {
            	if (usemin == 30 || usemin == 0)
            	    amount = (tothalfhour - 8) * 60 + 280;
            	else
            	    amount = (tothalfhour - 8 - 1) * 60 + 280;
            }
            else{
            	if (usehour >= 2) 
            		amount = ((tothalfhour-4) * 40) + 120;
            	else
            		amount = tothalfhour * 30;
            }      
            System.out.println(amount); 
            sc.close();
  }    
}