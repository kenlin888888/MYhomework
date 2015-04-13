package C_CH03;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int keyin=scanner.nextInt();
int result= keyin%2;
switch(result)
{
	case 0: System.out.println("even"); 
	break;
	case 1: System.out.println("odd");
	break;
}
scanner.close();
}
}