import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {


        Connection connection=null;
        dbHelper helper=new dbHelper();
        PreparedStatement statement=null;

        try {

          connection=helper.getConnection();



         statement=connection.prepareStatement("insert into city(Name, CountryCode, District, Population) values('Düzce', 'TUR','Turkey', 50000)");

         statement.executeUpdate();
         System.out.println("Kayıt oluşturuldu.");

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            statement.close();
            connection.close();
        }



    }


}
