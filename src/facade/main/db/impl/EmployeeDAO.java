package facade.main.db.impl;

import facade.main.db.AbstractDAO;
import model.Employee;

import java.sql.Connection;
import java.util.List;

public class EmployeeDAO implements AbstractDAO<Employee> {

    @Override
    public void save(final Employee obj, final Connection connection) {

    }

    @Override
    public Employee find(final String id, final Connection connection) {
        return null;
    }

    @Override
    public List<Employee> findAll(final Connection connection) {
        return null;
    }

    @Override
    public void update(final Employee obj, final Connection connection) {

    }

    @Override
    public void delete(final Employee obj, final Connection connection) {

    }
}
