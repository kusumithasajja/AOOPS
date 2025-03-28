package InLab2;

public class StudentGradesDemo {
    public static void main(String[] args) {
        StudentGradesManager manager = new StudentGradesManager();

        // Adding grades for students
        manager.addGrade(101, "A");
        manager.addGrade(102, "B+");
        manager.addGrade(101, "A-");
        manager.addGrade(103, "B");
        manager.addGrade(102, "A"); // Multiple grades for a student

        // Retrieving a student's grades
        System.out.println("Grades for Student 101: " + manager.getGrades(101));

        // Listing all student grades
        manager.listAllGrades();
    }
}