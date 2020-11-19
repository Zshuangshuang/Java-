import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-19
 * Time: 10:54
 **/
public class TestJdbc {

    public static void main(String[] args) throws SQLException {
        //1、准备创建datasource对象
        DataSource dataSource = new MysqlDataSource();
        //这里要向下转型,设置url、密码以及用户名
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java11_18?character=utf-8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("261919Zss");
        //2、创建连接
        Connection connection = dataSource.getConnection();
        //3、建立sql语句
        String sql = "insert into teacher values(1,'凉凉',23)";
        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println(statement);
        //4、执行sql语句
        System.out.println(statement.executeUpdate());
        //5、释放资源
        try {
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
