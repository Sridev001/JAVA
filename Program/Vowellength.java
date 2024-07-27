import java.util.Scanner;
public class Vowellength
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,S2="",S3="";
String vow = "aeiouAEIOU";
char ch;
int length;

S1=input.nextLine();

length=S1.length();
for(int i=0;i<=length-1;i++)
{
ch = S1.charAt(i);
if(vow.indexOf(ch)!=-1)
{
S2=S2+ch;
}

}
System.out.println("Length of the vowel in a string is : "+S2.length());
}
}