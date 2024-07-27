public class ArthimetricException
{
public static void main(String args[])
{
int numerator = 10;
int denominator = 0;
int result;

try 
{
result = numerator / denominator;
System.out.println("Result: " + result);
} 
catch (ArithmeticException e) 
{
System.out.println("Error");
}
System.out.println("Program continues after exception handling.");
}
}

