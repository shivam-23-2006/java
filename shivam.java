import java.util.Scanner;
public class shivam {
    public static void main(String[] args) {
        Scanner shivam = new Scanner(System.in);
        int age;
        System.out.println("what is your age");
        age = shivam.nextInt();

        if (age < 18){
            System.out.println("you are not allowed inside beacuse your age is" + " " + age);
        }
        else if(age>=18){
            System.out.println("welcome sir");
        }
        shivam.close();
         

    }
}
