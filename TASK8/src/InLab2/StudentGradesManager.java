package InLab2;
import java.util.*;
class StudentGradesManager {
    private Map<Integer, Set<String>> studentGrades;

    public StudentGradesManager() {
        this.studentGrades = new HashMap<>();
    }

    // Add a grade for a student
    public void addGrade(int studentId, String grade) {
        studentGrades.putIfAbsent(studentId, new HashSet<>()); // Ensure student exists
        studentGrades.get(studentId).add(grade);
        System.out.println("Grade " + grade + " added for Student ID: " + studentId);
    }

    // Retrieve grades for a student
    public Set<String> getGrades(int studentId) {
        return studentGrades.getOrDefault(studentId, Collections.emptySet());
    }

    // List all students and their grades
    public void listAllGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No student grades available.");
            return;
        }
        System.out.println("Student Grades:");
        for (Map.Entry<Integer, Set<String>> entry : studentGrades.entrySet()) {
            System.out.println("ID " + entry.getKey() + ": " + entry.getValue());
        }
    }
}