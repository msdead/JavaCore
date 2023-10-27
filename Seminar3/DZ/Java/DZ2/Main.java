package DZ2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Дима", 30000));
        employees.add(new Employee("Маша", 35000));
        employees.add(new Employee("Анна", 45000));
        employees.add(new Employee("Денис", 80000));
        employees.add(new Employee("Тимур", 40000));
        employees.add(new Employee("Наташа", 50000));
    }

    public static void main(String[] args) {

        employees.add(new Supervisor("Андрей", 100000));

        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.println("1. Повысить зарплату всем сотрудникам\n" +
                "2. Повысить зарплату всем сотрудникам кроме руководителей\n" +
                "3. Показать список сотрудников и их ЗП\n" +
                "0. Выход из программы\n");
        int num = scanner.nextInt();
        while (num != 0) {
            if (num == 1) {
                for (Employee employee: employees){
                    employee.setSalary(employee.getSalary() + 500);
                }
                System.out.println("Всем сотрудникам повышена ЗП на 500р\n");
            }
            if (num == 2) {
                for (Employee employee: employees){
                    employee.salaryUp();
                }
            }
            if (num == 3) {
                Employee.info(employees);
            }
            System.out.println("1. Повысить зарплату всем сотрудникам\n" +
                    "2. Повысить зарплату всем сотрудникам кроме руководителей\n" +
                    "3. Показать список сотрудников и их ЗП\n" +
                    "0. Выход из программы\n");
            num = scanner.nextInt();

        }

    }
}