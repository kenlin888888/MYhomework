package C_CH04;
//C_CH04
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int keyin = scanner.nextInt();
		if (keyin >= 90 && keyin < 101)
			System.out.println("A"); 
		else if (keyin >= 80 && keyin < 90)
			System.out.println("B"); 
		else if (keyin >= 70 && keyin < 80)
			System.out.println("C"); 
		else if (keyin >= 60 && keyin < 70)
			System.out.println("D");
		else if (keyin < 60)
			System.out.println("E"); 
		else
			System.out.println("error"); 
	scanner.close();
	}
}