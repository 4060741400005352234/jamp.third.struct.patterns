package facade.main.db;

import java.sql.Connection;
import java.util.List;

public interface AbstractDAO<T> {

    void save(T obj, Connection connection);
    T find(String id, Connection connection);
    List<T> findAll(Connection connection);
    void update(T obj, Connection connection);
    void delete(T obj, Connection connection);
}
