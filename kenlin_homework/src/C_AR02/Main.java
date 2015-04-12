package C_AR02;

import java.util.Scanner;
public class Main {
public static void main(String[] args) 
{
int [] ArrayNum ={0,0,0,0,0,0};
Scanner sc = new Scanner(System.in);

StringBuilder s=new StringBuilder("");
for (int i=0; i<ArrayNum.length;i++)
{
ArrayNum[i]=sc.nextInt(); 
}
for(int i=ArrayNum.length-1;i>=0;i--)
{
if (i ==0)
{s.append(ArrayNum[i]);}
else
{s.append(ArrayNum[i]+" ");}
}
sc.close();
System.out.println(s);
}
}