package qinshi.day11.orride_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Rabbit
 * @Date 2021/1/14 11:09
 */
public class Rabbit extends Animal{
    /*
          重写前提；必须要有继承关系

          @Override 注解

          重写原因：因为父类的方法不能满足子类的需求，从而达到满足自己的要求

        1)重写只能出现在继承关系之中。当一个类继承它的父类方法时,都有机会重写该父类的方法。
            前提是父类的方法没有被被final（中文意思：最终的，以后讲）修饰
        2)子类方法和父类方法的方法签名(方法名+参数列表)完全一致;
        3)访问权限 : 子类方法的访问权限 大于等于父类方法的访问权限  子大于父
        4)static/private 方法不能够被重写 （java语法）
        5)返回值类型 : 子类方法的返回值类型可以是父类方法的返回值类型,也可以小于父类的返回值类型	   子小于父
        6)子类抛出的异常（Exception）下是父类相应方法抛出的异常或者相等

        在子类中的某一个方法中需要去调用父类中被覆盖的方法，此时得使用 super 关键字。
     */

    @Override
    public void move(){  //重写父类的move()方法
        //super.getName();
        System.out.println(super.getName()+" 可以蹦蹦跳跳"); //super调用父类的方法
    }

    @Override
    public String eat(){  //子类方法的返回值类型可以是父类方法的返回值类型,也可以小于父类的返回值类型	   子小于父
                            //类方法的访问权限 大于等于父类方法的访问权限  子大于父
                                //这里父类权限为默认，子类publc 大于父类，可以
        return "萝卜";
    }

    @Override
    public void sleep(){
        System.out.println("子类的睡觉");
    }

    public void print(){
        //在子类中的某一个方法中需要去调用父类中被覆盖的方法，此时得使用 super 关键字。
        super.sleep();
        sleep();
    }
}
