import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 19:14
 **/
public class Delete {

    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = DriverManager.getConnection(url,"root","261919Zss");
        String sql = "delete from worker where salary > 1500";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
