package DataBase;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {

    public static String URL = "jdbc:mysl://localhost:3306/Pixora_655";
    public static String USE = "root";
    public static String MotDePasse = "root";

    public Connection getConnection() throws SQLException {

      return (Connection) DriverManager.getConnection (URL, USE, MotDePasse);
    }
}



