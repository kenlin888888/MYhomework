package C_MM11;
import java.util.Scanner;
public class Main 
{ 
public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in);
int total=sc.nextInt();
int ten= total/10;
int tenMod= total%10;
int five=tenMod/5;
int fiveMod= tenMod%5;
sc.close();
System.out.println("NT10="+ten);
System.out.println("NT5="+five);
System.out.println("NT1="+fiveMod);
} 
}