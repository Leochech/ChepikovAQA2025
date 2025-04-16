package src.main;

import lombok.Getter;

@Getter
public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + ", " + "за " + salary);
    }

}
