package facade.main;

import model.Company;
import model.Employee;

public class FacadeMain {

    public static void main(String[] args) {
        HRFacade facade = HRFacade.getInstance();
        try {
            Employee firedEmployee = facade.getEmployee("1");
            Company epam = facade.getCompany("1");
            if (firedEmployee != null && epam != null) {
                facade.fireEmployee(firedEmployee, epam);
            }
            Employee nick = new Employee("2", "Nick");
            Company microsoft = facade.getCompany("2");
            if (microsoft != null) {
                facade.hireEmployee(nick, microsoft);
            }
        } catch (Exception e) {
            // TODO Logger
            e.printStackTrace();
        }
    }
}
