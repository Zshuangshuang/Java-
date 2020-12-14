import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 16:37
 **/
public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = null;
        Statement statement = null;
        connection = DriverManager.getConnection(url,"root","261919Zss");
        String sql = "create table worker(id int primary key auto_increment," +
                "name varchar(20)," +
                "sex varchar(20)," +
                "age int," +
                "salary decimal(5,1))";
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("建表成功！");
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
