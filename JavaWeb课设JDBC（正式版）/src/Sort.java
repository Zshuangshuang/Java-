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
        sql[0] = "Select * from worker order by salary desc limit 3 offset 0";
        sql[1] = "Select * from worker order by salary desc limit 3 offset 3";
        Statement statement = connection.createStatement();
        ResultSet[] resultSet = new ResultSet[2];
        int count = 0;
        for (int i = 0; i < 2; i++) {
            resultSet[i] = statement.executeQuery(sql[i]);
            count++;
            while(resultSet[i].next()){
                int id = resultSet[i].getInt("id");
                String name = resultSet[i].getString("name");
                String sex = resultSet[i].getString("sex");
                int age = resultSet[i].getInt("age");
                BigDecimal salary = resultSet[i].getBigDecimal("salary");
                System.out.println("编号："+id+"  "+"姓名："+name+"  "+
                        "性别："+sex+"  "+"年龄："+age+"  "+"薪水："+salary);
            }

        }
        System.out.println("查询操作执行成功！");
        System.out.println("执行成功的语句条数为："+count);
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }

    }
}
