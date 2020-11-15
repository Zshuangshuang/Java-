package frsnk.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-15
 * Time: 9:58
 **/
public class Test {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // 加载JDBC驱动程序：反射，这样调用初始化com.mysql.jdbc.Driver类，即将该类加载到JVM方法区，并执行该类的静态方法块、静态属性。
            Class.forName("com.mysql.jdbc.Driver");
            // 第1步->创建数据库连接:需要修改3306/后面的数据库名称修改为自己数据库的名称，还要修改自己数据库的密码
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/202011_12?user=root&password=261919Zss&useUnicode=true&characterEncoding=UTF-8&useSSL=false");
            //第2步->创建命令操作
            statement = connection.createStatement();
            //第3步->执行sql语句
            String sql = "select name,sex,depart,salary from emp";
            resultSet = statement.executeQuery(sql);
            //第4步->处理结果集(查询操作）
            while(resultSet.next()){
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                String depart = resultSet.getString("depart");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                System.out.printf("name=%s,sex=%s,depart=%s,salary=%s\n",name,sex,depart,salary);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            //第5步->释放资源
            try {
                if (resultSet != null){
                    resultSet.close();
                }
                if (statement != null){
                    statement.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }


    }
}
