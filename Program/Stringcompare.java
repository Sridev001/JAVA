import java.util.Scanner;
public class Stringcompare
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,S2;

S1=input.nextLine();
S2=input.nextLine();


System.out.println("The length of S1 is : "+S1.length());
System.out.println("The length of S2 is : "+S2.length());

int b = S1.compareTo(S2);
if(b==0)
{System.out.println("String 1 & 2 are equal");}
else if(b>0)
{System.out.println("String 1 Greater");}
else if(b<0)
{System.out.println("String 2 Greater");}
}
}