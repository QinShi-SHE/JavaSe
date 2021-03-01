package qinshi.day30.second.test;

import org.junit.Test;
import qinshi.day30.util.JdbcUtilPro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TxTest
 * @Date 2021/2/27 17:09
 */
public class TxTest {
    /*事务的回滚*/
    @Test
    public void test() {
        Connection conn = null;
        PreparedStatement statement=null;
        PreparedStatement statement2=null;
        try {
            //获取连接
            conn=JdbcUtilPro.getConn();
            //手动关闭事物
            conn.setAutoCommit(false);
            //获取预编译对象
            statement=conn.prepareStatement("update user set age=age-1 where id=1");
            //执行sql
            statement.execute();

            //给出一个异常
            int a=1/0;

            //获取第二个预编译对象
            statement2=conn.prepareStatement("update user set age=age+1 where id=13");
            statement2.execute();

            //提交
            conn.commit();
        }catch (Exception e){
            try {
                //事物回滚
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }finally {
            JdbcUtilPro.close(null,statement,conn);
        }
    }
}
