import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name , dept ;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your dept: ");
        dept = sc.nextLine();
        int register_no , marks, year ;
        System.out.print("Enter your reg no: ");
        register_no = sc.nextInt();
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();
        System.out.print("Enter your Year:");
        year = sc.nextInt();
        
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Register No: " + register_no);
        System.out.println("Year: " + year);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

    sc.close();
    }
}
