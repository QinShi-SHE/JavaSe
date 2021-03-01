package qinshi.day30.test;

import org.junit.Test;
import qinshi.day29.domain.Employee;
import qinshi.day30.dao.impl.StudentDaoImpl;
import qinshi.day30.domain.Student;
import qinshi.day30.util.DBCPJdbcUtil;
import qinshi.day30.util.JdbcUtilPro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TestJdbc
 * @Date 2021/2/27 11:24
 */
public class JdbcTest {
    /*修改，获取预编译对象*/
    @Test
    public void update() throws Exception{
        Employee emp=new Employee(3,"香猫",555);
        //加载驱动，获取连接
        Connection conn = JdbcUtilPro.getConn();

        //获取预编译对象 ？：占位符,？前后不需要引号
        String sql="update employee set name=?,sex=? where id=?";
        PreparedStatement ps= conn.prepareStatement(sql);
        //对？进行赋值，参数一：对哪个问号赋值；参数二：你要赋值的数据
        ps.setObject(1,emp.getName());
        ps.setObject(2,emp.getSex());
        ps.setObject(3,emp.getId());

        /*预编译好处：
        *     提高效率
        *     防止sql注入*/

        //执行sql
        ps.execute();

        //关闭资源
        JdbcUtilPro.close(null,ps,conn);
    }

    /*测试dao*/
    @Test
    public void testDao() throws Exception{
        StudentDaoImpl studentDao=new StudentDaoImpl();

        //添加数据
        Student stu=new Student(null,"篱琴","123456",21,"苏州","女");
        //studentDao.add(stu);

        //修改数据
        studentDao.update(new Student(18,"琴师","123456",23,"成都","男"));

        //删除数据
        //studentDao.delete(1);

        //查询一条数据
        System.out.println(studentDao.selectOne(18));
        //查询所有数据
        studentDao.selectAll().forEach(System.out::println);

    }

    /*测试DBCP工具类*/
    @Test
    public void testDBCP(){
        Connection conn = null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        try {
            conn = DBCPJdbcUtil.getConn();
            statement = conn.prepareStatement("select * from student");
            rs = statement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("username"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(rs,statement,conn);
        }
    }
}
