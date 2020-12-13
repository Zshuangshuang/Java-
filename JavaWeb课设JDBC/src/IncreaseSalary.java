import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 18:42
 **/
public class IncreaseSalary {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = DriverManager.getConnection(url,"root","261919Zss");
        String sql1 = "update worker set salary = salary+(salary*0.15)";
        String sql2 = "update worker set salary = salary + (salary*0.1)";
        Statement statement = connection.createStatement();
        for (int i = 0; i < 2; i++) {
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
