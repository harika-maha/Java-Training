import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Student Management System!");
        System.out.println("Please select a function to perform:");
        System.out.println("1. Grade checking");
        System.out.println("2. Student details");
        System.out.println("3. Mathematical calculations");
        while(true){
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                gradeChecking();
                break;
            case 2:
                studentDetails();
                break;
            case 3:
                mathCalculations();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}

    public static void gradeChecking() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = input.nextInt();

        if (marks >= 35) {
            System.out.println("Congratulations, the student has passed!");
        } else {
            System.out.println("Sorry, the student has failed.");
        }
    }

    public static void studentDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = input.nextLine();

        System.out.print("Enter the student's age: ");
        int age = input.nextInt();

        System.out.print("Enter the student's grade: ");
        int grade = input.nextInt();

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void mathCalculations() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select a calculation to perform:");
        System.out.println("1. Calculate percentage");
        System.out.println("2. Calculate interest");

        int choice = input.nextInt();
        switch (choice) {
            case 1: 
                System.out.print("Enter the total marks: ");
                int totalMarks = input.nextInt();

                System.out.print("Enter the obtained marks: ");
                int obtainedMarks = input.nextInt();

                int percentage = (obtainedMarks / totalMarks) * 100;
                System.out.println("Percentage: " + percentage + "%");
                break;
            case 2:
                System.out.print("Enter the principal amount: ");
                double principal = input.nextDouble();

                System.out.print("Enter the interest rate: ");
                double rate = input.nextDouble();

                System.out.print("Enter the time period: ");
                double time = input.nextDouble();

                double interest = (principal * rate * time) / 100;
                System.out.println("Interest: " + interest);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
