package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DogTest
 * @Date 2021/1/11 16:42
 */
public class DogTest {
    public static void main(String[] args) {
        /*
             请写一个测试类测试：
            创建2个狗狗对象:
            一个名字 赋值为 苍苍，性别：母狗	吃：大香肠（用有参构造实现成员变量赋值），并且调用对象的吃方法
            一个名字 赋值为 鹰鹰，性别：公狗	吃：大枣馒头（用对象名.成员变量的方式赋值给对应的成员变
         */

        Dog dog1=new Dog();
        dog1.name="小狗1";
        dog1.sex="母狗";
        System.out.print("名字："+dog1.name+" 性别："+dog1.sex+" 吃：");
        dog1.eat("大香肠");

        Dog dog2=new Dog("小狗2","公狗");
        System.out.print("名字："+dog2.name+" 性别："+dog2.sex+" 吃：");
        dog2.eat("大枣馒头");
    }
}
