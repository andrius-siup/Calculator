import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input first number
        System.out.print("Enter a number: ");
        double number1 = input.nextDouble();

        // input operator
        System.out.print("Enter a operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        // input a second number
        System.out.print("Enter a second number: ");
        double number2 = input.nextDouble();

        double total;
        switch (operator)
        {
            case '+':
                total = number1 + number2;
                System.out.println("Result: " + total);
                break;
            case '-':
                total = number1 - number2;
                System.out.println("Result: " + total);
                break;
            case '*':
                total = number1 * number2;
                System.out.println("Result: " + total);
                break;
            case '/':
                total = number1 / number2;
                System.out.println("Result: " + total);
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
