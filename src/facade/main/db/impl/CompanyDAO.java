package facade.main.db.impl;

import facade.main.db.AbstractDAO;
import model.Company;

import java.sql.Connection;
import java.util.List;

public class CompanyDAO implements AbstractDAO<Company> {

    @Override
    public void save(final Company obj, final Connection connection) {

    }

    @Override
    public Company find(final String id, final Connection connection) {
        return null;
    }

    @Override
    public List<Company> findAll(final Connection connection) {
        return null;
    }

    @Override
    public void update(final Company obj, final Connection connection) {

    }

    @Override
    public void delete(final Company obj, final Connection connection) {

    }
}
