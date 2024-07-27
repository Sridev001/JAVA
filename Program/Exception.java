import java.util.Scanner;

public class ArithmeticOperations 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the first number:");
double num1 = scanner.nextDouble();

System.out.println("Enter the operator (+, -, *, /):");
String operator = scanner.next();

System.out.println("Enter the second number:");
double num2 = scanner.nextDouble();

double result = 0;

switch (operator) 
{
case "+":
result = num1 + num2;
break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator. Only +, -, *, / are allowed.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}


This program prompts the user to enter two numbers and an operator (+, -, *, /). It then performs the specified operation and displays the result.