import java.util.Scanner;
public class Specialchlength
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,S2="";
char ch;
int length,count=0;

S1=input.nextLine();

length=S1.length();
for(int i=0;i<=length-1;i++)
{
ch = S1.charAt(i);
if(!Character.isLetterOrDigit(ch))
{
S2=S2+ch;
count++;
}
}
System.out.println("Special character in a String : "+count);
//System.out.println("Length of the vowel in a string is : "+S2.length());
}
}