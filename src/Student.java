import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a single student, holding their name and a list of grades.
 */
public class Student {
    private String name;
    private List<Double> grades;

    /**
     * Constructs a new Student with a name and an empty list of grades.
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    /**
     * Gets the name of the student.
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a grade to the student's list of grades.
     * @param grade The grade to add.
     */
    public void addGrade(double grade) {
        if (grade >= 0) {
            grades.add(grade);
        }
    }

    /**
     * Gets the list of grades for the student.
     * @return A list of grades.
     */
    public List<Double> getGrades() {
        return grades;
    }

    /**
     * Calculates the average of the student's grades.
     * @return The average grade, or 0.0 if there are no grades.
     */
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    /**
     * Finds the highest grade for the student.
     * @return The highest grade, or 0.0 if there are no grades.
     */
    public double getHighestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        return Collections.max(grades);
    }

    /**
     * Finds the lowest grade for the student.
     * @return The lowest grade, or 0.0 if there are no grades.
     */
    public double getLowestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        return Collections.min(grades);
    }
}