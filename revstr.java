import java.util.*;

public class revstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string to be reversed : ");
        String revstr = sc.nextLine();
        String reversed = new StringBuilder(revstr).reverse().toString();
        System.out.println("the reversed string is :" + reversed);
        sc.close();
    }
}
