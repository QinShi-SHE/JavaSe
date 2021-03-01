package qinshi.day30.util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName JdbcUtil
 * @Date 2021/2/26 14:49
 */
public class DBCPJdbcUtil {
    static Properties prp=null;
    static DataSource dataSource=null;
    //静态代码块(优先执行)
    static {
        try {
            //创建一个配置文件
            prp=new Properties();
            //把配置文件中的内容读取过来,并加载到properties对象中
            prp.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc2.properties"));
            //Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");

            //加载驱动
            //Class.forName(prp.getProperty("driverClassName"));

            //创建连接池
            dataSource = BasicDataSourceFactory.createDataSource(prp);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    //获取连接的方法，想要类名直接调用方法，用static修饰
    public static Connection getConn(){
        try {
            //从连接池中获取获取连接
            return dataSource.getConnection();
            //return DriverManager.getConnection(prp.getProperty("url"), prp.getProperty("userName"), prp.getProperty("password"));
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
