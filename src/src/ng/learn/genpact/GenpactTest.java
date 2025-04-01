package ng.learn.genpact;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenpactTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("james","10/01/2020",	"sales");
        Employee e2 = new Employee("john", "15/01/2021",  "research");
        Employee e3 = new Employee("dennis", "10/12/2018",  "sales");
        Employee e4 = new Employee("smith", "20/05/2024",  "research");
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        List<Employee> sortedEmployeeBySal = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDoj))
                .collect(Collectors.toList());
        sortedEmployeeBySal.forEach(System.out::println);


        Map<String, Employee> findSeniorEmpByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getDoj)),
                                                                            employee -> employee.orElse(null))
                        )

                );
        System.out.println(findSeniorEmpByDept);

        Map<String, Employee> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getDoj).reversed()), emp -> emp.orElse(null))));
        System.out.println(collect);

    }

}


class Employee{
    private String name;
    private LocalDate doj;
    private String deptName;

    public Employee(String name, String doj, String deptName) {
        this.name = name;
        this.deptName = deptName;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.doj = LocalDate.parse(doj, dateTimeFormatter);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}