package N_RU07;
import java.util.Scanner;
public class Main{
	static double t0;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int temp = sc.nextInt();
	
	String instr;
	instr = sc.next();
	String[] inarr = instr.split(",");
	int t0 = Integer.valueOf(inarr[0]);
	int n = Integer.valueOf(inarr[1]);
	System.out.println(t(n));
	
	//for(int i=0;i<temp*2;i++)
	//int n= inarr[0];
	
		
	
	//inarr = instr.split(",");
	//String[][] outarr = new String[temp][];
	
	/*for(int i=0;i<temp*2;i++)
		instr = sc.next();
		String[] inarr = instr.split(",");
		inarr[i] = sc.next();*/
	    
	
	//for(int i=0;i<temp*2;i++){
		
	//}
	//	System.out.println(inarr[i]);
	
	//int answer = f(facr);
	//System.out.println(answer);
	sc.close();
	}
	
	public static double t(int n){
		if (n==0)
			return t0;
		else
			return ((t(n-1) + (n * 2.71828)));
	}
}