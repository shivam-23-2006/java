import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print :");
        int num = sc.nextInt();
        int fact =1;
        for (int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("the facorial of Given number is "+fact);
        sc.close();
    }
}
 