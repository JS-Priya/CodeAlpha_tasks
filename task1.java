import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = (double) total / n;

        System.out.println("\n========== STUDENT REPORT ==========");

        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + names[i]);
            System.out.println("Marks: " + marks[i]);

            if (marks[i] >= 90)
                System.out.println("Grade: A");
            else if (marks[i] >= 80)
                System.out.println("Grade: B");
            else if (marks[i] >= 70)
                System.out.println("Grade: C");
            else if (marks[i] >= 50)
                System.out.println("Grade: D");
            else
                System.out.println("Grade: F");

            if (marks[i] >= 50)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");

            System.out.println("----------------------------");
        }

        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("Average Marks : " + average);

        sc.close();
    }
}