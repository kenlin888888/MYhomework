package C_ST03;
import java.util.Scanner;
public class Main {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num1 =0;
num1 = sc.nextInt();
String aChar = new Character((char)num1).toString();
System.out.println(aChar); 
sc.close();
}
}