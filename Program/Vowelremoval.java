import java.util.Scanner;
public class Vowelremoval
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,S2="";
String vow = "aeiouAEIOU";
char ch;
int length;

S1=input.nextLine();

length=S1.length();
for(int i=0;i<=length-1;i++)
{
ch = S1.charAt(i);
if(vow.indexOf(ch)==-1)
{
S2=S2+ch;
}
}
System.out.println("Vowel removed String : "+S2);
}
}