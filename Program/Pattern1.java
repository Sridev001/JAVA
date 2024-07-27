import java.util.Scanner;
public class Pattern1
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n;
System.out.println("Enter the length : ");
n=input.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
System.out.print("  ");
}
System.out.println("");
}

}
}