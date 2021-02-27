package qinshi.day29.jdbc;

import org.junit.Test;
import qinshi.day29.dao.impl.EmployeeDaoImpl;
import qinshi.day29.utils.JdbcUtil;
import qinshi.day29.domain.Employee;
import qinshi.day29.utils.JdbcUtilPro;

import java.sql.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName JdbcTest
 * @Date 2021/2/26 10:08
 */
public class JdbcTest {
    /*创建表*/
    @Test
    public void test() throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qinshi", "root", "123456");

        //3.获取执行对象
        Statement statement = conn.createStatement();

        //sql语句,创建表
        String sql = "create table employee " +
                "(id int(8) ," +
                "name varchar(20)," +
                "sex int(2))";

        //插入一条数据
        String sql2="insert into employee values(2,'李四',2)";

        //删除一条数据
        String sql3="delete from employee where id=1";

        //修改一条数据
        String sql4="update employee set sex=3333 where id=2";

        //查询数据
        String sql5="select * from employee";

        //4.执行sql
        statement.execute(sql4);

        //5.释放资源,先开后关
        statement.close();
        conn.close();
    }

    /*添加数据*/
    @Test
    public void add() throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接                                                //三个斜杆,只限定本地数据库有用
        Connection conn = DriverManager.getConnection("jdbc:mysql:///qinshi", "root", "123456");

        //3.执行对象
        Statement statement = conn.createStatement();

        //sql语句
        String sql="insert into employee(name,sex) value('琴师',1)"; //写values也可以

        //4.执行sql语句
        statement.execute(sql);

        //5释放资源
        statement.close();
        conn.close();
    }

    /*删除数据*/
    @Test
    public void delete() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qinshi", "root", "123456");
        //3.执行对象
        Statement statement = conn.createStatement();
        //sql语句
        String delete="delete from employee where id=1";
        //4.执行sql
        statement.execute(delete);
        //5.释放资源
        statement.close();
        conn.close();
    }

    /*修改数据*/
    @Test
    public void update() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qinshi", "root", "123456");
        //3.执行对象
        Statement statement = conn.createStatement();
        //sql语句
        String update="update employee set sex=222 where id=1";
        //4.执行sql
        statement.execute(update);
        //5.释放资源
        statement.close();
        conn.close();
    }

    /*查询数据*/
    @Test
    public void select() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qinshi", "root", "123456");
        //3.执行对象
        Statement statement = conn.createStatement();
        //sql语句
        String select="select * from employee ";
        //4.执行sql  查询操作使用executeQuery方法,获得结果集
        ResultSet rs=statement.executeQuery(select);
        while (rs.next()){
            //System.out.println(rs.getString("id")+" "+rs.getString("name"));
//            System.out.println(rs.getInt("id")+" "+
//                    rs.getString("name")+" "+
//                    rs.getInt("sex"));
            System.out.println(rs.getInt(1)+" "+  //获取第一列的数据
                    rs.getString(2)+" "+          //获取第二列的数据
                    rs.getInt(3));                //获取第三列的数据
        }
        //5.释放资源
        rs.close();
        statement.close();
        conn.close();
    }

    /*用工具类操作数据库(JdbcUtil)*/
    @Test
    public void testUtil() throws SQLException {
        //获取连接
        Connection conn = JdbcUtil.getConn(); //用工具类获取连接，已经写好了加载驱动
        //执行对象
        Statement statement = conn.createStatement();
        //sql语句
        String select="select * from employee where id=1";
        //执行查询语句
        ResultSet rs= statement.executeQuery(select);
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //关流
        JdbcUtil.close(rs,statement,conn); //用工具类释放资源
    }

    @Test
    public void testDao(){
        EmployeeDaoImpl employeeDao=new EmployeeDaoImpl();

        //插入
        Employee emp=new Employee(null,"王五",1);
        employeeDao.add(emp);

        //修改
        Employee emp2=new Employee(null,"王五",1111);
        employeeDao.update(emp2);

        //删除
        employeeDao.delete(5);

        //查询,单独显示一行
        System.out.println(employeeDao.selectAll());
        //查询，并遍历list集合，多行显示
        employeeDao.selectAll().forEach(System.out::println); //这里改成print，也是一行显示
    }

    /*测试加强版工具类(JdbcUtil)*/
    @Test
    public void testUtilPro() throws SQLException {
        //获取连接
        Connection conn = JdbcUtilPro.getConn(); //用工具类获取连接，已经写好了加载驱动
        //执行对象
        Statement statement = conn.createStatement();
        //sql语句
        String select="select * from employee where id=1";
        //执行查询语句
        ResultSet rs= statement.executeQuery(select);
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //关流
        JdbcUtilPro.close(rs,statement,conn); //用工具类释放资源
    }
}
