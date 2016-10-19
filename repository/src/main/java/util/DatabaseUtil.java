package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by gh-abdoli on 9/25/16.
 */
public class DatabaseUtil {

    private static volatile DatabaseUtil dbUtils;
    private static volatile Connection connection;

    public static  DatabaseUtil getConnectionInstance(DatabaseType type){
        if(dbUtils ==null){
            synchronized (DatabaseUtil.class){
                if(dbUtils ==null){
                    dbUtils = new DatabaseUtil(type);
                }
            }
        }
        return dbUtils;
    }

    private DatabaseUtil(DatabaseType type) {

        try {
            switch (type){
                case POSTGRE:
                    Class.forName(DatabaseConfig.getProperty(type, "driver"));
                    connection = DriverManager.getConnection( DatabaseConfig.getProperty(type, "url"), DatabaseConfig.getProperty(type, "user"),
                            DatabaseConfig.getProperty(type, "password"));
                    break;
                case MY_SQL:
                    Class.forName(DatabaseConfig.getProperty(type, "driver"));
                    connection = DriverManager.getConnection( DatabaseConfig.getProperty(type, "url"), DatabaseConfig.getProperty(type, "user"),
                            DatabaseConfig.getProperty(type, "password"));
                    break;
                case ORACLE:
                    Class.forName(DatabaseConfig.getProperty(type, "driver"));
                    connection = DriverManager.getConnection( DatabaseConfig.getProperty(type, "url"), DatabaseConfig.getProperty(type, "user"),
                            DatabaseConfig.getProperty(type, "password"));
                    break;
            }

            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
