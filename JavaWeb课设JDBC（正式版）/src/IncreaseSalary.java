import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 18:42
 **/
public class IncreaseSalary {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = DriverManager.getConnection(url,"root","261919Zss");
        String[] sql = new String[2];
        sql[0] = "update worker set salary = salary+(salary*0.15)";
        sql[1] = "update worker set salary = salary + (salary*0.1)";
        Statement statement = connection.createStatement();
        int count = 0;
        for (int i = 0; i < 2; i++) {
            statement.executeUpdate(sql[i]);
            count++;
        }
        System.out.println("修改操作执行成功!");
        System.out.println("成功修改"+count+"条语句");
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
