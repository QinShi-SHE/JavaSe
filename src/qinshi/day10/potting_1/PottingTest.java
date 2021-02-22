package qinshi.day10.potting_1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PottingTest
 * @Date 2021/1/12 11:31
 */
public class PottingTest {
    /*
        不封装，类中的属性值可以任意修改
        封装作用：
               1. 不希望在外部类中随意访问类中的成员变量
               2. 达到权限要求的才能访问。
               3. 只是获取数据的时候，例如 单例模式

         访问权限修饰符：
                    public	    最大权限，被其修饰的成员，在任意目录下，都可以访问到 (所有类)
                    protected	在同包类和子类中都可以访问
                   默认不写	    只能在同包类中访问
                   rivate		能在当前类中访问

     */
    public static void main(String[] args) {

        Student student=new Student();
        student.name="ss"; //类中的变量值可以随意改变
        student.age=23;

        //类封装以后，
        Account a1=new Account();
        a1.setName("琴师");
        a1.setAge(-10);
        System.out.println(a1.getName()+a1.getAge());


    }

}
