package qinshi.day29.dao.impl;

import qinshi.day29.dao.IEmployeeDao;
import qinshi.day29.domain.Employee;
import qinshi.day29.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName EmployeeDaoIpml
 * @Date 2021/2/26 16:17
 */
public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public void add(Employee employee) {
        Connection conn=null;
        Statement statement=null;
        try {
            //加载驱动
            //获取连接
            conn = JdbcUtil.getConn();
            //执行对象
            statement = conn.createStatement();
            //sql语句
            String sql="insert into employee(name,sex) values ('"+employee.getName()+"',"+employee.getSex()+")";
            //执行sql
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(null,statement,conn);//关闭资源
        }
    }

    @Override
    public void update(Employee employee) {
        Connection conn=null;
        Statement statement=null;
        try {
            //获取连接
            conn = JdbcUtil.getConn();
            //执行对象
            statement = conn.createStatement();
            //sql语句
            String sql="update employee set name='"+employee.getName()+"',sex="+employee.getSex()+" where id="+employee.getId()+"";
            //执行sql
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(null,statement,conn);//关闭资源
        }
    }

    @Override
    public void delete(Integer id) {
        Connection conn=null;
        Statement statement=null;
        try {
            //获取连接
            conn = JdbcUtil.getConn();
            //执行对象
            statement = conn.createStatement();
            //sql语句
            String sql="delete from employee where id="+id+"";
            //String sql="delete from employee where id="+id;   //最后的数据可以作拼接
            //执行sql
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(null,statement,conn);//关闭资源
        }
    }

    @Override
    public Employee selectOne(Integer id) {
        Employee emp=null;
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;
        try {
            //获取连接
            conn = JdbcUtil.getConn();
            //执行对象
            statement = conn.createStatement();
            //sql语句
            String sql="select * from employee where id="+id+"";
            //执行sql
            rs = statement.executeQuery(sql);
            while (rs.next()){
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSex(rs.getInt("sex"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(rs,statement,conn);//关闭资源
        }
        return emp;
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> empList=new LinkedList<Employee>();
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;
        try {
            //获取连接
            conn = JdbcUtil.getConn();
            //执行对象
            statement = conn.createStatement();
            //sql语句
            String sql="select * from employee ";
            //执行sql
            rs = statement.executeQuery(sql);
            while (rs.next()){
                Employee emp=new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSex(rs.getInt("sex"));

                //或者这样
                //Employee emp=new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("sex"));

                //添加到List集合
                empList.add(emp);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(rs,statement,conn);//关闭资源
        }
        return empList;
    }
}
