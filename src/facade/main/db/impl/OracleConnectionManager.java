package facade.main.db.impl;

import facade.main.db.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionManager implements ConnectionManager {

    public static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    //public static final String url = "jdbc:oracle:thin:@eprumossd0143:1523:cheetah";
    public static final String name = "test";
    public static final String password = "test";

    private static volatile OracleConnectionManager instance;

    private OracleConnectionManager() {
    }

    public static OracleConnectionManager getInstance() {
        if (instance == null) {
            synchronized (OracleConnectionManager.class) {
                if (instance == null) {
                    instance = new OracleConnectionManager();
                }
            }
        }
        return instance;
    }

    @Override
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection(url, name, password);
        } catch (Exception e) {
            throw new SQLException(e);
        }
    }
}
