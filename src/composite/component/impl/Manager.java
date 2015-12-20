package composite.component.impl;

import composite.component.Employee;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee {

    private Set<Employee> subordinates = new HashSet<Employee>();

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, Employee parent) {
        super(name, parent);
    }

    @Override
    public boolean addSubordinate(Employee subordinate) {
        return subordinates.add(subordinate);
    }

    @Override
    public boolean removeSubordinate(Employee subordinate) {
        return subordinates.remove(subordinate);
    }

    @Override
    public Employee getComposite() {
        return this;
    }

    @Override
    public Set<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void print() {
        System.out.println("Manager - " + getName());
        System.out.println("Subordinates:");
        for (Employee employee : subordinates) {
            employee.print();
        }
    }
}
