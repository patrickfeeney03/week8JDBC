package ie.atu;
import java.sql.*;

public class Connect {
    public static void main(String[] args) {
        Connection connection = null; // This is from the SQL import

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection()
        }
    }
}
