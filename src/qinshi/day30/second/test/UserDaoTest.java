package qinshi.day30.second.test;

import org.junit.Test;
import qinshi.day30.second.dao.IUserDao;
import qinshi.day30.second.dao.impl.UserDaoImpl;
import qinshi.day30.second.domain.User;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UserDaoTest
 * @Date 2021/2/28 13:28
 */
public class UserDaoTest {
    @Test
    public void test() throws Exception{
        IUserDao udao= new UserDaoImpl();

        //添加数据
        User user=new User(null,"呵呵","123");
        //udao.insert(user);

        //更新数据
        User user2=new User(16,"哈哈","123");
        //udao.update(user2);

        //删除数据
        //udao.delete(16);

        //查询一条
        System.out.println(udao.selectOne(1));

        //查询所有
        System.out.println(udao.selectAll());
    }
}
