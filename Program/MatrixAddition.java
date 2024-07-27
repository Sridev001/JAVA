import java.util.Scanner;
public class MatrixAddition
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);

int n,m;
System.out.println("***Enter the Length of the Matrix***");
n=input.nextInt();
m=input.nextInt();
int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];

System.out.println("Enter the elements of A matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
a[i][j] = input.nextInt();
}
}

System.out.println("Enter the elements of B matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
b[i][j] = input.nextInt();
}
}

System.out.println("The C Matrix is");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
c[i][j] = a[i][j] + b[i][j];
System.out.print(""+c[i][j]);
System.out.print(" ");
}
System.out.println("");
}
}
}