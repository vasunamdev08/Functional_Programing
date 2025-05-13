package level5.q34CountByDepartment;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessDepartment {
    public static void main(String[] args) {
        List<Employee> employees     = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 70000),
                new Employee("Diana", "IT", 80000));

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, empList) -> {
                    System.out.println(department + " -> " + empList.size()+" with average salary: " +
                            empList.stream().mapToDouble(Employee::getSalary).average().orElse(0));
                });

    }
}
