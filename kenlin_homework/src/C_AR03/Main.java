package C_AR03;
import java.util.Scanner;  
//import java.lang.*;
public class Main {
  private static Scanner keyin;
  public static void main(String[] args){
	 	int[] orgarray = new int[6];
		keyin = new Scanner(System.in);
		for(int x=0;x<orgarray.length;x++){
		    orgarray[x] = keyin.nextInt();
		}
        int answer =0;
        int cube;
		for(int x=0;x<orgarray.length;x++){
			cube = orgarray[x]*orgarray[x]*orgarray[x];
			answer = answer + cube;
		}
		System.out.print(answer);
		keyin.close();
}
}