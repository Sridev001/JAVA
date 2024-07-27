import java.util.Scanner;
public class Arraymax
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n,max,min;
System.out.println("**Enter the length of array**");
n=input.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
}
max=arr[0];
min=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>max)
{max=arr[i];}
if(arr[i]<min)
{min=arr[i];}
}
System.out.println("The Max value in a Array is : "+max);
System.out.println("The Min value in a Array is : "+min);
}
}