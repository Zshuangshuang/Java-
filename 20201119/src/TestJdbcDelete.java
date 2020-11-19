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
 * Time: 11:32
 **/
public class TestJdbcDelete {

    public static void main(String[] args) throws SQLException {
        System.out.println("请删除你要删除的教师姓名:");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java11_18?character=utf-8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("261919Zss");

        Connection connection = dataSource.getConnection();
        String sql = "delete  from teacher where name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);

        int ret = statement.executeUpdate();
        if (ret == 1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        statement.close();
        connection.close();

    }
}
