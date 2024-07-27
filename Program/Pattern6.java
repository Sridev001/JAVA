import java.util.Scanner;
public class Pattern6
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter the length of * to print : ");
n=input.nextInt();
n=n/2+1;

for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println("");
}

for(int i=n-1;i>=1;i--)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println("");
}

}
}