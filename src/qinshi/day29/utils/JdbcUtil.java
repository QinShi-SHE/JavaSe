package qinshi.day29.utils;

import java.sql.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName JdbcUtil
 * @Date 2021/2/26 14:49
 */
public class JdbcUtil {
    //静态代码块(优先执行)
    static {
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取连接的方法，想要类名直接调用方法，用static修饰
    public static Connection getConn(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/qinshi", "root", "123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //释放资源（关流）的方法
    public static void close(ResultSet rs, Statement statement,Connection conn){
        try {
            if(rs!=null)
                rs.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {  //无论是否异常，都会执行
            try {
                if(statement!=null)
                    statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    if(conn!=null)
                        conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
