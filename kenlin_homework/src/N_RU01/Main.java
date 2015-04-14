package N_RU01;
import java.math.BigInteger;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int facr=sc.nextInt();
sc.close();

BigInteger num = new BigInteger("1");
for (int i=1;i<=facr;i++)
{
num=num.multiply(new BigInteger(String.valueOf(i)));
}
System.out.println(num);
}
}