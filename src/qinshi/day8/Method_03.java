package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_3
 * @Date 2021/1/9 10:11
 */
public class Method_03 {
    /*
        方法的调用
                1.直接调用方法名() 前提是在同一个类中
                    主方法是静态的，静态方法只能调用静态方法
                2.类名.方法名()  前提该方法要有static修饰，还可以调用其他类中的方法
                3.对象名.方法名()
     */
    static void getSum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        //1.直接调用方法名() 前提是在同一个类中
        getSum(3,6);

        //2.类名.方法名()
        Method_03.getSum(4,6);
        //类名.方法名()调用其他类中的方法
        Method_02.getAge();
    }
}
