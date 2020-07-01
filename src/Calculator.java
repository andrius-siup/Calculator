import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter a second number: ");
        double num2 = input.nextDouble();

        // Choose an operator
        System.out.print("Enter an operator: (+, -, *, /) ");
        char operator = input.next().charAt(0);

        double total = 0.0;

        switch (operator)
        {
            case '+':
                total = num1 + num2;
                System.out.println(total);
                break;
            case '-':
                total = num1 - num2;
                System.out.println(total);
                break;
            case '*':
                total = num1 * num2;
                System.out.println(total);
                break;
            case '/':
                total = num1 / num2;
                break;
            default:
                System.out.println("Error. Please enter a number: ");
                break;
        }
    }
}
