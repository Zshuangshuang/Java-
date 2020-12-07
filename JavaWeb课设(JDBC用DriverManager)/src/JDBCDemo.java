import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 14:08
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
        try {
            //获取Connection类
           connection = DriverManager.getConnection("jdbc:mysql:///test","root","261919Zss");
            //获取statement对象
            statement = connection.createStatement();
            //建表的sql语句
            String sql = "create table worker( id int primary key auto_increment, name varchar(20), sex char(2), age int, salary decimal(5,1) )";
           //ret用来表示sql语句成功执行的条数
             statement.executeUpdate(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
        }
        //释放资源
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

