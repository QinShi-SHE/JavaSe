package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PeopleTest
 * @Date 2021/1/11 18:14
 */
public class PeopleTest {
    public static void main(String[] args) {
        /*
             （2）创建主类：
            创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
            让该对象调用成员方法：
            说出“你好！”
            计算23+45的值
            将名字改为“李四”
         */

        People people=new People("张三",18,'男',1.80);
        System.out.println(people.say());
        System.out.println(people.count(23,45));
        people.changeName("李四");
        System.out.println(people.getName());
    }
}
