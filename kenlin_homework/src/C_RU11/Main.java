package C_RU11;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
int steps=sc.nextInt(); 
sc.close();
long v1 = 2;
long v2 = 2;
long result =steps;
for (int i = 3; i <= steps; ++i)
{
result = v2 + v1;
v1 = v2;
v2 = result;
}
System.out.println(result);
}
}