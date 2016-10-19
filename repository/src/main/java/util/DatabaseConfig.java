package util;

import java.io.*;
import java.util.Properties;

/**
 * Created by gh-abdoli on 9/25/16.
 */
public class DatabaseConfig {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new DatabaseConfig().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InputStream getInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("database.properties");
    }
    public static String getProperty(DatabaseType type, String str) {
        return properties.getProperty(type.name().concat("." + str));
    }

}
