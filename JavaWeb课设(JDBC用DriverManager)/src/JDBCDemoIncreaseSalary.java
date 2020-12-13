import java.math.BigDecimal;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 17:45
 **/
public class JDBCDemoIncreaseSalary {
    public static void main(String[] args)throws SQLException {
        //创建connection对象，建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","261919Zss");
        //创建statement对象，执行sql语句
        Statement statement = connection.createStatement();
        //修改年龄大于45岁的sql语句
        String sql1 = " update worker set salary=(salary*0.15)+salary where age > 45";
        //执行sql语句
        statement.executeUpdate(sql1);
        String sql2 = "update worker set salary=(salary*0.1)+salary where age < 45";
        statement.executeUpdate(sql2);
        //释放资源
        statement.close();
        connection.close();
    }
}
