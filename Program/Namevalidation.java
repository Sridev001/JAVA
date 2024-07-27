import java.util.Scanner;
public class Namevalidation
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String S1,S2="",S3="";
S1=input.nextLine();
int length,length2,length3;
char ch;

length=S1.length();
if(length>=4 && length<=20)
{
for(int i=0;i<length;i++)
{
ch=S1.charAt(i);
if(Character.isLetterOrDigit(ch))
{
S2=S2+ch;
}
else if(!Character.isLetterOrDigit(ch))
{
S3=S3+ch;
}
}
}

length2=S2.length();
length3=S3.length();

if(S2.length()==length)
{System.out.println("The given String is valid");}
else if(S3.length() > 0)
{System.out.println("The given String is invalid");}
}
}
