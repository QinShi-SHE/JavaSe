package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Variable_3
 * @Date 2021/1/2 22:35
 */

/*
*     全局变量(成员变量、实例变量)：
*           声明在一个类中，但在方法、构造方法和语句块之外；
*           当静态主方法使用时，定义全局变量还需要用static
*           全局变量可以不要初始值，具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null
*      局部变量：
*           局部变量声明在方法、构造方法或者语句块中；
*           局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
*/
public class Variable_3 {

    public void getName(String name){
        System.out.println(name);
    }

    //当静态主方法使用时，定义全局变量还需要用static
    static int a=1;
    public static void main(String[] args) {
        System.out.println(a);

        Variable_3 variable_3=new Variable_3();
        String name="篱琴";
        variable_3.getName(name);
    }
}
