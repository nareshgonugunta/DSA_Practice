package ng.learn.genpact;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeOne {

    private String name;
    private LocalDate doj;
    private String deptName;

    public EmployeeOne(String name, String doj, String deptName) {
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
