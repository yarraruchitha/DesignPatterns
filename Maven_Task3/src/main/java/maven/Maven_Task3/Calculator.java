package maven.Maven_Task3;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
       int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        int result;
        switch(operator)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            
            default:
                System.out.printf("Enter valid data");
                return;
        }
        System.out.printf("%d %c %d = %d",a , operator, b, result);
    }
}