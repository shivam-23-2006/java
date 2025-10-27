import java.util.Scanner;

    public class Main {
        public static void main(String [] args ) {
            
                Scanner shivam = new Scanner(System.in);
                   float firstnumber , secondnumber , answer;
                   System.out.println("enter firts number: ");
                   firstnumber = shivam.nextFloat();
                   System.out.println("enter second number: ");
                   secondnumber = shivam.nextFloat();
                   answer = firstnumber + secondnumber;
                   System.out.println(answer);
                   shivam.close();
    }
}