import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://pıtpıtplace:3306/world";


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    }


