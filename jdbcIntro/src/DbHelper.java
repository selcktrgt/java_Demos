import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbHelper {
    private String User="root";
    private String Password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,User,Password);
    }

    public void showErrorMessage(SQLException Exception){
        System.out.println("Error="+Exception.getMessage());
        System.out.println("Error code="+Exception.getErrorCode());
    }
}
