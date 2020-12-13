import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 18:27
 **/
public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = DriverManager.getConnection(url,"root","261919Zss");
        Statement statement = connection.createStatement();
        String[] sql = new String[6];
        sql[0] = "insert into worker values(null,'小鲁班','男',38,1234.5)";
        sql[1] = "insert into worker values(null,'蔡文姬','女',25,4567.2)";
        sql[2] = "insert into worker values(null,'曹操','男',42,1357.8)";
        sql[3] = "insert into worker values(null,'瑶妹子','女',28,1698.6)";
        sql[4] = "insert into worker values(null,'邓伦','男',29,6000)";
        sql[5] = "insert into worker values(null,'花仙子','女',45,1266.8)";
        for (int i = 0; i < 6; i++) {
            statement.executeUpdate(sql[i]);
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
