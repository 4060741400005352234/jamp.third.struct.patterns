package facade;

import facade.main.db.AbstractDAO;
import facade.main.db.ConnectionManager;
import facade.main.db.impl.CompanyDAO;
import facade.main.db.impl.EmployeeDAO;
import facade.main.db.impl.OracleConnectionManager;
import model.Company;
import model.Employee;

import java.sql.Connection;
import java.sql.SQLException;

public class HRFacade {

    private AbstractDAO<Employee> employeeDAO;
    private AbstractDAO<Company> companyDAO;
    private ConnectionManager oracleCM;

    private HRFacade() {
        oracleCM = OracleConnectionManager.getInstance();
        employeeDAO = new EmployeeDAO();
        companyDAO = new CompanyDAO();
    }

    public Employee getEmployee(String id) throws SQLException {
        Connection connection = oracleCM.getConnection();
        try {
            return employeeDAO.find(id, connection);
        } finally {
            connection.close();
        }
    }

    public Company getCompany(String id) throws SQLException {
        Connection connection = oracleCM.getConnection();
        try {
            return companyDAO.find(id, connection);
        } finally {
            connection.close();
        }
    }

    public void fireEmployee(Employee firedEmployee, Company fromCompany) throws SQLException {
        Connection connection = oracleCM.getConnection();
        try {
            connection.setAutoCommit(false);
            Company company = companyDAO.find(fromCompany.getId(), connection);
            company.getEmployees().remove(firedEmployee);
            companyDAO.update(company, connection);
            employeeDAO.delete(firedEmployee, connection);
            connection.commit();
        } finally {
            connection.setAutoCommit(true);
            connection.close();
        }
    }

    public void hireEmployee(Employee hiredEmployee, Company toCompany) throws SQLException {
        Connection connection = oracleCM.getConnection();
        try {
            connection.setAutoCommit(false);
            employeeDAO.save(hiredEmployee, connection);
            Company company = companyDAO.find(toCompany.getId(), connection);
            company.getEmployees().add(hiredEmployee);
            companyDAO.update(company, connection);
            connection.commit();
        } finally {
            connection.setAutoCommit(true);
            connection.close();
        }
    }

    public static HRFacade getInstance() {
        return OracleDBFacadeHolder.INSTANCE;
    }

    private static class OracleDBFacadeHolder {
        private static HRFacade INSTANCE = new HRFacade();
    }
}
