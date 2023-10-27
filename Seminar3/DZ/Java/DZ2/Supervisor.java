package DZ2;

import java.util.List;

public class Supervisor extends Employee{

    Supervisor(String name, int salary) {
        super(name, salary);
    }

    @Override
     public void salaryUp() {
        System.out.println(this.name + " ЗП без изменений\n");
    }
}
