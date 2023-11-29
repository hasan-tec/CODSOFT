import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Maths marks: ");
        double maths = input.nextDouble();

        System.out.println("Enter Physics marks: ");
        double phys = input.nextDouble();

        System.out.println("Enter Chemistry marks: ");
        double chem = input.nextDouble();

        double total = chem + maths + phys;
        double percentage = (total / 300)*100;

        char grade = calculateGrade(percentage);

        System.out.println("The total marks are: " + total + "\nPercentage is: " + percentage + "\nYour Grade is: " + grade);
    }

    public static char calculateGrade(double averagePercentage) {
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
