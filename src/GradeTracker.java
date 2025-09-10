import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Manages the collection of students and provides a console interface
 * for interacting with the grade tracking system.
 */
public class GradeTracker {
    private List<Student> students;
    private Scanner scanner;

    /**
     * Constructs a new GradeTracker with an empty list of students.
     */
    public GradeTracker() {
        this.students = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the main application loop and displays the menu.
     */
    public void start() {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displaySummaryReport();
                        break;
                    case 3:
                        System.out.println("Exiting Student Grade Tracker. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                choice = 0; // Reset choice to continue the loop
            }
            System.out.println(); // Add a blank line for readability
        } while (choice != 3);
    }

    /**
     * Displays the main menu options to the console.
     */
    private void displayMenu() {
        System.out.println("--- Student Grade Tracker Menu ---");
        System.out.println("1. Add a new student and their grades");
        System.out.println("2. Display summary report for all students");
        System.out.println("3. Exit");
        System.out.println("------------------------------------");
    }

    /**
     * Prompts the user to add a new student's name and grades.
     */
    private void addStudent() {
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        Student student = new Student(name);

        System.out.println("Enter grades for " + name + ". Type -1 to finish.");
        double grade;
        while (true) {
            System.out.print("Enter grade: ");
            try {
                grade = scanner.nextDouble();
                if (grade == -1) {
                    break;
                }
                if (grade < 0) {
                    System.out.println("Grade cannot be negative. Please try again.");
                    continue;
                }
                student.addGrade(grade);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for the grade.");
                scanner.next(); // Clear the invalid input
            }
        }
        students.add(student);
        System.out.println("Student " + name + " and their grades have been added.");
    }

    /**
     * Displays a formatted summary report for all students.
     */
    private void displaySummaryReport() {
        System.out.println("\n--- Grade Summary Report ---");
        if (students.isEmpty()) {
            System.out.println("No students have been added yet.");
        } else {
            for (Student student : students) {
                System.out.println("----------------------------");
                System.out.println("Student: " + student.getName());
                if(student.getGrades().isEmpty()){
                    System.out.println("  No grades entered.");
                } else {
                    System.out.println("  Grades: " + student.getGrades());
                    System.out.printf("  Average Grade: %.2f\n", student.getAverageGrade());
                    System.out.printf("  Highest Grade: %.2f\n", student.getHighestGrade());
                    System.out.printf("  Lowest Grade:  %.2f\n", student.getLowestGrade());
                }
            }
        }
        System.out.println("----------------------------");
    }
}
