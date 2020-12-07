import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 19:03
 **/
public class JDBCInsert {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        //设置URL
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql:///test");
        //设置用户名，默认为root
        ((MysqlDataSource)dataSource).setUser("root");
        //设置密码：要与自己的mysql服务器一致
        ((MysqlDataSource)dataSource).setPassword("261919Zss");
        //创建数据库连接
        Connection connection = dataSource.getConnection();
        //写插入数据的sql语句
        String[] sql = new String[6];
        sql[0] = "insert into worker values(null,'蔡文姬','女',18,6652.3)";
        sql[1] = "insert into worker values(null,'瑶妹','女',22,1987.2)";
        sql[2] = "insert into worker values(null,'曜','男',46,1439.8)";
        sql[3] = "insert into worker values(null,'小鲁班','男',20,1234.5)";
        sql[4] = "insert into worker values(null,'貂蝉','女',48,1999.6)";
        sql[5] = "insert into worker values(null,'邓伦','男',27,6666.9)";

    }
}
