package C_CH01;
//C_CH01
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int keyin=scanner.nextInt();
		switch(keyin)
		{
			case 1: System.out.println("Person"); 
			break;
			case 2: System.out.println("Fairy");
			break;
			case 3: System.out.println("Dwarf"); 
			break;
		}
	scanner.close();
	}
}