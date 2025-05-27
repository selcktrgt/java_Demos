import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null;
        try {
            connection=helper.getConnection();
           System.out.println("Bağlantı başarılı");
            String sql="insert into city(Name, CountryCode, District, Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,300000);
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
        finally {

            connection.close();
        }
    }



}
