package C_RU011;

import java.util.Scanner;
public class Main { 
  public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int num = keyin.nextInt();
        while(0<num && num<500){
        	double a = 1;
        	for (int y = 1; y <= num; y++) {
        	a *= y;
        	}
        	System.out.println(a);
        	break;
        }
        
  }
}
