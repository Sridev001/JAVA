import java.util.Scanner;
public class Pattern3
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter the length of * to print : ");
n=input.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
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