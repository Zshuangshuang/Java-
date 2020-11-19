import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-19
 * Time: 11:38
 **/
public class TestJdbcUpdate {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要修改学生姓名的id");
        int id = scanner.nextInt();
        System.out.println("请输入你要修改的学生姓名：");
        String name = scanner.next();
        //创建datasource对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java11_18?character=utf-8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("261919Zss");
        //创建connection对象，建立连接
        Connection connection = dataSource.getConnection();
        //建立PreparedStatement
        String sql = "update teacher set name = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        statement.setInt(2,id);
        int ret = statement.executeUpdate();
        if (ret == 1){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        statement.close();
        connection.close();

    }
}
