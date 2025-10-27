import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstnumber, secondnumber;
        
        System.out.print("Enter your first number: ");
        firstnumber = sc.nextInt();
        
        System.out.print("Enter your second number: ");
        secondnumber = sc.nextInt();

        System.out.println("\n--- Calculator Operations ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        
        int choice = sc.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = firstnumber + secondnumber;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = firstnumber - secondnumber;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = firstnumber * secondnumber;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (secondnumber != 0) {
                    result = (double) firstnumber / secondnumber;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
