package qinshi.day30.second.dao.impl;

import qinshi.day30.second.dao.IUserDao;
import qinshi.day30.second.domain.User;
import qinshi.day30.util.DBCPJdbcUtil;
import qinshi.day30.util.JdbcUtilPro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UserDaoImpl
 * @Date 2021/2/27 16:13
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void insert(User user) {
        Connection conn =null;
        PreparedStatement statement = null;
        try {
            conn = DBCPJdbcUtil.getConn();
            statement = conn.prepareStatement("insert into user(name,pwd) values(?,?)");
            statement.setObject(1,user.getName());
            statement.setObject(2,user.getPwd());
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(null,statement,conn);
        }
    }

    @Override
    public void delete(Integer id) {
        Connection conn =null;
        PreparedStatement statement = null;
        try {
            conn = DBCPJdbcUtil.getConn();
            statement = conn.prepareStatement("delete from user where id=?");
            statement.setObject(1,id);
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(null,statement,conn);
        }
    }

    @Override
    public void update(User user) {
        Connection conn =null;
        PreparedStatement statement = null;
        try {
            conn = DBCPJdbcUtil.getConn();
            statement = conn.prepareStatement("update user set name=?,pwd=? where id=?");
            statement.setObject(1,user.getName());
            statement.setObject(2,user.getPwd());
            statement.setObject(3,user.getId());
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(null,statement,conn);
        }
    }

    @Override
    public User selectOne(Integer id) {
        User user=null;
        Connection conn=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        try {
            conn=DBCPJdbcUtil.getConn();
            statement=conn.prepareStatement("select * from user where id=?");
            statement.setObject(1,id);
            rs=statement.executeQuery();
            while (rs.next()){
                user=new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(rs,statement,conn);
        }
        return user;
    }

    @Override
    public List<User> selectAll() {
        List<User> userList=new LinkedList<User>();
        Connection conn=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        try {
            conn=DBCPJdbcUtil.getConn();
            statement=conn.prepareStatement("select * from user");
            rs=statement.executeQuery();
            while (rs.next()){
                User user=new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"));
                userList.add(user);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            DBCPJdbcUtil.close(rs,statement,conn);
        }
        return userList;
    }

    @Override
    public User login(String name) {
        Connection conn=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        User user=null;
        try {
            //获取连接
            conn = JdbcUtilPro.getConn();
            //获取预编译对象
            statement = conn.prepareStatement("select * from user where name=?");
            //赋值
            statement.setObject(1,name);
            //执行sql
            rs=statement.executeQuery();
            //遍历
            while (rs.next()){
                user=new User(rs.getString("name"),rs.getString("pwd"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtilPro.close(rs,statement,conn);
        }
        return user;
    }
}
