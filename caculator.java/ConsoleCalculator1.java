import java.util.Scanner;

public class ConsoleCalculator1 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 0;

        System.out.println("=== Java Console Calculator ===");

        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
                default: System.out.println("Invalid operator!"); continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
        scanner.close();
    }
}
