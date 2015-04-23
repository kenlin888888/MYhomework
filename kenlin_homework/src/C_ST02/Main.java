package C_ST02;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0 && n<100){
        	 Scanner sc1 = new Scanner(System.in);
        	 String[] s = new String[256];
        	 for(int i=0;i<n;i++)
             {
             	 String x=sc1.nextLine();
             	 //while(x.length()<256)
             	 //{s[i]=x;}
             	 s[i]=x;
             }
             for(int i=0;i<n;i++)
             {
            	StringBuffer sb = new StringBuffer(s[i]);
            	sb.reverse();
              	System.out.println(sb);
             }              	
        }
    }
}