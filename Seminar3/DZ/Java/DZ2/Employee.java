package DZ2;

import java.util.List;

public class Employee {

    protected String name;
    protected int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    private void setName() {
        this.name = name;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void salaryUp() {
        this.salary = this.salary + 500;
        System.out.println(this.name + " ЗП повышена на 500р");
    }


    public static void info(List<Employee> list) {
        for (Employee employee: list){
            System.out.println(employee);
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + " " + "ЗП" + " " + this.salary;
    }
}
