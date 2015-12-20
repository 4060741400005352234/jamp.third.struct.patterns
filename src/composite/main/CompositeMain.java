package composite.main;

import composite.component.Employee;
import composite.component.impl.Developer;
import composite.component.impl.Manager;

public class CompositeMain {

    public static void main(String[] args) {

        Employee managerFred = new Manager("Fred");
        Employee developerJohn = new Developer("John", managerFred);
        Employee developerTim = new Developer("Tim", managerFred);
        Employee developerNick = new Developer("Nick");
        Employee developerDick = new Developer("Dick", developerNick);
//        if (managerFred.getComposite() != null) {
//            managerFred.addSubordinate(developerJohn);
//            managerFred.addSubordinate(developerTim);
//            //managerFred.addSubordinate(developerNick);
//        }
        developerNick.print();
        managerFred.print();

        managerFred.removeSubordinate(developerTim);
        managerFred.addSubordinate(developerDick);
        managerFred.print();

    }
}
