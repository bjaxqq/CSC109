import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Operation: addition (+), subtraction (-), multiplication (*), division (/): ");
        String operation = scanner.next();
        
        if (operation.equals("+")) {
            double sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } else if (operation.equals("-")) {
            double difference = num1 - num2;
            System.out.println("Difference: " + difference);
        } else if (operation.equals("*")) {
            double product = num1 * num2;
            System.out.println("Product: " + product);
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                double quotient = num1 / num2;
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Error: Divide by Zero");
            }
        } else {
            System.out.println("Invalid operation"); // Forgot to mention in commit message
        }
        
        scanner.close();
    }
}
