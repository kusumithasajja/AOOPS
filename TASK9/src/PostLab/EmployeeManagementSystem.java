package PostLab;
import java.util.*;
import java.util.stream.*;


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "IT", 60000, 30),
            new Employee(2, "Bob", "HR", 50000, 25),
            new Employee(3, "Charlie", "IT", 70000, 35),
            new Employee(4, "David", "Finance", 80000, 40),
            new Employee(5, "Eve", "HR", 55000, 28)
        );

        // 1. Filtering employees by Department (e.g., "IT")
        System.out.println("Employees in IT department:");
        employees.stream()
                 .filter(emp -> "IT".equals(emp.getDepartment()))
                 .forEach(System.out::println);

        // 2. Sorting employees by salary in descending order
        System.out.println("\nEmployees sorted by salary (descending):");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                 .forEach(System.out::println);

        // 3. Group employees by department
        System.out.println("\nEmployees grouped by department:");
        Map<String, List<Employee>> groupedByDept = employees.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        // 4. Find the highest-paid employee
        System.out.println("\nEmployee with highest salary:");
        employees.stream()
                 .max(Comparator.comparingDouble(Employee::getSalary))
                 .ifPresent(System.out::println);

        // 5. Calculate the average salary of employees in a department
        String targetDept = "HR";
        double avgSalary = employees.stream()
                                    .filter(emp -> targetDept.equals(emp.getDepartment()))
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0.0);
        System.out.println("\nAverage salary in " + targetDept + " department: " + avgSalary);

        // 6. List the names of employees who earn more than a specified amount
        double salaryThreshold = 55000;
        System.out.println("\nEmployees earning more than " + salaryThreshold + ":");
        employees.stream()
                 .filter(emp -> emp.getSalary() > salaryThreshold)
                 .map(Employee::getName)
                 .forEach(System.out::println);
    }
}
