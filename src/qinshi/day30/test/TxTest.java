package qinshi.day30.test;

import org.junit.Test;
import qinshi.day30.util.JdbcUtilPro;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TxTest
 * @Date 2021/2/27 16:34
 */
public class TxTest {
    /*事务的回滚*/
    @Test
    public void test() throws Exception{
        //写update语句，琴师-10，香猫+10

        Connection conn=null;
        PreparedStatement statement=null;
        PreparedStatement statement2=null;
        try {
            //加载驱动，获取连接
            conn = JdbcUtilPro.getConn();

            //设置手动提交
            conn.setAutoCommit(false);

            //获取预编译对象
            statement = conn.prepareStatement("update student set age=age-10 where username='琴师'");//更新琴师的age-10
            statement.execute(); //执行sql

            //给个异常，后面代码就不会出现异常
            int a=1/0;

            //获取预编译对象
            statement2 = conn.prepareStatement("update student set age=age+10 where username='香猫'");//更新香猫的age+10
            statement2.execute(); //执行sql

            //提交
            conn.commit();
        }catch (Exception e){
            //出现异常回滚数据
            conn.rollback();
        }finally {
            //关流
            JdbcUtilPro.close(null,statement,conn);
            JdbcUtilPro.close(null,statement2,null);
        }
    }
}
