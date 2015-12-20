package composite.component;

import java.util.HashSet;
import java.util.Set;

public abstract class Employee {

    protected Employee(String name) {
        this.name = name;
    }

    protected Employee (String name, Employee parent) {
        if (parent != null && parent.getComposite() != null) {
            parent.addSubordinate(this);
        }
        this.name = name;
        this.parent = parent;
    }

    private String name;
    private Employee parent;

    // Для несоставных объектов возвращает пустую коллекцию подчиненных (Leaf не может содержать потомков)
    public Set<Employee> getSubordinates() {
        return new HashSet<Employee>();
    }

    // Для проверки того, что данный Employee - составной объекет
    // и на нем можно безопасно выполнять методы работы с подчиненными
    public Employee getComposite() {
        return null;
    }

    // Leaf не поддерживает данную операцию
    // Для безопасности можно использовать метод getComposite(),
    // который возвращает составной объект, если таковыйм является
    public boolean addSubordinate(Employee subordinate) {
        throw new UnsupportedOperationException("Operation does not supported.");
    }

    // Leaf не поддерживает данную операцию
    // Для безопасности можно использовать метод getComposite(),
    // который возвращает составной объект, если таковыйм является
    public boolean removeSubordinate(Employee subordinate) {
        throw new UnsupportedOperationException("Operation does not supported.");
    }

    public String getName() {
        return name;
    }

    public Employee getParent() {
        return parent;
    }

    public abstract void print();
}
