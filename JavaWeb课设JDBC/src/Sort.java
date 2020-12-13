import java.math.BigDecimal;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-13
 * Time: 18:55
 **/
public class Sort {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///homework";
        Connection connection = DriverManager.getConnection(url,"root","261919Zss");
        String[] sql = new String[2];
        String sql1 = "Select * from worker order by salary desc limit 3 offset 0";
        String sql2 = "Select * from worker order by salary desc limit 3 offset 3";
        Statement statement = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery(sql1);
        while(resultSet1.next()){
            int id = resultSet1.getInt("id");
            String name = resultSet1.getString("name");
            String sex = resultSet1.getString("sex");
            int age = resultSet1.getInt("age");
            BigDecimal salary = resultSet1.getBigDecimal("salary");
            System.out.println("编号："+id+"  "+"姓名："+name+"  "+
                    "性别："+sex+"  "+"年龄："+age+"  "+"薪水："+salary);
        }
        ResultSet resultSet2 = statement.executeQuery(sql2);
        while(resultSet2.next()){
            int id = resultSet2.getInt("id");
            String name = resultSet2.getString("name");
            String sex = resultSet2.getString("sex");
            int age = resultSet2.getInt("age");
            BigDecimal salary = resultSet2.getBigDecimal("salary");
            System.out.println("编号："+id+"  "+"姓名："+name+"  "+
                    "性别："+sex+"  "+"年龄："+age+"  "+"薪水："+salary);
        }

    }
}
