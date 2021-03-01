package qinshi.day30.second.test;

import org.junit.Test;
import qinshi.day30.second.dao.IUserDao;
import qinshi.day30.second.dao.impl.UserDaoImpl;
import qinshi.day30.second.domain.User;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LoginTest
 * @Date 2021/2/27 16:17
 */
public class UserLoginTest {
    @Test
    public void TestUserLogin(){
        //获取账号密码
        String name="张三";
        String pwd="123";
        //创建实现类对象
        IUserDao udao=new UserDaoImpl();
        //调用登录方法
        User user = udao.login(name);
        //判断用户名和密码
        if(user!=null){
            if(user.getPwd().equals(pwd)){
                System.out.println("登录成功");
            }else {
                System.out.println("密码错误");
            }
        }else {
            System.out.println("用户名不存在");
        }
    }
}
