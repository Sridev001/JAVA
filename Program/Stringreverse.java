import java.util.Scanner;
public class Stringreverse
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,rev="";
int length;
char ch;
S1=input.nextLine();
length = S1.length();

for(int i=length-1;i>=0;i--)
{
ch=S1.charAt(i);
rev=rev+ch;
}
System.out.println("Reverse of the String is : "+rev);
}
}