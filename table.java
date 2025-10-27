import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table;
        System.out.print("Enter the limit for tables: ");
        table = sc.nextInt();

        System.out.println("\n--- Even Tables ---");
        for (int i = 2; i <= table; i += 2) {  // Even tables
            System.out.println("\nTable of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        System.out.println("\n--- Odd Tables ---");
        for (int i = 1; i <= table; i += 2) {  // Odd tables
            System.out.println("\nTable of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        sc.close();
    }
}
