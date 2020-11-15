package test;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-15
 * Time: 13:49
 **/
public class TestDemo {
    public static void main(String[] args) {
        query("中文系2019级3班");
    }
    public static List<Student> query(String name)  {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            //1、利用反射加载mysql驱动包
            Class.forName("com.mysql.jdbc.Driver");
            //2、创建数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/20201110_?user=root&password=261919Zss&useUnicode=true&characterEncoding=UTF-8&useSSL=false");
            statement = connection.createStatement();
            //3、执行sql语句
            String sql = "select cls.name class_name, " +
                    "  stu.id, " +
                    "  stu.name student_name, " +
                    "  cou.name course_name, " +
                    "  sco.score  " +
                    "  from student stu,course cou,classes cls,score sco  " +
                    "  where cls.id = stu.classes_id " +
                    "  and stu.id = sco.student_id " +
                    "  and cou.id = sco.course_id " +
                    "  and cls.name = '"+
                    name+"'";
            resultSet = statement.executeQuery(sql);
            List<Student> studentList = new ArrayList<>();
            while (resultSet.next()){
                String className = resultSet.getString("class_name");
                int studentId = resultSet.getInt("id");
                String studentName = resultSet.getString("student_name");
                String courseName = resultSet.getString("course_name");
                BigDecimal score = resultSet.getBigDecimal("score");
                Student student = new Student();
                student.setClasses_name(className);
                student.setStudent_id(studentId);
                student.setStudent_name(studentName);
                student.setCourse_name(courseName);
                student.setScore(score);
                studentList.add(student);
                System.out.printf("class_name = %s,student_id = %s,student_name=%s,course_name=%s,score=%s\n",
                        className,studentId,studentName,courseName, score);
            }
            System.out.println(studentList);
            return studentList;

        }  catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("查询信息错误",e);
        } finally {
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
    static class Student{
        private String classes_name;
        private int student_id;
        private String student_name;
        private String course_name;
        private BigDecimal score;

        public String getClasses_name() {
            return classes_name;
        }

        public void setClasses_name(String classes_name) {
            this.classes_name = classes_name;
        }

        public int getStudent_id() {
            return student_id;
        }

        public void setStudent_id(int student_id) {
            this.student_id = student_id;
        }

        public String getCourse_name() {
            return course_name;
        }

        public void setCourse_name(String course_name) {
            this.course_name = course_name;
        }

        public BigDecimal getScore() {
            return score;
        }

        public void setScore(BigDecimal score) {
            this.score = score;
        }

        public String getStudent_name() {
            return student_name;
        }

        public void setStudent_name(String student_name) {
            this.student_name = student_name;
        }

        @Override
        public String toString() {
            return "student{" +
                    "classes_name='" + classes_name + '\'' +
                    ", student_id=" + student_id +
                    ", student_name='" + student_name + '\'' +
                    ", course_name='" + course_name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}
