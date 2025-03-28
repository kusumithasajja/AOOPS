package InLab1;

import java.util.*;
import java.util.function.Predicate;
public class CoffeeShopSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Employee1", 30, 5, 5000),
            new Employee("Employee2", 28, 4, 4500),
            new Employee("Employee3", 26, 3, 4000),
            new Employee("Employee4", 24, 1, 3500),
            new Employee("Employee5", 22, 0, 3000)
        );

        // Sorting employees by experience (Descending Order)
        employees.sort((e1, e2) -> Integer.compare(e2.experience, e1.experience));

        // Predicate to filter employees with experience > 2 years
        Predicate<Employee> eligibleForBonus = e -> e.experience > 2;

        // Distribute salaries and apply bonus
        for (Employee e : employees) {
            double bonus = eligibleForBonus.test(e) ? e.salary * 0.10 : 0; // 10% bonus if eligible
            System.out.println(e.name + " receives salary: $" + e.salary + " + Bonus: $" + bonus);
        }
    }
}
