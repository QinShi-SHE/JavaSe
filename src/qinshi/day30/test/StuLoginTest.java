package qinshi.day30.test;

import org.junit.Test;
import qinshi.day30.dao.IStudentDao;
import qinshi.day30.dao.impl.StudentDaoImpl;
import qinshi.day30.domain.Student;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LoginTest
 * @Date 2021/2/27 14:32
 */
public class StuLoginTest {
    @Test
    public void login(){
        //创建用户名和密码
        String userName="琴师";
        String password="123456";

        //创建实现类对象
        IStudentDao studentDao=new StudentDaoImpl();

        //调用登录方法
        Student stu = studentDao.login(userName);

        //判断用户名和密码
        if(stu==null){
            System.out.println("用户名不存在！");
        }else {
            //用户名存在
            if(!stu.getPassword().equals(password)){
                System.out.println("密码错误！");
            }else {
                //用户名密码正确
                System.out.println("登录成功！");
            }
        }
    }
}
