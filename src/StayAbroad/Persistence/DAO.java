package StayAbroad.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conection = null;
    protected ResultSet result = null;
    protected Statement statement = null;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "estancia";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void connectBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlDataBase = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conection = DriverManager.getConnection(urlDataBase, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    protected void disconnectBase() throws Exception {
        try {
            if (conection != null) {
                conection.close();
            }
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void insertModifyDelete(String sql) throws Exception {
        try {
            connectBase();
            statement = conection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    protected void queryBase(String sql) throws Exception {
        try {
            connectBase();
            statement = conection.createStatement();
            result = statement.executeQuery(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
