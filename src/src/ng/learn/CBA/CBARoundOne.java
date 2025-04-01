/*
package ng.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CBA {

    public static void main(String[] args) {
        List<String> addList = new ArrayList<>();
        addList.add("line1");
        addList.add("line2");
        addList.add("line3");
        ng.learn.genpact.Employee e1 = new ng.learn.genpact.Employee(1, "aaa", 1000.00, addList);
        ng.learn.genpact.Employee e2 = new ng.learn.genpact.Employee(2, "aaa", 1400.00, addList);
        ng.learn.genpact.Employee e3 = new ng.learn.genpact.Employee(3, "aaa", 1600.00, addList);
        ng.learn.genpact.Employee e4 = new ng.learn.genpact.Employee(4, "aaa", 1900.00, addList);

        System.out.println(e1.getAddress());
        addList.add("lin4");
        System.out.println(e1.getAddress());
        */
/*List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        Collections.sort(empList, Comparator.comparingDouble(Employee::getSal).reversed());
        List<Predicate<Employee>> predicateList = new ArrayList<>();
        predicateList.add(emp -> emp.getSal() >=1400);
        predicateList.add(emp -> emp.getSal() <=1600);

        Predicate<Employee> employeePredicate = predicateList.stream().reduce(emp -> true, Predicate::and);

        List<Employee> salRangeList = empList.stream()
                        .filter(employeePredicate)
                        .collect(Collectors.toList());
        for(Employee  emp : salRangeList){
            System.out.println(emp);
        }*//*



    }
    static Predicate<ng.learn.genpact.Employee> leftSalPredicate = new Predicate<ng.learn.genpact.Employee>() {
        @Override
        public boolean test(ng.learn.genpact.Employee employee) {
            return employee.getSal()  >=1400;
        }
    };

    static Predicate<ng.learn.genpact.Employee> rightSalPredicate = new Predicate<ng.learn.genpact.Employee>() {
        @Override
        public boolean test(ng.learn.genpact.Employee employee) {
            return employee.getSal()  <= 1600;
        }
    };
}
*/
