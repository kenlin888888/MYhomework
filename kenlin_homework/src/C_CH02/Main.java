package C_CH02;
//C_CH02
import java.util.Scanner;
import java.lang.String;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	char keyin=(char) scanner.next().charAt(0);
	//char keyin=scanner.next();
	
		switch(keyin)
		{
			case 'E': System.out.println("ByeBye"); 
			break;
			case 'M': System.out.println("Male");
			break;
			case 'F': System.out.println("Female"); 
			break;
		}
	scanner.close();
	}
}