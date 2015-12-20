package composite.component.impl;

import composite.component.Employee;

public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    public Developer(String name, Employee parent) {
        super(name, parent);
    }

    @Override
    public void print() {
        System.out.println("Developer - " + getName());
    }
}
