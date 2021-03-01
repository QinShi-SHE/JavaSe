package qinshi.day30.dao.impl;

import qinshi.day30.dao.IStudentDao;
import qinshi.day30.domain.Student;
import qinshi.day30.util.JdbcUtilPro;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StudentDao
 * @Date 2021/2/27 9:20
 */
public class StudentDaoImpl implements IStudentDao {

    @Override
    public void add(Student stu) {
        Connection conn=null;
        PreparedStatement statement=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();
            //执行对象
            //statement=conn.createStatement();
            //sql语句
            //String sql="insert into student(username,password,age,sex,intro) values('"+stu.getUsername()+"','"+stu.getPassword()+"',"+stu.getAge()+",'"+stu.getSex()+"','"+stu.getIntro()+"')";
            String sql="insert into student(username,password,age,sex,intro) values(?,?,?,?,?)";
            //获取预编译对象
            statement=conn.prepareStatement(sql);
            //赋值
            statement.setObject(1,stu.getUsername());
            statement.setObject(2,stu.getPassword());
            statement.setObject(3,stu.getAge());
            statement.setObject(4,stu.getSex());
            statement.setObject(5,stu.getIntro());
            //执行sql
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(null,statement,conn);
        }
    }

    @Override
    public void delete(Integer id) {
        Connection conn=null;
        PreparedStatement statement=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();
            //执行对象
            //statement=conn.createStatement();
            //sql语句
            //String sql="delete from student where id="+id;
            String sql="delete from student where id=?";
            //获取预编译对象
            statement=conn.prepareStatement(sql);
            //设置预编译对象
            statement.setObject(1,id);
            //执行sql
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(null,statement,conn);
        }
    }

    @Override
    public void update(Student stu) {
        Connection conn=null;
        PreparedStatement statement=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();
            //执行对象
            //statement=conn.createStatement();
            //sql语句
            // sql="update student set username='"+stu.getUsername()+"',password='"+stu.getPassword()+"',age="+stu.getAge()+",sex='"+ stu.getSex()+"',intro='"+stu.getIntro()+"' where id="+stu.getId()+"";
            String sql="update student set username=?,password=?,age=?,sex=?,intro=? where id=?";  //这里不需要再加单引号，因为设置预编译对象可以设置任意类型
            //获取预编译对象
            statement=conn.prepareStatement(sql);
            //设置预编译对象
            statement.setObject(1,stu.getUsername());
            statement.setObject(2,stu.getPassword());
            statement.setObject(3,stu.getAge());
            statement.setObject(4,stu.getSex());
            statement.setObject(5,stu.getIntro());
            statement.setObject(6,stu.getId());
            //执行sql
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(null,statement,conn);
        }
    }

    @Override
    public Student selectOne(Integer id) {
        Student student=null;
        Connection conn=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();
            //sql语句
            String sql="select * from student where id=?";
            //获取预编译对象
            statement=conn.prepareStatement(sql);
            //设置预编译对象
            statement.setObject(1,id);
            //执行sql
            rs=statement.executeQuery();  //不需要放sql了
            //遍历
            while (rs.next()){
                student=new Student(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getInt("age"),rs.getString("intro"), rs.getString("sex"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(rs,statement,conn);
        }
        return student;
    }

    @Override
    public List<Student> selectAll() {
        List<Student> stuList=new LinkedList<Student>();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();
            //sql语句
            String sql="select * from student";
            //获取预编译对象,这里没有？就不用设置预编译对象
            ps = conn.prepareStatement(sql);
            //执行sql
            rs=ps.executeQuery();  //不需要放sql了
            //遍历
            while (rs.next()){
                Student student=new Student(rs.getInt("id"),rs.getString("username"),rs.getString("password"),rs.getInt("age"),rs.getString("intro"), rs.getString("sex"));
                stuList.add(student);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(rs,ps,conn);
        }
        return stuList;
    }

    @Override
    public Student login(String userName) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Student stu=null;
        try {
            //获取连接
            conn = JdbcUtilPro.getConn();
            //sql语句
            String sql="select * from student where username=?";
            //获取预编译对象
            ps = conn.prepareStatement(sql);
            //对？赋值
            ps.setObject(1,userName);
            //执行sql
            rs = ps.executeQuery();  //不需要放sql了
            //遍历
            while (rs.next()){
                stu=new Student(rs.getString("username"),rs.getString("password"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(rs,ps,conn);
        }
        return stu;
    }
}
