import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 18:38
 **/
public class JDBCDelete {
    public static void main(String[] args) throws SQLException {
        //创建connection对象，连接jdbc
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","261919Zss");
        //创建statement对象，执行sql语句
        String sql = "delete from worker where salary > 1500";
        Statement statement = connection.createStatement();
        //执行sql语句
        statement.executeUpdate(sql);
        //关闭资源
        statement.close();
        connection.close();
    }
}
