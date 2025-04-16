package src.main;


public class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " разработчик, " + "за " + getSalary());
    }
}
