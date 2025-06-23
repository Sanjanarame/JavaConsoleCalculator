import java.util.Scanner;

public class Calculator {

    // Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division with zero handling
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n(Day-01) Basic Calculator ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 4){
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                
                double result = 0;

                switch(choice){
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                }
                System.out.println("Result: " + result);
            } else if(choice != 5){
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while(choice != 5);
        
        System.out.println("Calculator closed. Thank you!");
        sc.close();
    }
}
