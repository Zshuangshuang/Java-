import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 14:52
 **/
public class JDBCOfInsert {
    public static void main(String[] args) throws SQLException {
        //创建connection对象，建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","261919Zss");
        //创建statement对象，执行sql语句
        Statement statement = connection.createStatement();
        String[] sql = new String[6];
        sql[0] = "insert into worker values(null,'蔡文姬','女',18,6652.3)";
        sql[1] = "insert into worker values(null,'瑶妹','女',22,1987.2)";
        sql[2] = "insert into worker values(null,'曜','男',46,1439.8)";
        sql[3] = "insert into worker values(null,'小鲁班','男',20,1234.5)";
        sql[4] = "insert into worker values(null,'貂蝉','女',48,1999.6)";
        sql[5] = "insert into worker values(null,'邓伦','男',27,6666.9)";
        statement.executeUpdate(sql[0]);
        statement.executeUpdate(sql[1]);
        statement.executeUpdate(sql[2]);
        statement.executeUpdate(sql[3]);
        statement.executeUpdate(sql[4]);
        statement.executeUpdate(sql[5]);
        //释放资源
        statement.close();
        connection.close();
    }
}
