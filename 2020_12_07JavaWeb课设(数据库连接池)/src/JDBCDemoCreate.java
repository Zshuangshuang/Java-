
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 18:47
 **/
public class JDBCDemoCreate {
    public static void main(String[] args) throws SQLException {
        //创建数据库连接池
        DataSource dataSource = new MysqlDataSource();
        //设置URL
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql:///test");
        //设置用户名，默认为root
        ((MysqlDataSource)dataSource).setUser("root");
        //设置密码：要与自己的mysql服务器一致
        ((MysqlDataSource)dataSource).setPassword("261919Zss");
        //创建数据库连接
        Connection connection = dataSource.getConnection();
        //创建preparedStatement对象执行sql语句
        String sql = "create table emp(id int primary key auto_increment,name varchar(20),sex varchar(20),age int,salary decimal(5,2))";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
}
