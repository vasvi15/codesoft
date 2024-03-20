import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // 2. Calculate Total Marks: Sum up the marks obtained in all subjects
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // 3. Calculate Average Percentage: Divide the total marks by the total number of subjects
        double averagePercentage = (double) totalMarks / numSubjects;

        // 4. Grade Calculation: assign grades based on the average percentage achieved
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

        // 5. Display Results: Show the total marks, average percentage, and the corresponding grade
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}