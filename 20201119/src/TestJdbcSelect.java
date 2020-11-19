import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-19
 * Time: 11:06
 **/
public class TestJdbcSelect {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java11_18?character=utf-8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("261919Zss");
        Connection connection = dataSource.getConnection();
        String sql = "select * from teacher";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getNString("name");
            int tNo = resultSet.getInt("t_no");
            System.out.println("id :"+id+"  " +"name :"+name+"  "+" t_no: "+tNo);

        }
        if (resultSet != null){
            resultSet.close();
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
