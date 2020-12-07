import java.math.BigDecimal;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-12-07
 * Time: 18:11
 **/
public class JDBCSortDemo {
    public static void main(String[] args) throws SQLException {
        //创建connection对象建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","261919Zss");
        String sql1 = "select id,name,sex,age,salary from worker order by salary desc limit 3 offset 0";
        String sql2 = "select id,name,sex,age,salary from worker order by salary desc limit 3 offset 3";
        //创建statement对象执行sql语句
        Statement statement = connection.createStatement();
        //创建结果集对象，一会儿利用迭代器的方式遍历结果集
        ResultSet resultSet1 =  statement.executeQuery(sql1);

           while (resultSet1.next()){
               int id = resultSet1.getInt("id");
               String name = resultSet1.getString("name");
               String sex = resultSet1.getString("sex");
               int age = resultSet1.getInt("age");
               BigDecimal salary = resultSet1.getBigDecimal("salary");
               System.out.println("编号: "+id+" "+"姓名: "+name+" "+"性别："+sex+" "+"年龄："+age+" "+"工资："+salary);
           }
       ResultSet resultSet2 = statement.executeQuery(sql2);
           while(resultSet2.next()){
               int id = resultSet2.getInt("id");
               String name =resultSet2.getString("name");
               String sex = resultSet2.getString("sex");
               int age = resultSet2.getInt("age");
               BigDecimal salary = resultSet2.getBigDecimal("salary");
               System.out.println("编号: "+id+" "+"姓名: "+name+" "+"性别："+sex+" "+"年龄："+age+" "+"工资："+salary);
           }
           resultSet2.close();
        resultSet1.close();
        statement.close();
        connection.close();
    }
}
