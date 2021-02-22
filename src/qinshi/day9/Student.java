package qinshi.day9;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/1/11 11:17
 */
public class Student {
    /*
         创建一个学生类
                姓名，年龄，性别，电话

         创建一个模板，不用赋初始值；

         创建类，不需要主方法
         测试类，才有2主方法

         类有属性和方法
         方法的调用:
                1. 方法名(); 前提同一个类，且有static修饰
                2. 类名.方法名(); 要有static修饰
                3. 对象名.方法名();
     */

    String name;
    int age;
    char sex;
    long phoneNum;

    //无返无参
    void playGame(){
        System.out.println("光遇");
    }
    //有返无参
    String playGame2(){
        return "光遇";
    }

    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.name);
    }
}
