import java.util.Scanner;
public class Pattern4
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter the length of * to print : ");
n=input.nextInt();

for(int i=n;i>=1;i--)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println("");
}

}
}