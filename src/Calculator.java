import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = input.nextDouble();

        // Choose an operator
        System.out.print("Enter an operator: (+, -, *, /) ");
        char operator = input.next().charAt(0);

        System.out.print("Enter a second number: ");
        double num2 = input.nextDouble();

        double total = 0.0;

        switch (operator)
        {
            case '+':
                total = num1 + num2;
                System.out.println("Result: " + total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println("Result: " + total);
                break;
            case '*':
                total = num1 * num2;
                System.out.println("Result: " + total);
                break;
            case '/':
                if (num1 != 0 && num2 != 0) {
                    total = num1 / num2;
                    System.out.println(total);
                }
                else {
                    System.out.println("Result: 0");
                }
                break;
            default:
                System.out.println("Error. Invalid operator: ");
                break;
        }
    }
}
